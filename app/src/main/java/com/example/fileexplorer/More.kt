package com.example.fileexplorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class More : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_more, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnVideos = view.findViewById<ImageView>(R.id.btnVideosMore)
        btnVideos.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Videos())
                .addToBackStack("Videos More BackStack")
                .commit()
        }

        val btnImages = view.findViewById<ImageView>(R.id.btnGalleryMore)
        btnImages.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Images())
                .addToBackStack("Gallery More BackStack")
                .commit()
        }

        val btnDownloads = view.findViewById<ImageView>(R.id.btnDownloadsMore)
        btnDownloads.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Downloads())
                .addToBackStack("Downloads More BackStack")
                .commit()
        }

        val btnMusic = view.findViewById<ImageView>(R.id.btnMusicMore)
        btnMusic.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Music())
                .addToBackStack("Music More BackStack")
                .commit()
        }

        val btnFiles = view.findViewById<ImageView>(R.id.btnFilesMore)
        btnFiles.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Files())
                .addToBackStack("Files More BackStack")
                .commit()
        }

        val btnScreenShot = view.findViewById<ImageView>(R.id.btnScreenShot)
        btnScreenShot.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentScreenshot())
                .addToBackStack("ScreenShot More BackStack")
                .commit()
        }

        val btnBluetooth = view.findViewById<ImageView>(R.id.btnBluetooth)
        btnBluetooth.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentBluetooth())
                .addToBackStack("Bluetooth More BackStack")
                .commit()
        }
        val btnArchive = view.findViewById<ImageView>(R.id.btnArchive)
        btnArchive.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentArchive())
                .addToBackStack("Archive More BackStack")
                .commit()
        }
        val btnAPK = view.findViewById<ImageView>(R.id.btnApk)
        btnAPK.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentAPK())
                .addToBackStack("APK More BackStack")
                .commit()
        }
    }


}