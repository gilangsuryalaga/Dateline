package com.example.dateline;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    List<ListContent> listContent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list,null);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_list);
        RecyclerViewAdapterList recyclerViewAdapter = new RecyclerViewAdapterList(getContext(),listContent);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        listContent = new ArrayList<>();
        listContent.add(new ListContent("Wedding 1","Rp.21.000.000",R.drawable.wedding1));
        listContent.add(new ListContent("Wedding 2","Rp.22.000.000",R.drawable.wedding2));
        listContent.add(new ListContent("Wedding 3","Rp.23.000.000",R.drawable.wedding3));
        listContent.add(new ListContent("Wedding 4","Rp.24.000.000",R.drawable.wedding4));
        listContent.add(new ListContent("Wedding 5","Rp.25.000.000",R.drawable.wedding5));
        listContent.add(new ListContent("Wedding 6","Rp.26.000.000",R.drawable.wedding6));
        listContent.add(new ListContent("Wedding 7","Rp.27.000.000",R.drawable.wedding7));
        listContent.add(new ListContent("Wedding 8","Rp.28.000.000",R.drawable.wedding8));
        listContent.add(new ListContent("Wedding 9","Rp.29.000.000",R.drawable.wedding9));
        listContent.add(new ListContent("Wedding 10","Rp.30.000.000",R.drawable.wedding10));
    }
}
