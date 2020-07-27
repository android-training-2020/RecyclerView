package us.erlang.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Data> list;
    private RecyclerView.ViewHolder viewHolder;

    public MyAdapter(List<Data> myDataset) {
        list = myDataset;
    }

//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
//                                                     int viewType) {
//        View v = (View) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_view, parent, false);
//
//        MyViewHolder viewHolder = new MyViewHolder(v);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
//        viewHolder.setData(list.get(position));
//    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Data.TYPE_HEADER:
                view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header_view, parent, false);
                viewHolder = new ItemHeaderViewHolder(view);
                return viewHolder;
            case Data.TYPE_ITEM:
                view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
                viewHolder = new ItemViewHolder(view);
                return viewHolder;
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Data data = list.get(position);
        if (data != null) {
            switch (data.getType()) {
                case Data.TYPE_HEADER:
                    ((ItemHeaderViewHolder) viewHolder).setData(data);
                    break;
                case Data.TYPE_ITEM:
                    ((ItemViewHolder) viewHolder).setData(data);
                    break;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

