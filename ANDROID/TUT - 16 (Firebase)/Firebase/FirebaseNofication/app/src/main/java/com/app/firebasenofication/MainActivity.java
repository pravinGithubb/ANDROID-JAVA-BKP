package com.app.firebasenofication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.RemoteInput;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnNotification;
    String CHANNEL_ID = "notification";
    String CHANNEL_NAME = "notification channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotification = findViewById(R.id.btn_show);

        btnNotification.setOnClickListener(view -> {

            showNotification();

        });

    }

    private void showNotification() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("my description");

            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);

        }

        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(),  R.drawable.logo);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("My Notification")
                .setContentText("this is sample demonstration about notification")
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("Much longer text that cannot fit one line.dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd.."))
                .setSmallIcon(R.drawable.ic_baseline_notifications_active_24)
                /*.addAction(action)*/
                .setLargeIcon(mBitmap)
              /*  .setStyle(new NotificationCompat.BigPictureStyle()
                       *//* .bigPicture(mBitmap)*//*
                        .bigLargeIcon(mBitmap))*/
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(1, builder.build());



        // Key for the string that's delivered in the action's intent.
        final String KEY_TEXT_REPLY = "key_text_reply";

       /* String replyLabel = "Reply";
        RemoteInput remoteInput = new RemoteInput.Builder(KEY_TEXT_REPLY)
                .setLabel(replyLabel)
                .build();*/

  /*      // Build a PendingIntent for the reply action to trigger.
        int randomRequestCode = new Random().nextInt(54325);

        //PendingIntent that restarts the current activity instance.
        Intent resultIntent = new Intent(this, MainActivity.class);
        //Set a unique request code for this pending intent
        PendingIntent resultPendingIntent = PendingIntent.getActivity(this, randomRequestCode, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        // Create the reply action and add the remote input.
        NotificationCompat.Action action =
                new NotificationCompat.Action.Builder(R.drawable.ic_baseline_reply_24,
                        getString(R.string.label), resultPendingIntent)
                        .addRemoteInput(remoteInput)
                        .build();*/


    }
}