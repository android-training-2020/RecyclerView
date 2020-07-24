package us.erlang.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Data> list;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView title, description, number;

        public MyViewHolder(View view) {
            super(view);
            itemView = view;
            title = itemView.findViewById(R.id.item_title);
            description = itemView.findViewById(R.id.item_description);
            number = itemView.findViewById(R.id.item_number);
        }

        public void setData(Data data) {
            title.setText(data.title);
            description.setText(data.description);
            number.setText(String.valueOf(data.number));
        }
    }

    public MyAdapter(List<Data> myDataset) {
        list = myDataset;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
        viewHolder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

