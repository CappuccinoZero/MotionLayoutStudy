package com.example.motionlayoutstudy

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.drawerlayout.widget.DrawerLayout

class MotionDrawer @JvmOverloads constructor(
    context: Context,attributeSet: AttributeSet ?= null,attr:Int = 0):MotionLayout(context,attributeSet,attr),DrawerLayout.DrawerListener {
    private var listener:DrawerListener ?= null
    interface DrawerListener{
        fun onDrawerSlide(slideOffset: Float)
    }

    override fun onDrawerOpened(drawerView: View) {

    }

    override fun onDrawerClosed(drawerView: View) {

    }

    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        progress = slideOffset
        listener?.onDrawerSlide(slideOffset)
    }

    override fun onDrawerStateChanged(newState: Int) {
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? DrawerLayout)?.addDrawerListener(this)
    }

    fun setDrawerListener(listener:DrawerListener){
        this.listener = listener
    }
}