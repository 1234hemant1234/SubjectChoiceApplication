package hm.project.subjectchoiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Registration extends AppCompatActivity {
    EditText editText;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    RadioButton radioButton;
    RadioButton radioButton2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        editText = findViewById(R.id.editText);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7  =findViewById(R.id.editText7);
        radioButton = findViewById(R.id.radioButton);
        radioButton = findViewById(R.id.radioButton2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
