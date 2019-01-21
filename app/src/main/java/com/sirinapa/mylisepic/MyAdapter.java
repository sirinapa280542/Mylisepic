package com.sirinapa.mylisepic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Data>mdatas;
    private LayoutInflater mlayout;

    public MyAdapter (Context context,List<Data> aList){
        mdatas = aList;
        mlayout = LayoutInflater.from(context);
    }
    static class ViewHolder{
        TextView tvTitle;
        TextView tvDesc;
        ImageView img;
    }

    @Override
    public int getCount() {
        return mdatas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            view = mlayout.inflate(R.layout.list_row,viewGroup,false);
            holder = new ViewHolder();
            holder.tvTitle = (TextView) view.findViewById(R.id.txtTitle);
            holder.tvDesc = (TextView) view.findViewById(R.id.txtDescription);
            holder.img = (ImageView) view.findViewById(R.id.icon);
            view.setTag(holder);
        } else {
            holder = (ViewHolder)view.getTag();
        }
        String title = mdatas.get(position).getmText1();
        holder.tvTitle.setText(title);
        holder.tvDesc.setText(mdatas.get(position).getmText2());
        holder.img.setImageResource(mdatas.get(position).getmIcon());


        return view;
    }
}
