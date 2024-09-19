package com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity;

import androidx.recyclerview.widget.RecyclerView;

import com.northcoders.jv_android_retrofit_mvvm_2.databinding.AlbumItemBinding;

public class AlbumAdapter extends RecyclerView.Adapter<> {

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private AlbumItemBinding albumItemBinding;

        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }

    }
}
