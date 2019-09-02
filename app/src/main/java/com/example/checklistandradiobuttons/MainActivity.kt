package com.example.checklistandradiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var  selectedRadioButton: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {

            selectedRadioButton  = findViewById(radioGroup!!.checkedRadioButtonId)

            val yourVote = selectedRadioButton?.text.toString()
            // display it as Toast to the user

            var checkBoxChoices: String? = ""

            if (cb1.isChecked) {
                checkBoxChoices += cb1.text.toString() + "\tYES"
            } else {
                checkBoxChoices += cb1.text.toString() + "\tNO"
            }

            if (cb2.isChecked) {
                checkBoxChoices += cb2.text.toString() + "\tYES"
            } else {
                checkBoxChoices += cb2.text.toString() + "\tNO"
            }

            if (cb3.isChecked) {
                checkBoxChoices += cb3.text.toString() + "\tYES"
            } else {
                checkBoxChoices += cb3.text.toString() + "\tNO"
            }

            if (cb4.isChecked) {
                checkBoxChoices += cb4.text.toString() + "\tYES"
            } else {
                checkBoxChoices += cb4.text.toString() + "\tNO"
            }

            // display it as Toast to the user

            Toast.makeText(
                this@MainActivity,
                "Selected Radio Button is: $yourVote\n\nCheckBox Choices:  $checkBoxChoices",
                Toast.LENGTH_LONG).show()
           // $yourVote
        }// END SETONCLICKLISTENER
    }// END ONCREATE METHOD
}
