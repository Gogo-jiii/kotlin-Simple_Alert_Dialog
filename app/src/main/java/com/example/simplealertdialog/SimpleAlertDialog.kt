package com.example.simplealertdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class SimpleAlertDialog(private val _context: Context) : DialogFragment() {

    private var builder: AlertDialog.Builder? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        builder = AlertDialog.Builder(_context)
        builder!!.setMessage("Simple Alert Dialog")
        builder!!.setPositiveButton("OK") { dialogInterface, i ->
            dialogInterface.dismiss()
            Toast.makeText(context, "Dismissed.", Toast.LENGTH_SHORT).show()
        }
        builder!!.setNegativeButton("CANCEL") { dialogInterface, i ->
            dialogInterface.dismiss()
            Toast.makeText(context, "Cancelled.", Toast.LENGTH_SHORT).show()
        }
        return builder!!.create()
    }
}