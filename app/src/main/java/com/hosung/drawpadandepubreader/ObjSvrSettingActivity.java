package com.hosung.drawpadandepubreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Hosung, Lee on 2017. 5. 23..
 * This is a Realm Object Server Setting Activity class
 */

public class ObjSvrSettingActivity extends AppCompatActivity {

    EditText serverIPText = null;
    EditText usernameText = null;
    EditText passwordText = null;
    Button saveButton = null;
    Button cancelButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obj_svr_setting);

        serverIPText = (EditText) findViewById(R.id.obj_serverip);
        usernameText = (EditText) findViewById(R.id.obj_username);
        passwordText = (EditText) findViewById(R.id.obj_password);
        saveButton = (Button) findViewById(R.id.btn_obj_save);
        cancelButton = (Button) findViewById(R.id.btn_obj_cancel);

        serverIPText.setText(MainActivity.realmServerIP);
        usernameText.setText(MainActivity.realmID);
        passwordText.setText(MainActivity.realmPasswd);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.setRrealmServerIP(serverIPText.getText().toString());
                MainActivity.realmID = usernameText.getText().toString();
                MainActivity.realmPasswd = passwordText.getText().toString();

                setResult(RESULT_OK, null);
                finish();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED, null);
                finish();
            }
        });
    }
}
