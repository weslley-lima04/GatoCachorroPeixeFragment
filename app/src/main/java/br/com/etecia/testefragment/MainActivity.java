package br.com.etecia.testefragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CachorroFragment cachorroFragment = new CachorroFragment();
    GatoFragment gatoFragment = new GatoFragment();
    PeixeFragment peixeFragment = new PeixeFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btnNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, cachorroFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ic_cachorro:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, cachorroFragment).commit();
                        return true;
                    case R.id.ic_gato:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, gatoFragment).commit();
                        return true;
                    case R.id.ic_peixe:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, peixeFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }
}