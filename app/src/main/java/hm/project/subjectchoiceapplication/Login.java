package hm.project.subjectchoiceapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView textView2;
    TextView textView3;
    EditText editText2;
    EditText editText3;
    Button button;
    Button buttton5;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        editText2 = findViewById(R.id.editText2);
        editText3= findViewById(R.id.editText3);
        button = findViewById(R.id.buttonlogin);
        buttton5 = findViewById(R.id.button5);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(getApplicationContext(),Registration.class);
                //startActivity(intent);
            }
        });
        findViewById(R.id.buttonlogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText2.getText().toString().trim();
                String s2 = editText3.getText().toString().trim();
             //   if (s.equals("") && s2.equals("")) {
               //     Toast.makeText(Login.this, "Plaese Enter All Values", Toast.LENGTH_SHORT).show();

                    //Toast.makeText(Login.this, "welcome", Toast.LENGTH_SHORT).show();
                   /* Intent myPage = new Intent(Login.this, ChooseSubject.class);
                    startActivity(myPage);*/


                   startActivity(new Intent(Login.this,ChooseSubject.class));

              //  }
            }
        });
       buttton5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(Login.this, ForgetPasswordActivity.class));
           }
       });
    }
}
