package com.raywenderlich.rocketlauncher.animationactivities

class LaunchAndSpinViewPropertyAnimatorAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {
        rocket.animate()
                .translationY(-screenHeight)
                .rotationBy(360f)
                .setDuration(DEFAULT_ANIMATION_DURATION)
                .start()
    }
}
