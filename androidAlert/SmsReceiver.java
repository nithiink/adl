// import android.app.AlertDialog;
// import android.content.BroadcastReceiver;
// import android.content.Context;
// import android.content.Intent;
// import android.os.Bundle;
// import android.telephony.SmsMessage;

// public class SmsReceiver extends BroadcastReceiver {

//     @Override
//     public void onReceive(Context context, Intent intent) {
//         if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
//             // Get the SMS message
//             Bundle bundle = intent.getExtras();
//             if (bundle != null) {
//                 Object[] pdus = (Object[]) bundle.get("pdus");
//                 SmsMessage[] messages = new SmsMessage[pdus.length];
//                 for (int i = 0; i < pdus.length; i++) {
//                     messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
//                 }
//                 String messageBody = messages[0].getMessageBody();

//                 // Create an alert
//                 AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                 builder.setTitle("New Message");
//                 builder.setMessage(messageBody);
//                 builder.setPositiveButton("OK", null);
//                 builder.show();
//             }
//         }
//     }
// }

