package com.example.jetnews.ui.components

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetnews.ui.JetnewsDestinations
import com.example.jetnews.ui.theme.JetnewsTheme

class AppNavRailPreviewScreenShots {
    @Preview("Drawer contents")
    @Preview("Drawer contents (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Preview(
        name = "Drawer contents (landscape) (dark)",
        uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
    )
    @Composable
    fun PreviewAppNavRail() {
        JetnewsTheme {
            AppNavRail(
                currentRoute = JetnewsDestinations.HOME_ROUTE,
                navigateToHome = {},
                navigateToInterests = {},
            )
        }
    }
}