package com.alfarosoft.todolistapp.ui.tags;

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

import com.alfarosoft.todolistapp.R;

public class TagsFragment extends Fragment {

    private TagsViewModel tagsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tagsViewModel =
                ViewModelProviders.of(this).get(TagsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tags, container, false);
        final TextView textView = root.findViewById(R.id.text_tags);
        tagsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
