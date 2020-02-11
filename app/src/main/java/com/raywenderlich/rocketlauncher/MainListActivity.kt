package com.raywenderlich.rocketlauncher

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.raywenderlich.rocketlauncher.animationactivities.*
import java.util.*

class MainListActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_layout)

    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.layoutManager = android.support.v7.widget.LinearLayoutManager(this)

    val items = ArrayList<RocketAnimationItem>()

    items.add(RocketAnimationItem(getString(R.string.title_no_animation),
      Intent(this, NoAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_launch_rocket),
      Intent(this, LaunchRocketValueAnimatorAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_spin_rocket),
      Intent(this, RotateRocketAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_accelerate_rocket),
      Intent(this, AccelerateRocketAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_launch_rocket_objectanimator),
      Intent(this, LaunchRocketObjectAnimatorAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_color_animation),
      Intent(this, ColorAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.launch_spin),
      Intent(this, LaunchAndSpinAnimatorSetAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.launch_spin_viewpropertyanimator),
      Intent(this, LaunchAndSpinViewPropertyAnimatorAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_with_doge),
      Intent(this, FlyWithDogeAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_animation_events),
      Intent(this, WithListenerAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_there_and_back),
      Intent(this, FlyThereAndBackAnimationActivity::class.java)))

    items.add(RocketAnimationItem(getString(R.string.title_jump_and_blink),
      Intent(this, XmlAnimationActivity::class.java)))

    recyclerView.adapter = RocketAdapter(this, items)
  }
}
