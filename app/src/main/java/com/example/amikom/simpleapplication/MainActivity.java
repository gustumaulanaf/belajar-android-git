package com.example.amikom.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.amikom.simpleapplication.activity.AddUserActivity;
import com.example.amikom.simpleapplication.activity.DetailActivity;

import layout.BlankFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle_login = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(bundle_login.getCharSequence("nama"));

    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void kefragment(View view) {
        Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(intent);

    }

    public void adduser(View view) {
        Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
        startActivity(intent);
    }

    public void listuser(View view) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }
}
