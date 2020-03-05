package com.example.appwebsites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web5)

        btvoltar.setOnClickListener { v: View? ->

            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent);

        }
        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true
        webview.settings.builtInZoomControls = true

        webview.loadUrl("https://www.magazineluiza.com.br/")
    }
}
