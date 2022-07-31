package com.coursell.coursesellingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.coursell.coursesellingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<Course> courseList;
    private CourseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ActionViewFliper();
       initRcyler();
    }

    private void initRcyler() {
        courseList = new ArrayList<>();
        courseList.add(new Course("Web Design","Crition Brin"));
        courseList.add(new Course("Android Studio","Donal Hau"));
        courseList.add(new Course("Data Science","Thomas Muller"));
        courseList.add(new Course("Programming","Thomas Mulk"));
        courseList.add(new Course("IOS Program","Luka modrics"));
        adapter = new CourseAdapter(this,courseList);
        binding.recylerCourse.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        binding.recylerCourse.setAdapter(adapter);
    }

    private void ActionViewFliper() {
        ArrayList<Integer> mangquangcao = new ArrayList<>();
        mangquangcao.add(R.drawable.book1);
        mangquangcao.add(R.drawable.book2);
        mangquangcao.add(R.drawable.book3);
        mangquangcao.add(R.drawable.book4);
        for (int i=0;i<mangquangcao.size();i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            binding.viewFlipper.addView(imageView);
        }
        binding.viewFlipper.setFlipInterval(3000);
        binding.viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.annim_banner);
        binding.viewFlipper.setInAnimation(animation_slide_in);
    }
}