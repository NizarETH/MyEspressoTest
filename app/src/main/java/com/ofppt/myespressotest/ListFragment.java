package com.ofppt.myespressotest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {


    private View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.list_data, container, false);

        ListView listView = v.findViewById(R.id.list_view);

        List<String> data = new ArrayList<>();
        data.add("AAAAA");
        data.add("BBBBB");
        data.add("CCCCC");
        data.add("DDDDD");
        data.add("EEEEE");

        listView.setAdapter(new MyAdapter(data, getActivity()));

        return v;
    }
}
