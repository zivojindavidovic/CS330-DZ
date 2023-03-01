package rs.com.metropolitan.student1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import rs.com.metropolitan.student1.ui.theme.Student1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Student1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Student("Zivojin")
                }
            }
        }
    }
}

@Composable
fun Student(name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Hello $name!")
        Button(onClick = {

        }) {
            Text(text = "Ok")
        }
        Button(onClick = {

        }) {
            Text(text = "Cancel")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Student1Theme {
        Student("Android")
    }
}