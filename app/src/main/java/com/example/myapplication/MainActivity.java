package com.example.menulifecycleexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // You can update menu items here before the menu is displayed.
        // For example, you can enable/disable items based on certain conditions.
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_about:
                Toast.makeText(this, "About selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_profile:
                Toast.makeText(this, "Profile selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_help:
                Toast.makeText(this, "Help selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_logout:
                Toast.makeText(this, "Logout selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
