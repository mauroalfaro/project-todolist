package com.example.project2020.ui.thisweek;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThisWeekViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThisWeekViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is This Week fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}