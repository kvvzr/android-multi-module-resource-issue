package net.twinkrun.mylibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MyLibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // When using layout ID existing in `app` module, the following error occurs.
        setContentView(R.layout.activity_main)

        // Error! java.lang.NoSuchFieldError: No static field aaa_unique_text_view
        val uniqueTextViewId = R.id.aaa_unique_text_view
    }
}
