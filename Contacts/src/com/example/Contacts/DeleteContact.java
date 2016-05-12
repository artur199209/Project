package com.example.Contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Artur on 2016-01-06.
 */
public class DeleteContact extends Activity {
    Button BackFromDeleteMenu;

    public void reakcja()
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete);
        Reaction rc =new Reaction();
        BackFromDeleteMenu=(Button)findViewById(R.id.BackFromDeleteMenu);
        BackFromDeleteMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                reakcja();
            }
        });
    }
}