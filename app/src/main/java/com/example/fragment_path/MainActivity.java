package com.example.fragment_path;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button erase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment= new Topfrag();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.topfrag, fragment);
        ft.commit();
        Fragment fragment1= new Bottomfrag();
        FragmentManager manager1 = getSupportFragmentManager();
        FragmentTransaction ft1 = manager1.beginTransaction();
        ft1.replace(R.id.bottomfrag, fragment1);
        ft1.commit();

        erase=(Button)findViewById(R.id.erase);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pathclass.path.reset();
                pathclass.first=true;
            }
        });

    }
}