package com.example.dateline;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    SliderLayout SliderLayout;
    private LinearLayout mLinearLayout;
    private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView2;
    private List<Content> listContent;
    private List<Content> listContent2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, null);

        // Inflate the layout for this fragment
        SliderLayout = (SliderLayout) rootView.findViewById(R.id.imageSlider);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);

        //Recycler View
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listContent);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);

        mRecyclerView2 = (RecyclerView) rootView.findViewById(R.id.recycler2);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView2.setAdapter(recyclerViewAdapter);
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContent = new ArrayList<>();
        listContent.add(new Content("Wedding 1","Rp.21.000.000",R.drawable.wedding1));
        listContent.add(new Content("Wedding 2","Rp.22.000.000",R.drawable.wedding2));
        listContent.add(new Content("Wedding 3","Rp.23.000.000",R.drawable.wedding3));
        listContent.add(new Content("Wedding 4","Rp.24.000.000",R.drawable.wedding4));
        listContent.add(new Content("Wedding 5","Rp.25.000.000",R.drawable.wedding5));
        listContent.add(new Content("Wedding 6","Rp.26.000.000",R.drawable.wedding6));
        listContent.add(new Content("Wedding 7","Rp.27.000.000",R.drawable.wedding7));
        listContent.add(new Content("Wedding 8","Rp.28.000.000",R.drawable.wedding8));
        listContent.add(new Content("Wedding 9","Rp.29.000.000",R.drawable.wedding9));
        listContent.add(new Content("Wedding 10","Rp.30.000.000",R.drawable.wedding10));
    }
}
