package tdr.edgetoedgeactivityissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.halfbit.edgetoedge.EdgeToEdgeBuilder

class ActivityWithFix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        EdgeToEdgeBuilder(findViewById(android.R.id.content), window).build()
    }
}