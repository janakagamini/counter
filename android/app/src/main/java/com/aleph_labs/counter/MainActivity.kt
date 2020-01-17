package com.aleph_labs.counter

import android.content.DialogInterface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        counter.text = count.toString()

        incrementButton.setOnClickListener {
            count++
            counter.text = count.toString()
            if (count % 5 == 0) {
                val dialog = AlertDialog.Builder(this)
                    .setMessage("Reset?")
                    .setPositiveButton(
                        "Yes"
                    ) { _, _ ->
                        count = 0
                        counter.text = count.toString()
                    }
                    .setNegativeButton("No", null)
                    .setCancelable(false)
                    .create()

                dialog.show()

                dialog.getButton(DialogInterface.BUTTON_POSITIVE).contentDescription = "yes"
                dialog.getButton(DialogInterface.BUTTON_POSITIVE).contentDescription = "no"
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
