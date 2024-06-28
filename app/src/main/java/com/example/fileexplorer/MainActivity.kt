package com.example.fileexplorer

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMusic = findViewById<ImageView>(R.id.btnMusic)

        btnMusic.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Music())
                .addToBackStack("Music BackStack")
                .commit()
        }
        val btnMore = findViewById<ImageView>(R.id.btnMore)
        btnMore.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,More())
                .addToBackStack("More BackStack")
                .commit()
        }
        val btnDownloads = findViewById<ImageView>(R.id.btnDownloads)
        btnDownloads.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Downloads())
                .addToBackStack("Downloads BackStack")
                .commit()
        }
        val btnFiles = findViewById<ImageView>(R.id.btnFiles)
        btnFiles.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Files())
                .addToBackStack("Files BackStack")
                .commit()
        }
        val btnImages = findViewById<ImageView>(R.id.btnGallery)
        btnImages.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Images())
                .addToBackStack("Images BackStack")
                .commit()
        }
//        val btnMoreVideo = findViewById<ImageView>(R.id.btnVideo)



        val btnVideos = findViewById<ImageView>(R.id.btnVideo)
        btnVideos.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Videos())
                .addToBackStack("Videos BackStack")
                .commit()
        }


    }
}
