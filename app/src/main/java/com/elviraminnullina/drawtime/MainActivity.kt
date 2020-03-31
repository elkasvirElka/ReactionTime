package com.elviraminnullina.drawtime

import android.os.Bundle
import android.util.Log
import android.view.Choreographer
import android.view.ViewTreeObserver
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Choreographer.FrameCallback {

    private val TAG = "TEST"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: " + System.currentTimeMillis().toString())

        // forAnimation()
        // firstTimeWorks()
        // secondCase()
        secondCase()

        button.setOnClickListener {
            // text_view.visibility = View.VISIBLE
            text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))

            text_view.setTextColor(resources.getColor(R.color.colorPrimaryDark))
            text_view.setTextColor(resources.getColor(R.color.colorAccent))
            text_view.setTextColor(resources.getColor(R.color.colorPrimaryDark))
            text_view.setTextColor(resources.getColor(R.color.colorAccent))
        }
    }

    private fun secondCase() {
        val vto: ViewTreeObserver = container.viewTreeObserver
        vto.addOnDrawListener {
            Log.e(TAG, "viewTreeObserver: " + System.currentTimeMillis().toString())
            // Do whatever you need to do...
        }
    }


    private fun firstTimeWorks() {
        text_view.post {
            kotlin.run {
                Log.e(TAG, System.currentTimeMillis().toString())
            }
        }
    }

    private fun forAnimation() {
        val am1 = AnimationUtils.loadAnimation(applicationContext, R.anim.my_anim)

        container.startAnimation(am1)
        am1.setAnimationListener(object : AnimationListener {
            override fun onAnimationStart(animation: Animation) { // TODO Auto-generated method stub
            }

            override fun onAnimationRepeat(animation: Animation) { // TODO Auto-generated method stub
            }

            override fun onAnimationEnd(animation: Animation) { // Pass the Intent to switch to other Activity

                Log.e(TAG, "anim: " + System.currentTimeMillis().toString())
            }
        })
    }


    override fun doFrame(frameTimeNanos: Long) {
        Log.e(TAG, "Frame: " + frameTimeNanos.toString())
    }
}

