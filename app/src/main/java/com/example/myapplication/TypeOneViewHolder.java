package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 追梦 on 2017/4/20.
 */

public class TypeOneViewHolder extends TypeAbstractViewHolder<DataModelOne> {

    public ImageView avatar;
    public TextView name;

    public TypeOneViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        name = (TextView) itemView.findViewById(R.id.name);

        itemView.setBackgroundColor(Color.GRAY);
    }

    @Override
    public void bindHolder(DataModelOne modle){
        avatar.setBackgroundResource(modle.avatarColor);
        name.setText(modle.name);
    }
}
