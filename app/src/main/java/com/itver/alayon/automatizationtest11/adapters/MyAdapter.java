package com.itver.alayon.automatizationtest11.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.itver.alayon.automatizationtest11.R;
import com.itver.alayon.automatizationtest11.models.Build;

import java.util.List;


/**
 * Created by Alayon on 09/11/2017.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Build> buildList;

    public MyAdapter(Context context, int layout, List<Build> buildList){
        this.context = context;
        this.layout = layout;
        this.buildList = buildList;
    }

    @Override
    public int getCount() {
        return buildList.size();
    }

    @Override
    public Object getItem(int position) {
        return buildList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null){
           LayoutInflater inflater = LayoutInflater.from(context);
           convertView = inflater.inflate(layout, null);
           holder = new ViewHolder();

          holder.textViewNameBuild = (TextView) convertView.findViewById(R.id.textViewNameBuild);
          holder.textViewNumClassRooms = (TextView) convertView.findViewById(R.id.textViewNumberClassRooms);
          //holder.imageViewIcon = (ImageView) convertView.findViewById(R.id.imageViewIcon);
          convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        final Build b = (Build) getItem(position);
        holder.textViewNameBuild.setText(b.getNameBuild());
        holder.textViewNumClassRooms.setText("Numero de salones: " + b.getNumberClassRoom());
        //RECUPERAR LA IMAGEN

        return convertView;

    }

    static class ViewHolder{
        private TextView textViewNameBuild;
        private TextView textViewNumClassRooms;
        //private ImageView imageViewIcon;
    }
}