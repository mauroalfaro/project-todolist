package com.example.project2020.ui.general;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.project2020.R;

public class GeneralViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public GeneralViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue(getApplication().getString(R.string.general_fragment_default));
    }

    public LiveData<String> getText() {
        return mText;
    }
}