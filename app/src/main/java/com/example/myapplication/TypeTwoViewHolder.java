package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 追梦 on 2017/4/20.
 */

public class TypeTwoViewHolder extends TypeAbstractViewHolder<DataModelTwo> {

    public ImageView avatar;
    public TextView name;
    public TextView content;

    public TypeTwoViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        name = (TextView) itemView.findViewById(R.id.name);
        content = (TextView) itemView.findViewById(R.id.content);

        itemView.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public void bindHolder(DataModelTwo modle){
        avatar.setBackgroundResource(modle.avatarColor);
        name.setText(modle.name);
        content.setText(modle.content);
    }
}
