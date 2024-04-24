package com.getir.patika.finalproject

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class HomePage : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private val imageList = listOf(R.drawable.indir, R.drawable.photo2, R.drawable.photo1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        /*val imageCarousel = findViewById<ImageView>(R.id.image_carousel)
        val imageResource = R.drawable.photo2

        imageCarousel.setImageResource(imageResource)

        imageCarousel.setBackgroundResource(R.drawable.rounded_corners)

        imageCarousel.clipToOutline = true*/
    }
}
