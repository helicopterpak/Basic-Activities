package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val button: Button = findViewById(R.id.openAFromC)
        button.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.openDFromC)
        button2.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)//.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finishAffinity()
        }

        val button3: Button = findViewById(R.id.closeC)
        button3.setOnClickListener {
            finish()
        }

        val button4: Button = findViewById(R.id.closeStack)
        button4.setOnClickListener {
            finishAffinity()
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
    }
}