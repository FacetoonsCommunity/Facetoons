package org.kashish.facetoons.boarding_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import org.kashish.facetoons.R;

public class ForgetPassFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsranceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.forget_pass_fragment, container, false);

        return root;
    }
}
