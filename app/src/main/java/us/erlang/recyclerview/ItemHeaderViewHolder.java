package us.erlang.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemHeaderViewHolder extends RecyclerView.ViewHolder {
    private View itemHeaderView;
    private TextView title;

    public ItemHeaderViewHolder(View view) {
        super(view);
        itemHeaderView = view;
        title = itemHeaderView.findViewById(R.id.header_title);
    }

    public void setData(Data data) {
        title.setText(data.getTitle());
    }
}
