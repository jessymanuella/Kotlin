package com.example.fragment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        val builder = AlertDialog.Builder(this)
        btn_launchA.setOnClickListener {
            builder.setMessage(R.string.text_display)
                .setPositiveButton(R.string.agree, DialogInterface.OnClickListener{
                        dialog,
                        id ->dialog.dismiss()
                })
                .setTitle(R.string.use_this_location)
                .setNegativeButton(R.string.disagree,
                    DialogInterface.OnClickListener { dialog, id ->dialog.dismiss()  })
            val alert = builder.create()
            alert.show()
        }

    }
}