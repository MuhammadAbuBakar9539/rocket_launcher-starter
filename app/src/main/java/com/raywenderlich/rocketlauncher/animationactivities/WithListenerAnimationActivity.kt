package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListenerAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)

        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        animator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                Toast.makeText(applicationContext, "Doge took off", Toast.LENGTH_SHORT)
                        .show()
            }

            override fun onAnimationEnd(animation: Animator) {
                Toast.makeText(applicationContext, "Doge is on the moon", Toast.LENGTH_SHORT)
                        .show()
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {}

            override fun onAnimationRepeat(animation: Animator) {}
        })

        animator.duration = 5000L
        animator.start()
    }
}
