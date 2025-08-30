package org.example.commoncomposable.components.display_composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TextDemo() {

   val annotatedString = buildAnnotatedString {
       withStyle(SpanStyle(color = Color.Green, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline)){
           append("This is green Text")
       }

       withStyle(SpanStyle(color = Color.Magenta, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.LineThrough)){
           append("This is Line Through Text")
       }
   }

    Scaffold(containerColor = Color.White) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Column {
                Text(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    letterSpacing = 4.sp,
                    textDecoration = TextDecoration.LineThrough,
                    )
                Text(annotatedString)
            }
        }
    }
}


@Preview
@Composable
fun TextDemoPreview() {
    Scaffold(containerColor = Color.White) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) { TextDemo() }
    }

}
