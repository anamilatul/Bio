package me.anamila.mybio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_alamat(View v) {
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.com/maps/place/SKUTER+ELEKTRIK+BATANG+%7C+RENTAL+%26+SHOWROOM+ESCOOTER/@-6.9328575,109.705208,17z/data=!4m13!1m7!3m6!1s0x2e7023839f0c2ef5:0xc5556475c8c52872!2sGg.+14,+Judipati,+Lebo,+Kec.+Warungasem,+Kabupaten+Batang,+Jawa+Tengah+51252!3b1!8m2!3d-6.9328628!4d109.7073967!3m4!1s0x2e70236b7a980961:0xdd7a96c3485e4664!8m2!3d-6.9329825!4d109.707418?hl=id";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void button_telepon(View v) {
        String phone = "085800219949";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

    public void button_email(View v) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:anamilatulaulia@gmail.com"));
        startActivity(Intent.createChooser(emailIntent, "Send feedback"));
    }

}