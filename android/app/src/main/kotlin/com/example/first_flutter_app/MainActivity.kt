package com.example.first_flutter_app

import io.flutter.embedding.android.FlutterActivity
import com.clevertap.android.sdk.CleverTapAPI
import android.os.Bundle


class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CleverTapAPI.getDefaultInstance(applicationContext)
        CleverTapAPI.setDebugLevel(3)
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        //All initialization
//        CleverTapAPI.getDefaultInstance(applicationContext)
//        CleverTapAPI.setDebugLevel(3)
//
//    }

}
