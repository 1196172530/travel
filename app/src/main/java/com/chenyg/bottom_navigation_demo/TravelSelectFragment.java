package com.chenyg.bottom_navigation_demo;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.chenyg.bottom_navigation_demo.activity.TravelSelectDetailsActivity;
import com.chenyg.bottom_navigation_demo.adapter.TravelSelectAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TravelSelectFragment extends Fragment {

    private TravelSelectViewModel travelSelectViewModel;
    RecyclerView recyclerView;
    TravelSelectAdapter travelSelectAdapter;
    Button btnNext;

    public static TravelSelectFragment newInstance() {
        return new TravelSelectFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        travelSelectViewModel = ViewModelProviders.of(this).get(TravelSelectViewModel.class);
        View view = inflater.inflate(R.layout.travel_select_fragment, container, false);
        initView(view);
        return view;
    }


    private void initView(View view) {
        recyclerView = view.findViewById(R.id.travelRecycleView);
        travelSelectAdapter = new TravelSelectAdapter(getContext());
        travelSelectAdapter.setTravelMessages(travelSelectViewModel.getTravelMessages().getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(travelSelectAdapter);

        /*String host = "http://scenicspot.market.alicloudapi.com";
        String path = "/lianzhuo/scenicspot";
        String appcode = "e9cf2f747f1c43eeb5cbf8490dbcea22";
        HttpParams params = new HttpParams();
        params.putHeaders("Authorization", "APPCODE " + appcode);
        params.put("page", "1");
        params.put("province", "湖南");
        params.put("city", "郴州");
        //params.put("spot", "飞天山");
        RxVolley.jsonGet(host + path, params, new HttpCallback() {
            @Override
            public void onSuccess(String t) {

                parseJson(t);
            }

            @Override
            public void onFailure(int errorNo, String strMsg) {
                Log.d("接口请求异常",errorNo+strMsg);
            }
        });*/
        /*String json = "";
        parseJson(json);*/
    }

    /*private void parseJson(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject jsonObjectData = jsonObject.getJSONObject("data");
            JSONArray jsonArray = jsonObjectData.getJSONArray("record");
            for(int i=0; i<jsonArray.length(); i++){
                JSONObject jsonBean  = (JSONObject) jsonArray.get(i);
                Log.d("JOSN",jsonBean.getString("spot"));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }*/

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

}
