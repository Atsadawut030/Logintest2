package sdu.cs58.atsadawut.logintest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView usernameTextView;
    String getuserString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameTextView=findViewById(R.id.txvuser);
        getuserString=getIntent().getStringExtra("userString");
        usernameTextView.setText("ยินดีต้อนรับน่ะจ๊ะ"+getuserString+"เข้าสูุ่ระบบ");
    }

    public void clickLink(View view) {
        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse("https://www.facebook.com/sunday.buypass?ref=bookmarks"));
        startActivity(linkIntent);
    }
}
