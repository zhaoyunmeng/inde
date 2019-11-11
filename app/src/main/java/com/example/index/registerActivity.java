package com.example.index;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Button;

    public class registerActivity extends Activity implements View.OnClickListener {

        private LinearLayout activityRegister;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            activityRegister = (LinearLayout) findViewById(R.id.activity_register);
            findViewById(R.id.btn_register).setOnClickListener(this);
        }

        private EditText getEtUserName(){
            return (EditText) findViewById(R.id.et_user_name);
        }

        private EditText getEtPsw(){
            return (EditText) findViewById(R.id.et_psw);
        }

        private EditText getEtPswAgain(){
            return (EditText) findViewById(R.id.et_psw_again);
        }
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_register:
                    //TODO implement
                    break;
            }
        }
    }


