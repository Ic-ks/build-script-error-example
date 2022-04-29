import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlin.system.exitProcess

@Composable
fun App() {
    MaterialTheme {
        Column {
            Text("App", modifier = Modifier.size(100.dp))
        }
    }
}

fun main() = application {
    Window(
        resizable = true,
        state = rememberWindowState(size = DpSize(Dp.Unspecified, Dp.Unspecified)),
        onCloseRequest = { exitProcess(0) }
    ) {
        App()
    }
}
