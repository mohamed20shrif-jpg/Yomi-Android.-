package com.yomi.app

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(30, 30, 30, 30)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "يومي"
            textSize = 32f
            setTextColor(Color.rgb(25, 90, 180))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "تنظيم المهام والعمليات اليومية"
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
