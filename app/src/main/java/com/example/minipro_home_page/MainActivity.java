package com.example.minipro_home_page;

import static androidx.viewpager.widget.ViewPager.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.minipro_home_page.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


        ActivityMainBinding binding;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // profile fragment
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            replaceFragment(new Home_fragment());
            binding.bottomNavigationView.setOnItemSelectedListener(item -> {

                switch (item.getItemId())
                {
                    case R.id.home_nav:
                        replaceFragment(new Home_fragment());
                    break;
                    case R.id.myclub_nav:
                        replaceFragment(new myclub_fragment());
                        break;
                    case R.id.allclub_nav:
                        replaceFragment(new club_fragment());
                        break;
                    case R.id.events:
                        replaceFragment(new calender_fragment());
                        break;
                    case R.id.profile:
                        replaceFragment(new profile_fragment());
                        break;
                }


                return true;
            });


        }

        private void replaceFragment(Fragment fragment)
        {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.MainContainer,fragment);
            fragmentTransaction.commit();
        }

    }
