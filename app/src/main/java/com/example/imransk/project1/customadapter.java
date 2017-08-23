package com.example.imransk.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by imran sk on 7/1/2017.
 */

public class customadapter extends BaseAdapter {
    String[] headline;
    String[] time;
    int[] images;
    Context ct;
    private static LayoutInflater inflater = null;

    public customadapter(MainActivity mainActivity, String[] newsHeadline, String[] timeago, int[] newsImage) {
        headline = newsHeadline;
        time = timeago;
        images = newsImage;
        ct = mainActivity;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return headline.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    public class myholder {
        ImageView imageView;
        TextView headline, time;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        myholder myholderobj= new myholder();

        view = inflater.inflate(R.layout.listcustom,null);
        myholderobj.imageView = (ImageView) view.findViewById(R.id.headImage);
        myholderobj.headline = (TextView) view.findViewById(R.id.newsheadline);
        myholderobj.time = (TextView) view.findViewById(R.id.timetextview);

        myholderobj.headline.setText(headline[i]);
        myholderobj.time.setText(time[i]);
        myholderobj.imageView.setImageResource(images[i]);
        return view;
    }


}
