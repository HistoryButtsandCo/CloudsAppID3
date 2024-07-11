/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.cloudswatch.presentation
import androidx.compose.foundation.Image
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Canvas
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.input.rotary.onRotaryScrollEvent
import androidx.compose.ui.layout.ContentScale.Companion.FillBounds
import androidx.compose.ui.layout.ContentScale.Companion.FillHeight
import androidx.compose.ui.layout.ContentScale.Companion.Fit
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.foundation.ExperimentalWearFoundationApi
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.foundation.rememberActiveFocusRequester
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonColors
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.placeholder
import com.example.cloudswatch.R
import com.example.cloudswatch.presentation.theme.CloudsWatchTheme
import kotlinx.coroutines.launch
import java.lang.Integer.toString
import kotlin.io.path.Path

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()


        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContent {
            
            BackgroundIMG()
            HomeScreen()
        }
    }
}

val allanFamily = FontFamily(
    Font(R.font.allan, FontWeight.Normal)
)



@Composable
fun BackgroundIMG(): Unit {
    val image2 = painterResource(R.drawable.backgroundgrid)
    Image(
        painter = image2,
        contentDescription = null,
        modifier = Modifier
    )
}

@Composable
fun Cat1ImgList(navController: NavController) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding()
            .fillMaxSize()
    )
    {
        items(1) { i ->
            Cat1Img1(mood1 = "Negative and Forceful", navController = navController)
            Cat1Img2(mood1 = "Negative and Not In Control", navController = navController)
            Cat1Img3(mood1 = "Negative Thoughts", navController = navController)
            Cat1Img4(mood1 = "Negative and Passive", navController = navController)
            Cat1Img5(mood1 = "Agitation", navController = navController)
            Cat1Img6(mood1 = "Positive and Lively", navController = navController)
            Cat1Img7(mood1 = "Caring", navController = navController)
            Cat1Img8(mood1 = "Positive Thoughts", navController = navController)
            Cat1Img9(mood1 = "Quiet Positive", navController = navController)
            Cat1Img10(mood1 = "Reactive", navController = navController)
        }
    }
}

@Composable
fun Wearapp(navController: NavController) {
    val image = painterResource(R.drawable.entermoodtext)
    var screennum by remember {
        mutableIntStateOf(0)
    }
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize())
    {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.height(25.dp)
            )

        Box() {
                Cat1ImgList(navController = navController)
        }
    }
}

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first_Screen") {
        composable("first_Screen") {
            Wearapp(navController = navController)
        }
        composable("cat2img1") {
            Cat2Img1(navController = navController)
        }
        composable("cat2img2") {
            Cat2Img2(navController = navController)
        }
        composable("cat2img3") {
            Cat2Img3(navController = navController)
        }
    }
}