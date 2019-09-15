package com.example.motionlayoutstudy

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

class MotionToolbar @JvmOverloads constructor(context: Context,attrs:AttributeSet ?= null,defStyleAttr:Int = 0):MotionLayout(context,attrs,defStyleAttr),AppBarLayout.OnOffsetChangedListener {
    override fun onOffsetChanged(p0: AppBarLayout?, p1: Int) {
        progress = -p1 / p0?.totalScrollRange?.toFloat()!!
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
    }
}