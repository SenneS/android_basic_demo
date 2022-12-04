package be.senne.android_basic_demo

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import be.senne.android_basic_demo.ui.theme.Android_basic_demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
            /*
            Android_basic_demoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }*/
        }

        context = applicationContext

    }

    //kotlin's manier om iets op een statische manier aan een klasse te hangen.
    companion object {
        lateinit var context : Context
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_basic_demoTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            MainScreen()
        }
    }
}