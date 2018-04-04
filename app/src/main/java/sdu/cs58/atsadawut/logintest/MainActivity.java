package sdu.cs58.atsadawut.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        TextView txtView ;
        EditText usernameEditText , passwordEditText ;
        ImageView imvLogin ;
        Button btn ;
        String userString , passString ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.txtView);
        usernameEditText = findViewById(R.id.edtUsername);
        passwordEditText = findViewById(R.id.edtPassword);
        imvLogin = findViewById(R.id.imvLogin);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userString = usernameEditText.getText().toString().trim();
                passString = passwordEditText.getText().toString().trim();

                if ((userString.length()==0)||(passString.length()==0)){
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                }

                if ((passString.equals("1234"))){
                    Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);

                    Intent mainIntent = new Intent(MainActivity.this,Main2Activity.class);
                    mainIntent.putExtra("userString",userString);
                    startActivity(mainIntent);

                }else{
                    Toast.makeText(getApplicationContext(),"กรุณาใส่พาสเวิร์ดใหม่",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
