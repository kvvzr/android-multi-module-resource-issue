package net.twinkrun.multimoduleresource

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import net.twinkrun.mylibrary.MyLibraryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, MyLibraryActivity::class.java))
    }
}
