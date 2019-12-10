package goodguygregory.app.musictrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {

//    Adds variables for signup
    private lateinit var userEmail: EditText
    private lateinit var userPassword: EditText
    private lateinit var signUp: Button
    private lateinit var loginSwitch: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

//        login Creds:
        userEmail = findViewById(R.id.prompt_email)
        userPassword = findViewById(R.id.prompt_password)

//      Buttons:
        signUp = findViewById(R.id.action_signup)
        loginSwitch = findViewById(R.id.already_user_login)

        loginSwitch.setOnClickListener {
//            Start LoginActivity:
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
