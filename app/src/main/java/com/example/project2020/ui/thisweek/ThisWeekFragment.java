package com.example.project2020.ui.thisweek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.project2020.R;

public class ThisWeekFragment extends Fragment {

    private ThisWeekViewModel thisWeekViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        thisWeekViewModel =
                ViewModelProviders.of(this).get(ThisWeekViewModel.class);
        View root = inflater.inflate(R.layout.fragment_thisweek, container, false);
        final TextView textView = root.findViewById(R.id.text_thisweek);
        thisWeekViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
