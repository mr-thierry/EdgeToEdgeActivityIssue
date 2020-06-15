package tdr.edgetoedgeactivityissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.halfbit.edgetoedge.edgeToEdge

class ActivityWithIssue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        edgeToEdge { }
    }
}