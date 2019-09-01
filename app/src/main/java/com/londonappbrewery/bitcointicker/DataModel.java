package com.londonappbrewery.bitcointicker;
import org.json.JSONException;
import org.json.JSONObject;

public class DataModel {
     private String rate;
     public static  DataModel fromJSON(JSONObject jsonObject){

         try {

            DataModel data = new DataModel();
            data.rate = jsonObject.getString("last");
            return data;
         } catch (JSONException e){

             return null;
         }
     }

    public String getRate() {
        return rate;
    }
}
