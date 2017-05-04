package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 追梦 on 2017/4/20.
 */

public class TypeThreeViewHolder extends TypeAbstractViewHolder<DataModelThree> {

    public ImageView avatar;
    public TextView name;
    public TextView content;
    public ImageView contentImage;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        name = (TextView) itemView.findViewById(R.id.name);
        content = (TextView) itemView.findViewById(R.id.content);
        contentImage = (ImageView) itemView.findViewById(R.id.contentImage);

        itemView.setBackgroundColor(Color.DKGRAY);
    }

    @Override
    public void bindHolder(DataModelThree modle){
        avatar.setBackgroundResource(modle.avatarColor);
        name.setText(modle.name);
        content.setText(modle.content);
        contentImage.setBackgroundResource(modle.contentColor);
    }
}
