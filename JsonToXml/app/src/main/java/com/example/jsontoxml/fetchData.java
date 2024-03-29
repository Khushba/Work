package com.example.jsontoxml;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Abhishek Panwar on 7/14/2017.
 */

public class fetchData extends AsyncTask<Void,Void,Void> {
    String data ="";
    String dataParsed = "";
    String singleParsed ="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://api.alquran.cloud/v1/search/servant/all/en");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            JSONObject JO1 = new JSONObject(data);
            JSONObject JO2 = JO1.getJSONObject("data");
                   JSONArray JA = JO2.getJSONArray("matches");
                 for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);

                         singleParsed = "NUMBER : " + JO.get("number") + "\n\n" +
                                 "TEXT : " + JO.get("text") + "\n\n\n\n";
                         dataParsed = dataParsed + singleParsed;

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.dataParsed);

    }
}