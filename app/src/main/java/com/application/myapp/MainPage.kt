package com.application.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainPage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val edtAge = findViewById<EditText>(R.id.edtAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnBack = findViewById<Button>(R.id.btnBack)


        btnGenerate.setOnClickListener {
            val age = edtAge.toString().toInt()

            if (age < 20 || age > 100) {                //if statement to check if the given value(input) is within range set.
                tvResult.text = "Please enter age within the range of 20 to 100"
            }

            //Code Attribution
            // This method was taken from stackoverflow
            // https://stackoverflow.com/questions/53138172/how-to-implement-switch-case-statement-in-kotlin
            // navylover
            // https://stackoverflow.com/users/1753073/navylover


            when (age) {                                          // When (Case Statement) that matches the values given by user to those declared in the code
                // and produces an output in the form of text.
                in 0..19 -> { tvResult.text = "Please enter age within the range of 20 to 100"
                }
                in 101..200 -> { tvResult.text = "Please enter age within the range of 20 to 100"
                }
                in 200..500 ->{tvResult.text = "Please enter a more realistic age. Thank you :)"}
                28 -> { tvResult.text = "You are the same age as Heath Ledger. Heath Ledger was an Australian actor ." +
                                "Best known for his portrayal of 'Joker' in the Dark Knight."
                }
                30 -> { tvResult.text = "You are the same age as Steve Bantu Biko. Steve Biko was the founder of the Black Consciousness Movement"
                }
                39 -> { tvResult.text = "You are the same age as Martin Luther King jr. Martin Luther King jr was an American Christian Minister " +
                                "and political philosopher."
                }
                43 -> { tvResult.text = "You are the same age as Chadwick Boseman. Chadwick Boseman was an American actor well-known" +
                                "for his portrayal of King T'Challa/Black Panther."
                }
                47 -> { tvResult.text = "You are the same age as Shona Ferguson. Shona Ferguson was a Motswana actor, executive producer and co-founder " +
                                "of Ferguson Films based in South Africa."
                }
                50 -> { tvResult.text = "You are the same age as Micheal Jackson. Micheal Jackson was an American singer, songwriter" +
                                ", songwriter and dancer. Regarded as the King of Pop."
                }
                69 -> { tvResult.text = "You are the same age as Leonardo De Vinci. De Vinci was an italian artist." +
                                "Famous for his paintings notably the Monalisa and the Last Supper"
                }
                86 -> { tvResult.text = "You are the same age as Maya Angelou. Maya Angelou was a world famous author, activist, singer" +
                                ",poet, dancer and scholar."
                }
                88 -> { tvResult.text = "You are the same age as Sir Charlie Chaplin. Charlie Chaplin was an English comic actor," +
                                "filmmaker and composer."
                }

                else -> {
                    tvResult.text =
                        "Sorry :) There is currently no icon in our database that matches your age."  //else statement that returns a text if the value
                    // given does not match any of the declared values
                }


            }

        }
        //Code Attribution
        //This method was taken from stackoverflow
        //https://stackoverflow.com/questions/9037605/how-i-can-clear-the-value-of-textview
        //Jake Wilson
        //https://stackoverflow.com/users/172350/jake-wilson

        btnClear.setOnClickListener {                     // Clears the editText and TextView which hold values
            edtAge.clear()
            tvResult.setText(null)


        }
        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
