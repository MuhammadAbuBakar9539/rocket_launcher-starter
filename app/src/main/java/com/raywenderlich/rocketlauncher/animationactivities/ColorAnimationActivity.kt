package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.support.v4.content.ContextCompat
import com.raywenderlich.rocketlauncher.R

class ColorAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val objectAnimator = ObjectAnimator.ofObject(
                frameLayout,
                "backgroundColor",
                ArgbEvaluator(),
                ContextCompat.getColor(this, R.color.background_from),
                ContextCompat.getColor(this, R.color.background_to)
        )

        objectAnimator.repeatCount = 1
        objectAnimator.repeatMode = ValueAnimator.REVERSE

        objectAnimator.duration = DEFAULT_ANIMATION_DURATION
        objectAnimator.start()
    }
}
