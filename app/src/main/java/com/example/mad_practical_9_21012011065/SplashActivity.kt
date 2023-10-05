package com.example.mad_practical_9_21012011065

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    lateinit var logonanimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val image: ImageView=findViewById(R.id.uvpce_logo)
        image.setBackgroundResource(R.drawable.uvpce_animation_list)
        logonanimation= image.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            logonanimation.start()
        }
        else{
            logonanimation.stop()
        }
    }

}