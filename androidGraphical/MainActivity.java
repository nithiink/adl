// import android.graphics.Canvas;
// import android.graphics.Color;
// import android.graphics.Paint;
// import android.os.Bundle;
// import android.view.View;

// import androidx.appcompat.app.AppCompatActivity;

// public class MainActivity extends AppCompatActivity {

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);

//         // Create a new custom view and set it as the content view
//         setContentView(new MyView(this));
//     }

//     // Custom view that draws graphical primitives on the screen
//     private static class MyView extends View {

//         // Paint object for drawing
//         private Paint paint;

//         public MyView(MainActivity context) {
//             super(context);

//             // Initialize the Paint object
//             paint = new Paint();
//             paint.setColor(Color.RED);
//             paint.setStyle(Paint.Style.FILL);
//             paint.setStrokeWidth(5);
//         }

//         @Override
//         protected void onDraw(Canvas canvas) {
//             super.onDraw(canvas);

//             // Draw a circle
//             canvas.drawCircle(200, 200, 100, paint);

//             // Draw a rectangle
//             canvas.drawRect(350, 150, 550, 350, paint);

//             // Draw a line
//             canvas.drawLine(600, 200, 800, 400, paint);
//         }
//     }
// }
