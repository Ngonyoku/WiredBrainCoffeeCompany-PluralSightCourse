package com.example.alexr.wiredbraincoffeeco;


import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CompanyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_company, container, false);
        ImageView imgBanner = view.findViewById(R.id.image_banner);

        Picasso.get().load(R.drawable.beans).into(imgBanner);
        return view;
    }
}
