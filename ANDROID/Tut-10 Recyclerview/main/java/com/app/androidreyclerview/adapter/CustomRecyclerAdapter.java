package com.app.androidreyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.androidreyclerview.Item;
import com.app.androidreyclerview.MainActivity;
import com.app.androidreyclerview.R;
import com.app.androidreyclerview.databinding.CustomListItemBinding;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Item> itemList;
    private CustomListItemBinding binding;

    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{

        void onItemClicked(Item item, int pos);
        void onRemoveMenuItemClicked(Item item);
        void onEditMenuItemClicked(Item item);
        void onCancelMenuItemClicked();


    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    public CustomRecyclerAdapter(Context context, ArrayList<Item> itemList)
    {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      //  View view = LayoutInflater.from(context).inflate(R.layout.custom_list_item_horizontal, parent, false);
        binding = CustomListItemBinding.inflate(LayoutInflater.from(context), parent, false);
      //  MyViewHolder holder = new MyViewHolder(view);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item item = itemList.get(position);
        holder.binding.tvTitle.setText(item.getTitle());
        holder.binding.tvDesc1.setText(item.getDesc());
        holder.binding.ivLogo.setImageResource(item.getImageId());
        holder.binding.ratingBar.setRating(item.getRating());

    /*    holder.cardView.setOnClickListener(view -> {

        });*/

        holder.binding.ivLogo.setOnClickListener(view -> {
            /*Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
            Toast.makeText(context, ""+item.getTitle(), Toast.LENGTH_SHORT).show();*/
            onItemClickListener.onItemClicked(item, position);
        });

        holder.binding.ivOption.setOnClickListener(view -> {
            // show popup menu
            showPopupMenu(view, item);
        });

    }

    private void showPopupMenu(View view, Item item) {

        PopupMenu popup = new PopupMenu(context, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.option_menu, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(menuItem -> {
            switch (menuItem.getItemId()){
                case R.id.action_remove:
                    onItemClickListener.onRemoveMenuItemClicked(item);
                    break;
                case R.id.action_edit:
                    onItemClickListener.onEditMenuItemClicked(item);
                    Toast.makeText(context, "Edit : "+item.getTitle(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_cancel:
                    onItemClickListener.onCancelMenuItemClicked();

                    break;
            }
            return false;
        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        CustomListItemBinding binding;

/*
        ImageView ivLogo;
        TextView tvTitle, tvDesc;
        RatingBar ratingBar;
        CardView cardView;
*/

        public MyViewHolder(@NonNull CustomListItemBinding binding) {
            super(binding.getRoot())
            ;
            this.binding = binding;
            /*ivLogo = itemView.findViewById(R.id.iv_logo);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc1);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            cardView = itemView.findViewById(R.id.card_view);*/
        };
    }

    public void removeItem(Item selectedItem){


        Iterator iterator = itemList.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            if(item.getId() == selectedItem.getId())
                iterator.remove();
        }
        notifyDataSetChanged();
    }

    public void updateItem(Item updatedItem)
    {

    }

}
