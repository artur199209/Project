package com.example.Contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Artur on 2016-01-06.
 */
public class ViewAllContacts extends Activity {

    Button BackFromViewAllContactsMenu;
    Button ViewAllContactsButton;

    public void reakcja()
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allcontacts);

        BackFromViewAllContactsMenu = (Button)findViewById(R.id.BackFromViewAllContactsMenu);
        ViewAllContactsButton = (Button)findViewById(R.id.ViewAllContactsButton);

        View.OnClickListener ss = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reakcja();
            }
        };

        BackFromViewAllContactsMenu.setOnClickListener(ss);


    }
}