package com.example.stockmarket
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // createBirthdayButton.setOnClickListener()

    }



    fun CreateBirthdayCard(view: android.view.View) {

        val name = nameInput.editableText.toString()

        Toast.makeText(this, "Entered Name Is $name", Toast.LENGTH_SHORT).show()


        val intent = Intent(this, BirthdayGreetingScreen2::class.java)
        intent.putExtra(BirthdayGreetingScreen2.NAME_EXTRA, name)
        startActivity(intent)

    }


}























