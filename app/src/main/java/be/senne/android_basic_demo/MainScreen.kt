package be.senne.android_basic_demo

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.util.Consumer
import androidx.lifecycle.viewmodel.compose.viewModel;
@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel = viewModel()
) {
    Column(modifier = modifier.padding(60.dp)){
        Button(
            shape = CircleShape,
            content = {Text("Button 1")},
            onClick = {
                Toast.makeText(MainActivity.context, "Clicked op button 1", Toast.LENGTH_SHORT).show()
        })
        Button(
            content = {Text("Button 2")},
            onClick = {
                Toast.makeText(MainActivity.context, "Clicked op button 2", Toast.LENGTH_SHORT).show()
        })

        val tabs = arrayOf("Tab 1", "Tab 2", "Tab 3s")

        NavigationBar(tabs, ::handlerTest)

    }

}

fun handlerTest(tab : String) {
    println("$tab has been selected.")
}

@Composable
fun NavigationBar(tabs: Array<String>, handlerFun: Consumer<String>) {
    TabRow(selectedTabIndex = 0) {
        tabs.forEach {
            Column(Modifier.clickable(onClick = { handlerFun.accept(it) })) {
                Text(it)
            }
        }
    }
}