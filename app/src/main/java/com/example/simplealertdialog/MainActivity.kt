package com.example.alertdialog

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.simplealertdialog.R
import com.example.simplealertdialog.SimpleAlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowDialog.setOnClickListener(View.OnClickListener {
            val alertDialog = SimpleAlertDialog(this@MainActivity)
            alertDialog.show(supportFragmentManager, "simple dialog")
            alertDialog.isCancelable = false
        })
    }
}