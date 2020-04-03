package pt.ipg.exdados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String idade = intent.getStringExtra(MainActivity.EXTRA_IDADE);

        TextView textView = findViewById(R.id.editTextNome);
    }
}