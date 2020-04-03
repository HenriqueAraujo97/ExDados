package pt.ipg.exdados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_IDADE = "com.example.myfirstapp.IDADE";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText Textnome = (EditText) findViewById(R.id.editTextNome);
        EditText Textphone = (EditText) findViewById(R.id.EditTextPhone);
        EditText Textemail = (EditText) findViewById(R.id.editTextMail);
        EditText Textidade = (EditText) findViewById(R.id.editTextIdade);
        EditText Textpeso = (EditText) findViewById(R.id.editTextPeso);
        EditText Textaltura = (EditText) findViewById(R.id.editTextAltura);

        String nome = Textnome.getText().toString();
        String phone = Textphone.getText().toString();
        String email = Textemail.getText().toString();
        String idade = Textidade.getText().toString();
        String peso = Textpeso.getText().toString();
        String altura = Textaltura.getText().toString();


        startActivity(intent);
    }
}
