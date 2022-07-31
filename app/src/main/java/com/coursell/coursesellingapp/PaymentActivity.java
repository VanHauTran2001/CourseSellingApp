package com.coursell.coursesellingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PaymentActivity extends AppCompatActivity {
    Button btnNext,btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        intitButton();
        onClick();
    }

    private void onClick() {
       btnNext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });
       btnPay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               customDialog();
           }
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
        btnNext = findViewById(R.id.btnNext);
        btnPay = findViewById(R.id.btnPayment);
    }
}