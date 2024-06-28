package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Files : Fragment() {


//    instantiate
//    attach
//    create
//    createView
//    viewCreated ==> for bind data to the ui (like event listeners)
//    onActivityCreated() ==> when the host activity's onCreate() method has completed.
//    start
//    resume
//    pause
//    stop
//    destroyView
//    destroy
//    detach
//
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_files, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("On Attach")
    }
    override fun onStart() {
        super.onStart()
        println("On Start")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy")
    }
}