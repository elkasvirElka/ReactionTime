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
    var curr_color = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: " + System.nanoTime().toString())

        // forAnimation()
        // firstTimeWorks()
        // secondCase()
        // secondCase()

        button.setOnClickListener {
            // text_view.visibility = View.VISIBLE
            //text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }
        Choreographer.getInstance().postFrameCallback(this)
       /* Choreographer.getInstance().postFrameCallback {
            Log.e(TAG, "postFrameCallback: $it")
        }*/
      //  mainLooper.

       // doFrameCus()
    }

    override fun doFrame(frameTime: Long) {
        Log.e(TAG, "Frame s: "+ System.nanoTime())
        Log.e(TAG, "Frame f: $frameTime")
        setColor()
        text_view.text = frameTime.toString().plus(" ").plus(curr_color)
        Choreographer.getInstance().postFrameCallback(this)
    }



    private fun setColor(){
      if(curr_color == "black"){
          curr_color = "white"
          container.background = getDrawable(R.drawable.img_cat_mouse)
          //put time
      }else {
          curr_color = "black"
          container.background = getDrawable(R.drawable.ic_lighthouse)
      }
    }


    private fun secondCase() {
        val vto: ViewTreeObserver = text_view.viewTreeObserver
        vto.addOnDrawListener {
            Log.e(TAG, "viewTreeObserver: " + System.currentTimeMillis().toString())
            // Do whatever you need to do...
        }
    }


    private fun firstTimeWorks() {
        container.post {
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


}