package com.coursell.coursesellingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PaymentActivity extends AppCompatActivity {
    Button pay1,p2,p3,p4,p5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        intitButton();
        onClick();
    }

    private void onClick() {
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();            }
        });
    }

    private void customDialog() {
        AlertDialog dialog = new AlertDialog.Builder(PaymentActivity.this)
                                    .setTitle("Payment Dialog")
                                    .setMessage("Thank you for your successful payment")
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            Toast.makeText(PaymentActivity.this, "On Successfull", Toast.LENGTH_SHORT).show();
                                        }
                                    })
                                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .create();

        dialog.show();
    }

    private void intitButton() {
        pay1 = findViewById(R.id.pay1);
        p2 = findViewById(R.id.pay2);
        p3 = findViewById(R.id.pay3);
        p4 = findViewById(R.id.pay4);
        p5 = findViewById(R.id.pay5);
    }
}