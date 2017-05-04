package com.example.myapplication;

        import android.support.v7.widget.RecyclerView;
        import android.view.View;

/**
 * Created by 追梦 on 2017/4/20.
 */

public abstract class TypeAbstractViewHolder<T> extends RecyclerView.ViewHolder {
    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindHolder(T modle);
}
