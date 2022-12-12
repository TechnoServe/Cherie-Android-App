package org.technoserve.ethiopia.ui.navigation

import org.technoserve.ethiopia.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home: NavigationItem("home", R.drawable.ic_home, "Home")
    object Inference: NavigationItem("inference", R.drawable.ic_home, "Home")
    object Logs: NavigationItem("logs", R.drawable.ic_logs, "Saved Predictions")
    object Profile: NavigationItem("profile", R.drawable.ic_profile, "Profile")
}
