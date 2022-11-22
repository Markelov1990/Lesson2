package com.example.lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private int first_number = 0;
private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        erstNummer();


    }
private void erstNummer() {
    result = findViewById(R.id.first_number);
    showResult();

    findViewById(R.id.key_1).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 1;
            showResult();
        }
    });

    findViewById(R.id.key_2).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 2;
            showResult();
        }
    });
    findViewById(R.id.key_3).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 3;
            showResult();
        }
    });
    findViewById(R.id.key_4).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 4;
            showResult();
        }
    });
    findViewById(R.id.key_5).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 5;
            showResult();
        }
    });
    findViewById(R.id.key_6).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 6;
            showResult();
        }
    });
    findViewById(R.id.key_7).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 7;
            showResult();
        }
    });
    findViewById(R.id.key_8).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 8;
            showResult();
        }
    });
    findViewById(R.id.key_9).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 9;
            showResult();
        }
    });
    findViewById(R.id.key_0).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first_number = 0;
            showResult();
        }
    });
}
private void showResult () {
        result.setText(String.valueOf(first_number));
}


    @Override
    protected void onStart() {
        super.onStart();
        logEvent("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logEvent("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logEvent("onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        logEvent("onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        logEvent("onSaveInstantState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logEvent("onDestroy");
    }

    private void logEvent(String event) {
        Log.d("MainLog", event);
    }

}