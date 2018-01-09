package com.example.alexr.wiredbraincoffeeco;


import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.alexr.wiredbraincoffeeco.Helpers.UrlHelper;
import com.squareup.picasso.Picasso;

public class CompanyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_company, container, false);

        ImageView banner = (ImageView) view.findViewById(R.id.banner);
        ImageView contact = (ImageView) view.findViewById(R.id.icon_contact);
        ImageView wait = (ImageView) view.findViewById(R.id.icon_wait);
        ImageView drivethru = (ImageView) view.findViewById(R.id.icon_drivethru);

        Picasso.with(getContext()).load(UrlHelper.BaseUrl + "wired-brain-coffee-logo.png").fit().centerCrop().into(banner);
        Picasso.with(getContext()).load(resourceIdToUri(getContext(), R.mipmap.contact)).fit().centerInside().into(contact);
        Picasso.with(getContext()).load(resourceIdToUri(getContext(), R.mipmap.wait)).fit().centerInside().into(wait);
        Picasso.with(getContext()).load(resourceIdToUri(getContext(), R.mipmap.fuel)).fit().centerInside().into(drivethru);

        return view;
    }

    public static final String ANDROID_RESOURCE = "android.resource://";
    public static final String FOREWARD_SLASH = "/";

    private static Uri resourceIdToUri(Context context, int resourceId) {
        return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resourceId);
    }
}
