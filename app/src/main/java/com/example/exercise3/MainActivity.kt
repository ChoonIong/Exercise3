package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            textResult.text = "RM " + Calculate().toString()
        }

        buttonReset.setOnClickListener {
            spinnerAge.setSelection(0)
            radioGroup.clearCheck()
            checkSmokeYes.isChecked = false



        }

    }

    fun Calculate(): Double{


        return when(spinnerAge.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 +
                    (if(radioMale.isChecked) 50.00 else 0.0)+
                    (if(checkSmokeYes.isChecked) 100.00 else 0.0)
            2 -> 90.00 +
                    (if(radioMale.isChecked) 100.00 else 0.0)+
                    (if(checkSmokeYes.isChecked) 150.00 else 0.0)
            3 -> 120.00 +
                    (if(radioMale.isChecked) 150.00 else 0.0)+
                    (if(checkSmokeYes.isChecked) 200.00 else 0.0)
            4 -> 150.00 +
                    (if(radioMale.isChecked) 200.00 else 0.0)+
                    (if(checkSmokeYes.isChecked) 250.00 else 0.0)

            else -> 150.00 +
                    (if(radioMale.isChecked) 200.00 else 0.0)+
                    (if(checkSmokeYes.isChecked) 300.00 else 0.0)

        }


    }
}
