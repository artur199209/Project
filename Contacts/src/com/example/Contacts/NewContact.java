package com.example.Contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Artur on 2016-01-06.
 */

public class NewContact extends Activity {
    Button BackFromAddContactMenu;
    public void r()
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        BackFromAddContactMenu=(Button)findViewById(R.id.BackFromAddContactMenu);
        BackFromAddContactMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r();
            }
        });
    }
}