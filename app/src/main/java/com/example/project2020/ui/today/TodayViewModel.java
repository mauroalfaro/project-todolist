package com.example.project2020.ui.today;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.project2020.R;

public class TodayViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public TodayViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue(getApplication().getString(R.string.today_fragment_default));
    }

    public LiveData<String> getText() {
        return mText;
    }
}