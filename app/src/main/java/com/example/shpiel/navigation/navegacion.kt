import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shpiel.presentation.catalogo.screens.CatalogoScreen
import com.example.shpiel.presentation.foro.components.foroFields

@Composable
fun navegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "principal") {
        composable("princinpal") {
            // Composable for the first screen
            CatalogoScreen()
        }
        composable("foro") {
            // Composable for the second screen
            foroFields()
        }
        // Define more composables for additional screens
    }
}
