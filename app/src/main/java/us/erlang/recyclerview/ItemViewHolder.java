package us.erlang.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private View itemView;
    private TextView title, description, number;

    public ItemViewHolder(View view) {
        super(view);
        itemView = view;
        title = itemView.findViewById(R.id.item_title);
        description = itemView.findViewById(R.id.item_description);
        number = itemView.findViewById(R.id.item_number);
    }

    public void setData(Data data) {
        title.setText(data.getTitle());
        description.setText(data.getDescription());
        number.setText(String.valueOf(data.getNumber()));
    }
}
