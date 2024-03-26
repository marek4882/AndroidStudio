package pl.wsei.pam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import pl.wsei.pam.lab01.Lab01Activity
import pl.wsei.pam.lab01.R

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

    }
    fun onClickMainBtnRunLab01(v: View){
        val intent = Intent(this, Lab01Activity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Lab01 CLicked", Toast.LENGTH_SHORT).show()
    }
    fun onClickMainBtnRunLab02(v: View){
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
    }

}

