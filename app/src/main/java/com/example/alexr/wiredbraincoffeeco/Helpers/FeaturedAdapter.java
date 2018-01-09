package com.example.alexr.wiredbraincoffeeco.Helpers;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.alexr.wiredbraincoffeeco.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ItemViewHolder> {
    private ArrayList<FeaturedItem> mItems;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView mItemName;
        public TextView mItemDesc;
        public ImageView mImageView;

        public ItemViewHolder(View v) {
            super(v);
            mItemDesc = (TextView) v.findViewById(R.id.item_desc);
            mItemName = (TextView) v.findViewById(R.id.item_name);
            mImageView = (ImageView) v.findViewById(R.id.item_image);
        }
    }

    public FeaturedAdapter(ArrayList<FeaturedItem> items) {
        mItems = items;
    }

    @Override
    public FeaturedAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        ItemViewHolder vh = new ItemViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.mItemDesc.setText(mItems.get(position).getDescription());
        holder.mItemName.setText(mItems.get(position).getName());

        Picasso.with(holder.mImageView.getContext()).load(UrlHelper.BaseUrl + mItems.get(position).getImageUrl()).fit().centerCrop().into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}