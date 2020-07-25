package com.example.codechallengeapps

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.codechallengeapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val viewing = mainBinding.root
        setContentView(viewing)

        val titleFont: Typeface = Typeface.createFromAsset(assets, "fonts/trulymadly.ttf")
        val subFont: Typeface = Typeface.createFromAsset(assets, "fonts/bubbleboddyextralight.ttf")

        mainBinding.btnStart.setOnClickListener {
            startActivity(Intent(applicationContext,GameActivity::class.java))
        }

        mainBinding.btnExit.setOnClickListener {
            closeApps(titleFont,subFont)
        }

    }

    private fun closeApps(titleFont: Typeface, subFont: Typeface) {

        val dialogBuilder = AlertDialog.Builder(this)

        dialogBuilder.setMessage(R.string.message)
            .setCancelable(false)
            .setPositiveButton("Yes",DialogInterface.OnClickListener { _, _ -> finish() })
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog,
                    _ -> dialog.cancel()
            })

        val alert = dialogBuilder.create()
        alert.setTitle("Want to Exit")
        alert.show()

        val view: Window? = alert.window
        val title: TextView = view!!.findViewById(R.id.alertTitle)
        val message: TextView = view.findViewById(android.R.id.message)
        val btnPostive: Button = view.findViewById(android.R.id.button1)
        val btnNegative: Button = view.findViewById(android.R.id.button2)

        title.typeface = titleFont
        message.typeface = subFont
        btnPostive.typeface = titleFont
        btnNegative.typeface = titleFont

        title.setTextColor(Color.parseColor("#060607"))
        message.setTextColor(Color.parseColor("#2e2e2e"))
        btnPostive.setTextColor(Color.parseColor("#ffffff"))
        btnPostive.setBackgroundResource(R.drawable.btn_exit_selector)
        btnNegative.setTextColor(Color.parseColor("#ffffff"))
        btnNegative.setBackgroundResource(R.drawable.btn_background_selector)

        val params:LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(0,0,20,0)
        btnNegative.layoutParams = params
    }
}