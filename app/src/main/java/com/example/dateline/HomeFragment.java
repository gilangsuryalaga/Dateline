package com.example.dateline;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    SliderLayout SliderLayout;
    private LinearLayout mLinearLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, null);
        // Inflate the layout for this fragment
        SliderLayout = (SliderLayout) rootView.findViewById(R.id.imageSlider);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        setSliderViews();
        return rootView;
    }

    private void setSliderViews(){
        for (int i = 0; i <= 3; i++){
            SliderView sliderView =new SliderView(getContext());
            switch (i){
                case 0:
                    sliderView.setImageDrawable(R.drawable.weddingpewds);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.pic2);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.pic3);
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.pic4);
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            SliderLayout.addSliderView(sliderView);
        }
    }
}
