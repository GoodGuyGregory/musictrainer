package goodguygregory.app.musictrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

//    Creates Variables for the activity:
    private lateinit var loginEmail: EditText
    private lateinit var loginPassword: EditText
    private lateinit var loginButton: Button
    private lateinit var signUpText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginEmail = findViewById(R.id.login_email)
        loginPassword = findViewById(R.id.login_password)
        loginButton = findViewById(R.id.action_sign_in)
        signUpText = findViewById(R.id.not_user_register)


        loginButton.setOnClickListener{
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()

        }

        signUpText.setOnClickListener {
//            Start Signup Activity:
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
