package com.example.alexr.wiredbraincoffeeco;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.example.alexr.wiredbraincoffeeco.Utilities.GalleryAdapter;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        ArrayList<String> imageUrls = new ArrayList<String>();

        GridView gridGallery = (GridView) view.findViewById(R.id.grid_gallery);
        GalleryAdapter gridAdapter = new GalleryAdapter(getContext(), R.layout.gallery_item_layout, imageUrls);
        gridGallery.setAdapter(gridAdapter);

        return view;
    }
}
