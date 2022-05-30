package com.example.dphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final String[] phrases = {
            "Frase 1",
            "Frase 2",
            "Frase 3",
            "Frase 4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button phraseBtn = findViewById(R.id.phraseBtn);

        phraseBtn.setOnClickListener(v -> generatePhrase());
    }

    public void generatePhrase() {
        TextView phraseView = findViewById(R.id.phraseView);

        Random random = new Random();
        int index = random.nextInt(this.phrases.length);

        phraseView.setText(this.phrases[index]);
    }
}