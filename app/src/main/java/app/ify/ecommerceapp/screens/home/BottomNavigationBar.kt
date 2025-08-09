package app.ify.ecommerceapp.screens.home

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationBar(){

  val currentRoute = ""

  val items = listOf(
    BottomNavItem(
      title = "Home",
      icon = Icons.Default.Home,
      route = "Home"
    ),

    BottomNavItem(
      title = "Categories",
      icon = Icons.Default.ShoppingCart,
      route = "Cart",
    ),

    BottomNavItem(
      title = "WishList",
      icon = Icons.Default.Favorite,
      route = "Cart",
      badgeCount = 5
    ),

    BottomNavItem(
      title = "Cart",
      icon = Icons.Default.ShoppingCart,
      route = "Cart",
      badgeCount = 3
    ),

    BottomNavItem(
      title = "Profile",
      Icons.Default.Person,
      "Profile"
    )
  )

  NavigationBar (
    modifier = Modifier.height(82.dp),
    containerColor = Color.White,
    tonalElevation = 8.dp
    ) {
    items.forEach { item ->
      NavigationBarItem(
        icon = {
          // icons with badge
          if (item.badgeCount > 0) {
            BadgedBox(badge = { Badge { Text(item.badgeCount.toString()) } }) {
              Icon(
                imageVector = item.icon,
                contentDescription = item.title,
                modifier = Modifier.size(24.dp)
              )
            }
          }
          // icons without badge
          else {
            Icon(
              imageVector = item.icon,
              contentDescription = item.title,
              modifier = Modifier.size(24.dp)
            )
          }
        },
        label = {Text(item.title)},
        selected = currentRoute == item.route,
        onClick = TODO()
      )
    }
  }
}

data class BottomNavItem(
  val title: String,
  val icon : ImageVector,
  val route: String,
  val badgeCount : Int = 0
)