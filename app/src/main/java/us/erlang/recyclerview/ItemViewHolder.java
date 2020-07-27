package us.erlang.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private View itemView;
    private TextView title, description, number;
    private ImageView avatar;

    public ItemViewHolder(View view) {
        super(view);
        itemView = view;
        title = itemView.findViewById(R.id.item_title);
        description = itemView.findViewById(R.id.item_description);
        number = itemView.findViewById(R.id.item_number);
        avatar = itemView.findViewById(R.id.image_view);
    }

    public void setData(Data data) {
        title.setText(data.getTitle());
        description.setText(data.getDescription());
        number.setText(String.valueOf(data.getNumber()));

        Glide.with(avatar).load(data.getAvatar()).into(avatar);
    }
}
