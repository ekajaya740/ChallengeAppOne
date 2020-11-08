package org.freecodecampcourse.chalengeappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view){
        EditText edtFirstName = findViewById(R.id.edtxt_first_name);
        EditText edtLastName = findViewById(R.id.edtxt_last_name);
        EditText edtEmail = findViewById(R.id.edtxt_email);

        TextView tvFirstName = findViewById(R.id.tv_first_name);
        TextView tvLastName = findViewById(R.id.tv_last_name);
        TextView tvEmail = findViewById(R.id.tv_email);

        tvFirstName.setText("First Name: " + edtFirstName.getText().toString());
        tvLastName.setText("Last Name: " + edtLastName.getText().toString());
        tvEmail.setText("Email: " + edtEmail.getText().toString());
    }
}