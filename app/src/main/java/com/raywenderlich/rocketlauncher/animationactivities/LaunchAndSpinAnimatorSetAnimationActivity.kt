package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class LaunchAndSpinAnimatorSetAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }

        val rotationAnimator = ObjectAnimator.ofFloat(rocket, "rotation", 0f, 180f)
        val animatorSet = AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAULT_ANIMATION_DURATION
        animatorSet.start()

    }
}
