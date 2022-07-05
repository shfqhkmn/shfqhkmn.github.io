package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_AboutMe) {

            startActivity(new Intent(HomeActivity.this, AboutMe.class));

            Toast.makeText(this, "About Me Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_Hobby) {

            startActivity(new Intent(HomeActivity.this, Hobby.class));

            Toast.makeText(this, "Hobby Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_Skill) {

            startActivity(new Intent(HomeActivity.this, Skill.class));

            Toast.makeText(this, "Skill Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_TimeTable) {

            startActivity(new Intent(HomeActivity.this, TimeTable.class));

            Toast.makeText(this, "TimeTable Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_UitmWebsite) {

            startActivity(new Intent(HomeActivity.this, Uitm.class));

            Toast.makeText(this, "Uitm Website Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_istudent) {

            startActivity(new Intent(HomeActivity.this, istudent.class));

            Toast.makeText(this, "iStudent Paged Clicked! ", Toast.LENGTH_SHORT).show();
        }

        if (id== R.id.menu_home) {

            startActivity(new Intent(HomeActivity.this, RegisterActivity.class));
            Toast.makeText(this, "You have been logged out! ", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);

    }
}




