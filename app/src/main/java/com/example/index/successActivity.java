package com.example.index;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ListView;

public class successActivity extends Activity implements View.OnClickListener {

    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private TextView nickname;
    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        linearLayout1 = (LinearLayout) findViewById(R.id.linearLayout1);
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
        nickname = (TextView) findViewById(R.id.nickname);
        findViewById(R.id.m_exit).setOnClickListener(this);
        listView1 = (ListView) findViewById(R.id.listView1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.m_exit:
                //TODO implement
                break;
        }
    }
}
