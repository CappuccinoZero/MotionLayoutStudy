package com.example.motionlayoutstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val dimension = resources.getDimension(R.dimen.drawer_width)
        drawer.setDrawerListener(object :MotionDrawer.DrawerListener{
            override fun onDrawerSlide(slideOffset: Float) {
                coordinatorLayout.translationX = dimension * slideOffset
            }

        })
    }
}
