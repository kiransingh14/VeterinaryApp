package kiran.example.vetcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button button,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        View startBtn = findViewById(R.id.button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryintent=new Intent(HomeActivity.this,MainPageActivity.class);
                startActivity(categoryintent);
            }
        });
        View startBtn2 = findViewById(R.id.button2);
        startBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryintent2=new Intent(HomeActivity.this,MainPageActivity.class);
                startActivity(categoryintent2);
            }
        });
        View startBtn3 = findViewById(R.id.button3);
        startBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryintent3=new Intent(HomeActivity.this,MainPageActivity.class);
                startActivity(categoryintent3);
            }
        });
    }

}
