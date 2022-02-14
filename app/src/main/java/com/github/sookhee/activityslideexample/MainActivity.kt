package com.github.sookhee.activityslideexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.sookhee.activityslideexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent = Intent(this, SlideActivity::class.java)

        binding.btnSlideLeft.setOnClickListener {
            intent.putExtra("SLIDE_DIRECTION", 0)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter, R.anim.slide_left_exit)
        }

        binding.btnSlideRight.setOnClickListener {
            intent.putExtra("SLIDE_DIRECTION", 1)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_right_enter, R.anim.slide_right_exit)
        }

        binding.btnSlideUp.setOnClickListener {
            intent.putExtra("SLIDE_DIRECTION", 2)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_up_enter, R.anim.slide_up_exit)
        }

        binding.btnSlideDown.setOnClickListener {
            intent.putExtra("SLIDE_DIRECTION", 3)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_down_enter, R.anim.slide_down_exit)
        }
    }
}