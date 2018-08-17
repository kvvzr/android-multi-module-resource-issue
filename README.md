## Issue

```kotlin
class MyLibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // When using a layout ID that already exists in the 'app' module, the following error occurs.
        setContentView(R.layout.activity_main)

        // Runtime error! java.lang.NoSuchFieldError: No static field aaa_unique_text_view
        val uniqueTextViewId = R.id.aaa_unique_text_view
    }
}
```

`aaa_unique_text_view` is generated in the R.java file.

![](https://i.gyazo.com/7a95fbb552cf8cd814456a847bb4d1de.png)

However, there is no field of `aaa_unique_text_view` in dex.

![](https://i.gyazo.com/7e5864c443ea840e799a090151503906.png)

## Workaround

Rename layout ID in `mylibrary` module to a unique ID.

