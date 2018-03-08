package in.supertroninfotech.httpwww.databindingtuts.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.supertroninfotech.httpwww.databindingtuts.R;
import in.supertroninfotech.httpwww.databindingtuts.databinding.AdaptersampleProjectBinding;
import in.supertroninfotech.httpwww.databindingtuts.model.SimpleObject;

/**
 * Created by User1 on 02-03-2018.
 */


public class SimpleObjectAdapter extends RecyclerView.Adapter<SimpleObjectAdapter.SimpleObjectHolder> {

    AdaptersampleProjectBinding binding;
    List<SimpleObject> item;


    public SimpleObjectAdapter(Context mContext, List<SimpleObject> list) {
        super();
        this.item=list;

    }

    @NonNull
    @Override
    public SimpleObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adaptersample_project, parent, false);
        return new SimpleObjectHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleObjectHolder holder, int position) {
        holder.bindConnection(item.get(position));
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class SimpleObjectHolder extends RecyclerView.ViewHolder {
        AdaptersampleProjectBinding binding;

        public SimpleObjectHolder(AdaptersampleProjectBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bindConnection(SimpleObject obj) {
            binding.setSimpledataobject(obj);
        }
    }
}


