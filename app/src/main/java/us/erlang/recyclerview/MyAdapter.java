package us.erlang.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Data> list;

    public MyAdapter(List<Data> myDataset) {
        list = myDataset;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Data.TYPE_HEADER:
                view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header_view, parent, false);
                return new ItemHeaderViewHolder(view);
            case Data.TYPE_ITEM:
                view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
                return new ItemViewHolder(view);
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
                    ((ItemHeaderViewHolder) holder).setData(data);
                    break;
                case Data.TYPE_ITEM:
                    ((ItemViewHolder) holder).setData(data);
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

