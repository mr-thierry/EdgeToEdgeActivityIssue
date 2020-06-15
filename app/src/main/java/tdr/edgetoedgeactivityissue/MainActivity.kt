package tdr.edgetoedgeactivityissue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIssue.setOnClickListener {
            startActivity(Intent(this, ActivityWithIssue::class.java))
        }

        buttonFix.setOnClickListener {
            startActivity(Intent(this, ActivityWithFix::class.java))
        }
    }
}