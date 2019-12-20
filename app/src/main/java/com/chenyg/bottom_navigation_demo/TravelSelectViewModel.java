package com.chenyg.bottom_navigation_demo;

import com.chenyg.bottom_navigation_demo.entity.TravelMessage;
import com.chenyg.bottom_navigation_demo.service.impl.TravelSelectSVImpl;
import com.chenyg.bottom_navigation_demo.service.interfaces.ITravelSelectSV;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TravelSelectViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    MutableLiveData<List<TravelMessage>> allTravelMessageLiveData;
    ITravelSelectSV travelSelectSV;
    public LiveData<List<TravelMessage>> getTravelMessages() {
        if(allTravelMessageLiveData == null){
            allTravelMessageLiveData = new MutableLiveData<>();
            travelSelectSV = new TravelSelectSVImpl();
            allTravelMessageLiveData.setValue(travelSelectSV.getAllTravelMessage());
        }
        return allTravelMessageLiveData;
    }
}
