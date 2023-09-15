package com.ishanvohra.exoplayerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.ishanvohra.exoplayerdemo.adapter.PlayerFragmentAdapter

class MainActivity : AppCompatActivity() {

    private var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager2)

        val mediaList = ArrayList<String>()
        mediaList.add("https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8")
        mediaList.add("https://17dd-118-70-15-36.ngrok.io/live.m3u8")
        val adapter = PlayerFragmentAdapter(this, mediaList)
        viewPager?.adapter = adapter

        //set orientation to vertical
        viewPager?.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}