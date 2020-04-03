package pt.ipg.exdados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText nome = (EditText) findViewById(R.id.editTextNome);
        EditText phone = (EditText) findViewById(R.id.EditTextPhone);
        EditText email = (EditText) findViewById(R.id.editTextMail);
        EditText idade = (EditText) findViewById(R.id.editTextIdade);
        EditText peso = (EditText) findViewById(R.id.editTextPeso);
        EditText altura = (EditText) findViewById(R.id.editTextAltura);


       
        startActivity(intent);
    }
}
