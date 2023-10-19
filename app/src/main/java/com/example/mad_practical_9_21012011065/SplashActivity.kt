package com.example.mad_practical_9_21012011065

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView
import android.view.animation.AnimationUtils
import android.view.animation.Animation.AnimationListener

class SplashActivity : AppCompatActivity(),AnimationListener {
    lateinit var logonanimation: AnimationDrawable
    lateinit var twinAnimation: Animation
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val image: ImageView=findViewById(R.id.uvpce_logo)
        image.setBackgroundResource(R.drawable.uvpce_animation_list)
        logonanimation= image.background as AnimationDrawable
        twinAnimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        twinAnimation.setAnimationListener(this)
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            logonanimation.start()
            image.startAnimation(twinAnimation)
        }
        else{
            logonanimation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }
    override fun onAnimationEnd(p0: Animation?) {
        Intent(this,MainActivity::class.java).also { startActivity(it) }
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}