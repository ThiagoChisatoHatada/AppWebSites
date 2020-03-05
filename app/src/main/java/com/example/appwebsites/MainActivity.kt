package com.example.appwebsites

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btmercadolivre.setOnClickListener { v: View? ->



            var intent =Intent(this,WebActivity::class.java)

            startActivity(intent);

        }
        btbuscape.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity2::class.java)

            startActivity(intent);

        }
        bteBay.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity3::class.java)

            startActivity(intent);

        }
        btwebmotors.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity4::class.java)

            startActivity(intent);

        }
        btmagalu.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity5::class.java)

            startActivity(intent);

        }
        btnetShoes.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity6::class.java)

            startActivity(intent);

        }
        btamericanas.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity7::class.java)

            startActivity(intent);

        }
        btsubmarino.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity8::class.java)

            startActivity(intent);

        }
        btsobre.setOnClickListener { v: View? ->

            var intent =Intent(this,WebActivity9::class.java)

            startActivity(intent);

        }
    }

}