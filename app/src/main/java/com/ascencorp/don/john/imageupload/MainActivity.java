package com.ascencorp.don.john.imageupload;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uploadToGoogleDrive(View view) {
        Intent intent = new Intent(this, WebViewUpload.class);
        intent.putExtra("provider", Providers.PROVIDER_NAME.GOOGLE_DRIVE);
        startActivity(intent);
    }

    public void uploadToDropBox(View view) {
        Intent intent = new Intent(this, WebViewUpload.class);
        intent.putExtra("provider", Providers.PROVIDER_NAME.DROPBOX);
        startActivity(intent);
    }

    public void viewSharedFolders(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Choose your provider?")
                .setPositiveButton("GOOGLE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, WebViewShowFolder.class);
                        intent.putExtra("provider", Providers.PROVIDER_NAME.GOOGLE_DRIVE);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("DROPBOX", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, WebViewShowFolder.class);
                        intent.putExtra("provider", Providers.PROVIDER_NAME.DROPBOX);
                        startActivity(intent);
                    }
                })
                .show();
    }
}
