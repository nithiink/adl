
// import androidx.appcompat.app.AppCompatActivity;
// import android.graphics.Color;
// import android.graphics.Typeface;
// import android.os.Bundle;
// import android.widget.Button;
// import android.widget.EditText;
// import android.widget.TextView;

// public class MainActivity extends AppCompatActivity {

//     private EditText inputText;
//     private Button submitButton;
//     private TextView displayText;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         inputText = findViewById(R.id.input_text);
//         submitButton = findViewById(R.id.submit_button);
//         displayText = findViewById(R.id.display_text);

//         // Set font for the display text
//         Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
//         displayText.setTypeface(customFont);

//         // Set color for the submit button
//         submitButton.setBackgroundColor(Color.parseColor("#ff6600"));

//         // Add a click listener to the submit button
//         submitButton.setOnClickListener(view -> {
//             String input = inputText.getText().toString().trim();
//             displayText.setText(input);
//         });
//     }
// }