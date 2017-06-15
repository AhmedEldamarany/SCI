package com.example.ahmed.sci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.*;


public class MainActivity extends AppCompatActivity {
    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Students");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
Student student=new Student("Ahmed","Muhammad","Naboot","Damarany","20151435010","01019745460","034455566","Ahmed@mail.com","city of amerya","Male","");
database.getReference().child("new");
        for(int i=0;i<5;i++){
            myRef.child(""+i).setValue(student);
        }
        */

        Button submit=(Button) findViewById(R.id.submitter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=(EditText) findViewById(R.id.name);
                EditText father=(EditText) findViewById(R.id.father);
                EditText grandpa=(EditText) findViewById(R.id.ggrandpa);
                EditText ggrand=(EditText) findViewById(R.id.ggrandpa);
                EditText nId=(EditText) findViewById(R.id.Nid);
                EditText phone=(EditText) findViewById(R.id.phone);
                EditText mobile=(EditText) findViewById(R.id.cell);
                EditText Email=(EditText) findViewById(R.id.email);
                EditText address=(EditText) findViewById(R.id.address);
                EditText notes=(EditText) findViewById(R.id.note);
                RadioGroup Gender=(RadioGroup)findViewById(R.id.sex);
                String sex;
                if(Gender.getCheckedRadioButtonId()==R.id.male) sex="male";
                else sex="female";
                Student student=new Student(name.getText().toString(),father.getText().toString(),grandpa.getText().toString()
                ,ggrand.getText().toString(),nId.getText().toString(),phone.getText().toString(),mobile.getText().toString()
                ,Email.getText().toString(),address.getText().toString(),sex,notes.getText().toString());
//child(previous.getID()+1)
                myRef.child("child").setValue(student);
               phone.setText(myRef.getKey());


            }
        });



    }
}
