package com.example.my_project;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private LayoutInflater inflater;
    private List<Chat> chats;

    Adapter(Context context, List<Chat> chats){
        this.chats = chats;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_chat, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Chat chat = chats.get(position);
        holder.nameView.setText(chat.getName());
        holder.themeView.setText(chat.getThemes());
        holder.fieldView.setText(chat.getFields());
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, themeView, fieldView;
        ViewHolder(View view){
            super(view);
            nameView = (TextView) view.findViewById(R.id.name);
            themeView = (TextView) view.findViewById(R.id.theme);
            fieldView = (TextView) view.findViewById(R.id.field);
        }
    }

}
