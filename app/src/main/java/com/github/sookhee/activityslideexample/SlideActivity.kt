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
            0 -> this.slideRight()
            1 -> this.slideLeft()
            2 -> this.slideDown()
            3 -> this.slideUp()
        }
    }
}