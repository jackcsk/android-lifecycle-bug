package com.jackcheung.android.lifecycle.bug

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        updateStatusButton?.setOnClickListener { tappedUpdateStatus() }
    }

    fun tappedUpdateStatus() {
        val status = lifecycle.currentState
        statusLabel?.text = status.name
    }
}
