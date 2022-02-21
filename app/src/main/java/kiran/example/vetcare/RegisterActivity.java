package kiran.example.vetcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    Button _cirLoginButton;
    EditText _txtName, _txtEmail, _txtMobile, _txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        _cirLoginButton=(Button) findViewById(R.id.cirLoginButton);
        _txtName=(EditText)findViewById(R.id.txtName);
        _txtEmail=(EditText)findViewById(R.id.txtEmail);
        _txtMobile=(EditText)findViewById(R.id.txtMobile);
        _txtPassword=(EditText)findViewById(R.id.txtPassword);
        _cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=_txtName.getText().toString();
                String email=_txtEmail.getText().toString();
                String mobile=_txtMobile.getText().toString();
                String password=_txtPassword.getText().toString();
                String type="reg";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, name, email, mobile,password);

            }
        });
        _cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        changeStatusBarColor();
    }
    public void changeStatusBarColor()
    {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }

    }
    public void onLoginClick(View view)
    {
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}