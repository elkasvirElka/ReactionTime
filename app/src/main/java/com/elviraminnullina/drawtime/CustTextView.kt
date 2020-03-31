package com.elviraminnullina.drawtime

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatTextView


//The best way but will need to rewtite all views:(
class CustTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    AppCompatTextView(context, attrs, defStyleAttr) {

    private val TAG = "TEST"
    override fun onDraw(canvas: Canvas?) {
        Log.e(TAG, System.currentTimeMillis().toString())
        super.onDraw(canvas)
    }

}