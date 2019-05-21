package com.example.customview


import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        inflate(context, R.layout.custom_view, this)

        val imageView: ImageView = findViewById(R.id.image)
        val editText: EditText = findViewById(R.id.caption)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.custom_view_component)
        imageView.setImageDrawable(attributes.getDrawable(R.styleable.custom_view_component_custom_view_image))
        editText.setTextColor(attributes.getColor(R.styleable.custom_view_component_custom_view_color, attributes.indexCount))
        attributes.recycle()
    }
}

