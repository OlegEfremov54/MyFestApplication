package com.example.myfestapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myfestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var editTextET: EditText
    private lateinit var textViewTV: TextView
    private lateinit var textViewCount: TextView
    private lateinit var buttonBTN: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R. layout. activity_main)

        editTextET=findViewById(R.id.edittextET)
        textViewTV=findViewById(R.id.textTV)
        textViewCount=findViewById(R.id.textViewCount)
        buttonBTN=findViewById(R.id.buttonBTN)

        onClickButton(buttonBTN)


    }
    fun onClickButton(view: View) {
        if (!editTextET.text.isNullOrEmpty()) {
            val char = editTextET.text.toString().toCharArray()
            char.reverse()
            var count = 0
            for (i in char) {
                if (i != ' ') {
                    count=count+1
                }
            }
            textViewCount.text = count.toString()
            textViewTV.text = char.concatToString()
        } else {
            val textEmpty = "Ничего не введено!"
            textViewTV.text = textEmpty
        }
    }
}