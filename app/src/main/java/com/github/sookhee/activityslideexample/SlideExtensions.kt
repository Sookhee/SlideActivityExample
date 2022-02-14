package com.github.sookhee.activityslideexample

import android.app.Activity

/**
 *  SlideExtensions.kt
 *
 *  Created by Minji Jeong on 2022/02/14
 *  Copyright © 2022 Shinhan Bank. All rights reserved.
 */

fun Activity.slideLeft() {
    overridePendingTransition(R.anim.slide_left_enter, R.anim.slide_left_exit)
}

fun Activity.slideRight() {
    overridePendingTransition(R.anim.slide_right_enter, R.anim.slide_right_exit)
}

fun Activity.slideUp() {
    overridePendingTransition(R.anim.slide_up_enter, R.anim.slide_up_exit)
}

fun Activity.slideDown() {
    overridePendingTransition(R.anim.slide_down_enter, R.anim.slide_down_exit)
}
