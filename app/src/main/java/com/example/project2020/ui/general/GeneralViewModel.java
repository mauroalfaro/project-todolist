package com.example.project2020.ui.general;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GeneralViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GeneralViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the General fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}