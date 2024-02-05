package com.route.assginment5;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.route.assginment5.databinding.ActivityRvBinding;

import java.util.ArrayList;
import java.util.List;

public class FbTimelineActivity extends AppCompatActivity {
    ActivityRvBinding binding;
    FacebookAdapter adapter;
    List<Post> postsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRvBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        createPosts();
        adapter = new FacebookAdapter(postsList);
        binding.rvFacebook.setAdapter(adapter);


    }

    private void createPosts() {
        postsList = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            postsList.add(new Post(
                    "user" + i,
                    i + " hrs",
                    "post number " + i,
                    i + ""
            ));
        }

    }


}
