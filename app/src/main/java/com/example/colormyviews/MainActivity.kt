package com.example.colormyviews

import android.R.*
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListner()
    }

    private fun setListner() {
        val clickableView: List<View> = listOf(
            box_one, box_two_text, box_three_text, box_four_text, box_five_text,
            constraint_layout,
            red_button, yellow_button, green_button
        )

        for (item in clickableView) {
            item.setOnClickListener { makeColor(it) }
        }
    }

    private fun makeColor(view: View) {
        when (view.id) {
            //Boxes using color class colors
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(color.holo_green_light)

            //Boxes using Custom color for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}
