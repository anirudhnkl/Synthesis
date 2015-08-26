package com.anirudh.synthesis;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class IntroScreen extends ActionBarActivity
{
    private Button getStartedButton;
    private Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);

        getStartedButton = (Button)findViewById(R.id.getStartedButton);
        logInButton = (Button)findViewById(R.id.alreadyMemberButton);

        getStartedButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startClass();
            }
        });
        //Intent intent = new Intent(this, NavigationDrawerActivity.class);
        //startActivity(intent);

    }

    public void startClass()
    {
        Intent intent = new Intent(IntroScreen.this, LoginActivity.class);
        startActivity(intent);
    }
}
