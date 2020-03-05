package com.example.appwebsites

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web.*
import kotlinx.android.synthetic.main.activity_web.btvoltar
import kotlinx.android.synthetic.main.activity_web9.*

class WebActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web9)



        btvoltar.setOnClickListener { v: View? ->

            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent);

        }
        btApagar.setOnClickListener { v: View? ->

        }

    }
}
