package com.github.sookhee.activityslideexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SlideActivity : AppCompatActivity() {
    private var slideDirection: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)

        slideDirection = intent.getIntExtra("SLIDE_DIRECTION", -1)
    }

    override fun onBackPressed() {
        super.onBackPressed()

        when (slideDirection) {
            0 -> overridePendingTransition(R.anim.slide_right_enter, R.anim.slide_right_exit)
            1 -> overridePendingTransition(R.anim.slide_left_enter, R.anim.slide_left_exit)
            2 -> overridePendingTransition(R.anim.slide_down_enter, R.anim.slide_down_exit)
            3 -> overridePendingTransition(R.anim.slide_up_enter, R.anim.slide_up_exit)
        }
    }
}