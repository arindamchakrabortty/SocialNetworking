package com.example.socialnetworking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.socialnetworking.Fragments.AddFragment;
import com.example.socialnetworking.Fragments.HomeFragment;
import com.example.socialnetworking.Fragments.NotificationFragment;
import com.example.socialnetworking.Fragments.ProfileFragment;
import com.example.socialnetworking.Fragments.SearchFragment;
import com.example.socialnetworking.databinding.ActivityMainBinding;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();


        binding.bottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            @Override
            public void onTabSelected(int i, @Nullable AnimatedBottomBar.Tab tab, int i1, @NonNull AnimatedBottomBar.Tab tab1) {

                switch (i1){
                    case 0:
                        fragmentTransaction.replace(R.id.container,new HomeFragment());
                        break;
                    case 1:
                        fragmentTransaction.replace(R.id.container,new SearchFragment());
                        break;
                    case 2:
                        fragmentTransaction.replace(R.id.container,new AddFragment());
                        break;
                    case 3:
                        fragmentTransaction.replace(R.id.container,new NotificationFragment());
                        break;
                    case 4:
                        fragmentTransaction.replace(R.id.container,new ProfileFragment());
                        break;
                }
                fragmentTransaction.commit();
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {
                switch (i){
                    case 0:
                        fragmentTransaction.replace(R.id.container,new HomeFragment());
                        break;
                    case 1:
                        fragmentTransaction.replace(R.id.container,new SearchFragment());
                        break;
                    case 2:
                        fragmentTransaction.replace(R.id.container,new AddFragment());
                        break;
                    case 3:
                        fragmentTransaction.replace(R.id.container,new NotificationFragment());
                        break;
                    case 4:
                        fragmentTransaction.replace(R.id.container,new ProfileFragment());
                        break;
                }
                fragmentTransaction.commit();
            }
        });
    }
}