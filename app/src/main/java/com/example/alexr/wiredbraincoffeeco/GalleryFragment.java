package com.example.alexr.wiredbraincoffeeco;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.alexr.wiredbraincoffeeco.Helpers.GridAdapter;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        ArrayList<String> imageUrls = new ArrayList<String>();
        imageUrls.add("trail.jpg");
        imageUrls.add("bagel.jpg");
        imageUrls.add("ground.jpg");
        imageUrls.add("bag.jpg");
        imageUrls.add("beans.jpg");
        imageUrls.add("table.jpg");
        imageUrls.add("coffee.jpg");
        imageUrls.add("granola.jpg");

        GridView gridGallery = (GridView) view.findViewById(R.id.gridView);
        GridAdapter gridAdapter = new GridAdapter(getContext(), R.layout.grid_item_layout, imageUrls);
        gridGallery.setAdapter(gridAdapter);

        return view;
    }
}
