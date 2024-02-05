package com.route.assginment5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.route.assginment5.databinding.ActivityPostBinding;

import java.util.List;

public class FacebookAdapter extends RecyclerView.Adapter<FacebookAdapter.ViewHolder> {

    List<Post> posts;

    public FacebookAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ActivityPostBinding itemView = ActivityPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);

        holder.binding.tvName.setText(post.name);
        holder.binding.tvTime.setText(post.time);
        holder.binding.tvLikes.setText(post.likeCounter);
        holder.binding.tvPost.setText(post.postText);


    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ActivityPostBinding binding;

        public ViewHolder(@NonNull ActivityPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
