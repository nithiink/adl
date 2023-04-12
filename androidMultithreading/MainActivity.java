// import android.os.Bundle;
// import android.os.Handler;
// import android.os.Looper;
// import android.os.Message;
// import android.view.View;
// import android.widget.Button;
// import android.widget.TextView;

// import androidx.appcompat.app.AppCompatActivity;

// public class MainActivity extends AppCompatActivity {

//     private TextView textView;
//     private Button button;
//     private Handler handler;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         textView = findViewById(R.id.text_view);
//         button = findViewById(R.id.button);

//         handler = new Handler(Looper.getMainLooper()) {
//             @Override
//             public void handleMessage(Message msg) {
//                 super.handleMessage(msg);
//                 // Update UI with the message received from the background thread
//                 textView.setText(msg.obj.toString());
//             }
//         };

//         button.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 // Create a new background thread
//                 new Thread(new Runnable() {
//                     @Override
//                     public void run() {
//                         // Perform some long-running task in the background thread
//                         String result = performLongRunningTask();

//                         // Send a message to the main thread with the result
//                         Message message = handler.obtainMessage(1, result);
//                         handler.sendMessage(message);
//                     }
//                 }).start();
//             }
//         });
//     }

//     private String performLongRunningTask() {
//         // Simulate a long-running task by sleeping for 5 seconds
//         try {
//             Thread.sleep(5000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         return "Task completed!";
//     }
// }
