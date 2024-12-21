package vn.edu.taipp.projectfinalexam.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.taipp.projectfinalexam.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<String> data;
    private List<String> title;

    public MyAdapter(List<String> data, List<String> title) {
        this.data = data;
        this.title = title;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.textView1.setText(data.get(position));
       holder.textView2.setText(title.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.stt);
            textView2 = itemView.findViewById(R.id.ten);
        }
    }
    // Thêm phần tử mới vào danh sách
    public void addItem(String newData, String newtitle) {
        data.add(newData);
        title.add(newtitle);
        notifyItemInserted(data.size() - 1); // Thông báo phần tử mới đã được thêm
    }
}
