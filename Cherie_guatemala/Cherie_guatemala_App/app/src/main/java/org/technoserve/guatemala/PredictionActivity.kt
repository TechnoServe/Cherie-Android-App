package org.technoserve.guatemala

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.technoserve.guatemala.ui.screens.PredictionScreen
import org.technoserve.guatemala.ui.theme.CherieTheme

class PredictionActivity : ComponentActivity() {
    private val imageAsByteArray by lazy {
        intent.getByteArrayExtra(IMAGE) as ByteArray
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        setContent {
            CherieTheme {
                PredictionScreen(imageAsByteArray=imageAsByteArray)
            }
        }
    }

    companion object {
        const val IMAGE = "image"

        fun newIntent(context: Context, imageAsByteArray: ByteArray) =
            Intent(context, PredictionActivity::class.java).apply {
                putExtra(IMAGE, imageAsByteArray)
            }
    }
}
