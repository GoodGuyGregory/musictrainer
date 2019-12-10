package goodguygregory.app.musictrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val progressions = Progressions()

//    Declare Variables
    private var generateProgressionButton: Button? = null
    private var keySignatureValue: TextView? = null
    private var progressionTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Assign View Items from the Layout file to the Corresponding Variables

//       key signature values for the user
        keySignatureValue = findViewById(R.id.keySignatureValue)

//      values for the chord progression
        progressionTextView = findViewById(R.id.progressionTextView)

//      generates another Progression for the user
        generateProgressionButton = findViewById(R.id.generateProgressionButton)



        generateProgressionButton!!.setOnClickListener {

        }
    }
}
