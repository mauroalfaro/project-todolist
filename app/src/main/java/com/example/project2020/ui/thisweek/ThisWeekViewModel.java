package com.example.project2020.ui.thisweek;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.project2020.R;

public class ThisWeekViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public ThisWeekViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue(getApplication().getString(R.string.thisweek_fragment_default));
    }

    public LiveData<String> getText() {
        return mText;
    }
}