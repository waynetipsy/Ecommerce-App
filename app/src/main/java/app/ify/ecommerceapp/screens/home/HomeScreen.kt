package app.ify.ecommerceapp.screens.home
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    Scaffold(
        topBar = {MyTopAppBar()},
        bottomBar = {BottomNavigationBar()}
    ){ paddingValues ->
        Column (modifier = Modifier.fillMaxSize( )) {
            // Search Section
            val searchQuery = remember { mutableStateOf("") }
            val focusManger = LocalFocusManager.current
            SearchBar(
                queue = searchQuery.value,
                onQueryChange = {searchQuery.value = it},
                onSearch = {
                    // Do the search Logic
                },
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            )

            // Search Result Section

            // Categories Section
            SectionTitle("Categories", "See All" ) {
                /* TODO() add navigation */
            }

            // Featured Products Section
            Spacer(modifier = Modifier.height(16.dp))
            SectionTitle("Featured", "See All") {
                /* TODO() add navigation */
            }
        }
    }
}