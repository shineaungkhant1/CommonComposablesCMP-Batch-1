package org.example.commoncomposable.components.display_composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.compose.SubcomposeAsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import commoncomposablescmp_batch_1.composeapp.generated.resources.Res
import commoncomposablescmp_batch_1.composeapp.generated.resources.error
import commoncomposablescmp_batch_1.composeapp.generated.resources.place_holder
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun ImageDemo(){
//    AsyncImage(
//        model = "https://4kwallpapers.com/images/walls/thumbs_2t/23652.jpg",
//        contentDescription = "This is network Image",
//        placeholder = painterResource(Res.drawable.place_holder),
//        error = painterResource(Res.drawable.error),
//        modifier = Modifier.width(100.dp).height(150.dp),
//        contentScale = ContentScale.Crop
//    )

    SubcomposeAsyncImage(
        model = ImageRequest.Builder(LocalPlatformContext.current).data(
            "https://4kwallpapers.com/images/walls/thumbs_2t/19746.jpg",
        ).crossfade(3000).build(),
//        model = "https://4kwallpapers.com/images/walls/thumbs_2t/19746.jpg",
        loading = {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
                CircularProgressIndicator()
            }
        },
        contentDescription = "This is SubcomposeAsyncImage",
        error = {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
                Text("This is error loading", color = Color.Red)
            }
        },
        modifier = Modifier.width(200.dp).height(250.dp)
    )
}


@Preview()
@Composable
fun ImageDemoPreview(){
    ImageDemo()
}