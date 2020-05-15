package com.ferdyhaspin.myfirstunittesting.broadcastreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferdyhaspin.myfirstunittesting.R
import kotlinx.android.synthetic.main.activity_broadcast.*

class BroadcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        btn_permission.setOnClickListener {

        }
    }
}
