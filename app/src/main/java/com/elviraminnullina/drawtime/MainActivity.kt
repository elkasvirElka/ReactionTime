package com.elviraminnullina.drawtime

import android.content.Context
import android.graphics.Canvas
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val TAG = "TEST"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val vto: ViewTreeObserver = text_view.viewTreeObserver
       /* vto.addOnDrawListener {
            Log.e(TAG, System.currentTimeMillis().toString())
            // Do whatever you need to do...
        }
*/
        //firstTimeWorks()

        /* Log.e(TAG, container.drawingTime.toString())
         Log.e(TAG, text_view.drawingTime.toString())


         button.setOnClickListener{
             text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimary))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimary))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimary))
             Log.e(TAG, text_view.drawingTime.toString())
             text_view.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
             Log.e(TAG, text_view.drawingTime.toString())
         }
 */
        button.setOnClickListener {
            // text_view.visibility = View.VISIBLE
             text_view.setBackgroundColor(resources.getColor(R.color.colorAccent))
            /*
             text_view.setTextColor(resources.getColor(R.color.colorPrimaryDark))
             text_view.setTextColor(resources.getColor(R.color.colorAccent))
             text_view.setTextColor(resources.getColor(R.color.colorPrimaryDark))
             text_view.setTextColor(resources.getColor(R.color.colorAccent))*/
        }
    }

    private fun firstTimeWorks() {
        text_view.post(Runnable {
            kotlin.run {
                Log.e(TAG, System.currentTimeMillis().toString())
            }
        })
    }
}

