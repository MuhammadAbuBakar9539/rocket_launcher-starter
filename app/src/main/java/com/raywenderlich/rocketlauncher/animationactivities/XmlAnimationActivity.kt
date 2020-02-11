package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.raywenderlich.rocketlauncher.R

class XmlAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val rocketAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
        rocketAnimatorSet.setTarget(rocket)

        val dogeAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
        dogeAnimatorSet.setTarget(doge)

        val bothAnimatorSet = AnimatorSet()
        bothAnimatorSet.playTogether(rocketAnimatorSet, dogeAnimatorSet)
        bothAnimatorSet.duration = DEFAULT_ANIMATION_DURATION
        bothAnimatorSet.start()

    }
}
