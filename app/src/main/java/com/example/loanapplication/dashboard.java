package com.example.loanapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView accountCard, loanCard, paymentsCard, borrowersCard, balanceCard, usersCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        accountCard = (CardView) findViewById(R.id.accountCard);
        loanCard = (CardView) findViewById(R.id.loanCard);
        paymentsCard = (CardView) findViewById(R.id.paymentsCard);
        borrowersCard = (CardView) findViewById(R.id.borrowersCard);
        balanceCard = (CardView) findViewById(R.id.balanceCard);
        usersCard = (CardView) findViewById(R.id.usersCard);


        accountCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
        loanCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        paymentsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PaymentsActivity.class);
                startActivity(intent);
            }
        });
        borrowersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BorrowersActivity.class);
                startActivity(intent);
            }
        });
        balanceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BalanceActivity.class);
                startActivity(intent);
            }
        });
        usersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UsersActivity.class);
                startActivity(intent);
            }
        });


    }
}