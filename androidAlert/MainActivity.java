// import android.Manifest;
// import android.content.pm.PackageManager;
// import android.os.Bundle;
// import android.widget.Toast;

// import androidx.appcompat.app.AppCompatActivity;
// import androidx.core.app.ActivityCompat;
// import androidx.core.content.ContextCompat;

// public class MainActivity extends AppCompatActivity {

//     private static final int REQUEST_READ_SMS = 0;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         // Request permission to read SMS messages
//         if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS)
//                 != PackageManager.PERMISSION_GRANTED) {
//             ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_SMS},
//                     REQUEST_READ_SMS);
//         }
//     }

//     // Handle permission request result
//     @Override
//     public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//         if (requestCode == REQUEST_READ_SMS) {
//             if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                 Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
//             } else {
//                 Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
//             }
//         }
//     }
// }