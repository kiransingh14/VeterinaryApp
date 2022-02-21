package kiran.example.vetcare;

import static kiran.example.vetcare.R.id.editTextTextPersonName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    private EditText type,name,breeds,gender,dob,symptoms;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        type=(EditText) findViewById(R.id.editTextTextPersonName);
        name=(EditText) findViewById(R.id.editTextTextPersonName3);
        breeds=(EditText) findViewById(R.id.editTextTextPersonName4);
        gender=(EditText) findViewById(R.id.editTextTextPersonName8);
        dob=(EditText) findViewById(R.id.editTextTextPersonName6);
        symptoms=(EditText) findViewById(R.id.editTextTextPersonName7);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!type.getText().toString().isEmpty() && !symptoms.getText().toString().isEmpty()){
                    Toast.makeText(DetailsActivity.this, R.string.success_label,Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(DetailsActivity.this, R.string.error_label,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}