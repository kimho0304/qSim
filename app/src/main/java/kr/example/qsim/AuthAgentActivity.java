package kr.example.qsim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class AuthAgentActivity extends AppCompatActivity {
    private EditText idText, pwdText, logText;
    private ScrollView logScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_agent);

        // Text Layout ID matching ↓
        idText = findViewById(R.id.idText);
        pwdText = findViewById(R.id.pwdText);
        logText = findViewById(R.id.logText);

    }
}