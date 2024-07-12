package com.example.cloudswatch.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Text
import com.example.cloudswatch.R

@Composable
fun Cat1Img1(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat1)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize() .absoluteOffset(0.dp, (-10).dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)
                .clickable { navController.navigate("cat2img1") }
        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img2(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat2)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)
                .clickable { navController.navigate("cat2img2") }
        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img3(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat3)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img4(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat4)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img5(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat5)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img6(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat6)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(d
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))

}

@Composable
fun Cat1Img7(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat7)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img8(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat8)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img9(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat9)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(10.dp))
    }
}

@Composable
fun Cat1Img10(mood1: String, navController: NavController) {
    val image = painterResource(R.drawable.cat10)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .padding(0.dp)

        )
        Text(text = mood1, fontSize = 12.sp, fontFamily = allanFamily, letterSpacing = 0.5.sp, modifier= Modifier.absoluteOffset(0.dp, (-25).dp))
        Spacer(Modifier.height(17.dp))
    }
}




#Test1

 
@Composable
fun Cat2Img1(navController: NavController) {
    val image = painterResource(R.drawable.cat1)
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding()
            .fillMaxSize()
    )
    {
        items(1) { i ->
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "anger",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "annoyance",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "contempt",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "disgust",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "irritation",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
        }
    }
}

@Composable
fun Cat2Img2(navController: NavController) {
    val image = painterResource(R.drawable.cat2)
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding()
            .fillMaxSize()
    )
    {
        items(1) { i ->
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "anxiety",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "embarrassment",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "fear",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "helpless",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "powerless",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "worry",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
        }
    }
}

@Composable
fun Cat2Img3(navController: NavController) {
    val image = painterResource(R.drawable.cat2)
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding()
            .fillMaxSize()
    )
    {
        items(1) { i ->
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "doubt",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "envy",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "frustration",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "guilt",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(0.dp)
                    .clickable { navController.popBackStack() }
            )
            Text(
                text = "shame",
                fontSize = 12.sp,
                fontFamily = allanFamily,
                letterSpacing = 0.5.sp,
                modifier = Modifier.absoluteOffset(0.dp, (-25).dp)
            )
            Spacer(Modifier.height(0.dp))
        }
    }
}