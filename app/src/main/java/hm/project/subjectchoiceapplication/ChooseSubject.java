package hm.project.subjectchoiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChooseSubject extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    TextView textView23;
    TextView textView24;
    TextView textView25;
    TextView textView26;
    TextView textView27;
    TextView textView28;
    TextView textView30;
    TextView textView31;
    EditText editText11;
    EditText editText12;
    EditText editText15;
    EditText editText16;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    //Spinner spinner;
    //Spinner spinner4;
    Button button3;
    //Spinner spinner2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);
        //spinner = findViewById(R.id.spinner);
        //spinner4 = findViewById(R.id.spinner4);
        editText8 = findViewById(R.id.editText8);
        editText9 = findViewById(R.id.editText9);
        editText10 = findViewById(R.id.editText10);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editText11 = findViewById(R.id.editText11);
        editText12= findViewById(R.id.editText12);
        editText15 = findViewById(R.id.editText15);
        editText16 = findViewById(R.id.editText16);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26= findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView30 = findViewById(R.id.textView30);
        textView31 = findViewById(R.id.textView31);
        button3 = findViewById(R.id.button3);
        //spinner2 = findViewById(R.id.spinner2);


        Toast.makeText(this, "Your details are saved succesfully", Toast.LENGTH_SHORT).show();

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Course,android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);

        //ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Sem,android.R.layout.simple_spinner_item);
        //spinner.setAdapter(adapter1);

        //ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Subject,android.R.layout.simple_spinner_item);
        //spinner.setAdapter(adapter2);

    }
}
