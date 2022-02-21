package kiran.example.vetcare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    Button _cirLoginButton;
    EditText _txtEmail, _txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
        _cirLoginButton=findViewById(R.id.cirLoginButton);
        _txtEmail=findViewById(R.id.txtEmail);
        _txtPassword=findViewById(R.id.txtPassword);
        _cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=_txtEmail.getText().toString();
                String pass_word=_txtPassword.getText().toString();
                String type="login";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, email, pass_word);
            }
        });
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}