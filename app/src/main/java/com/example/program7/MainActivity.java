package com.example.program7;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button closeButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        closeButton = findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);

        closeButton.setOnClickListener(v -> {
            // Setting message manually and performing action on button click
            builder.setMessage("Do you want to close this application?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", (dialog, id) -> {
                        finish();
                        Toast.makeText(getApplicationContext(),
                                "You chose 'Yes' action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("No", (dialog, id) -> {
                        // Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),
                                "You chose 'No' action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    });
            // Creating dialog box
            AlertDialog alert = builder.create();
            // Setting the title manually
            alert.setTitle("AlertDialogExample");
            alert.show();
        });
    }
}
