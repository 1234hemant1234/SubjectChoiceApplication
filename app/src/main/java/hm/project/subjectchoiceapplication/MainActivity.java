package hm.project.subjectchoiceapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button login,sighup;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.a);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        login=findViewById(R.id.button12);
        sighup=findViewById(R.id.button11);
        //imageView10 = findViewById(R.id.imageView10);
       //// extView14 = findViewById(R.id.textView14);
        //       // textView15 = findViewById(R.id.textView15);
        //
        //       // button9= findViewById(R.id.button9);
        //     //   button10= findViewById(R.id.button10);
        //
        //        button10.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //               //Intent  = new Intent(MainActivity.this,Login.class);
        //               //startActivity(LOGIN);
        //            }
        //        });
        //        button9.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                //Intent SIGNUP = new Intent(MainActivity.this,Registration.class);
        //                //startActivity(SIGNUP);
        //            }
        //        });
        //        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //        //DatabaseReference myRef = database.getReference("message");
        //
        //        //myRef.setValue("Hello, World!");t

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

        sighup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Registration.class));
            }
        });

    }
}
