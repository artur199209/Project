package com.example.Contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button GoToAddContactMenu;
    Button GoToDeleteContactMenu;
    Button GoToViewAllContactsMenu;
    Button GoToUpdateContactMenu;

    public void reakcja()
    {
        Intent i = new Intent(this, NewContact.class);
        startActivity(i);
    }

    public void reakcja2()
    {
        Intent i = new Intent(this, DeleteContact.class);
        startActivity(i);
    }

    public void reakcja3()
    {
        Intent i = new Intent(this, ViewAllContacts.class);
        startActivity(i);
    }

    public void reakcja4()
    {
        Intent i = new Intent(this, UpdateContact.class);
        startActivity(i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GoToAddContactMenu = (Button)findViewById(R.id.GoToAddContactMenu);
        GoToDeleteContactMenu = (Button)findViewById(R.id.GoToDeleteContactMenu);
        GoToViewAllContactsMenu = (Button)findViewById(R.id.GoToViewAllContactsMenu);
        GoToUpdateContactMenu = (Button)findViewById(R.id.GoToUpdateContactMenu);

        View.OnClickListener intent = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reakcja();
            }
        };

        GoToAddContactMenu.setOnClickListener(intent);

        View.OnClickListener intent2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reakcja2();
            }
        };

        GoToDeleteContactMenu.setOnClickListener(intent2);

        View.OnClickListener intent3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reakcja3();
            }
        };

        GoToViewAllContactsMenu.setOnClickListener(intent3);

        View.OnClickListener intent4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reakcja4();
            }
        };

        GoToUpdateContactMenu.setOnClickListener(intent4);
    }
}
