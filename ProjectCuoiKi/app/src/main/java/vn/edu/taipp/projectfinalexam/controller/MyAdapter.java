package vn.edu.taipp.projectfinalexam.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiViet;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<String> gvs, dates, tieudes, contents;
    private OnItemClickListener listener; // Interface lắng nghe sự kiện click

    public MyAdapter(List<String> gvs, List<String> dates,List<String> tieudes,List<String> contents) {
        this.gvs = gvs;
        this.dates = dates;
        this.tieudes = tieudes;
        this.contents = contents;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.tv_gv.setText(gvs.get(position));
       holder.tv_date.setText(dates.get(position));
       holder.tv_tieude.setText(tieudes.get(position));
       holder.tv_content.setText(contents.get(position));
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position); // Gọi khi item được click
            }
        });
    }

    @Override
    public int getItemCount() {
        return gvs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_gv,tv_date,tv_tieude,tv_content;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_gv = itemView.findViewById(R.id.tv_person);
            tv_date = itemView.findViewById(R.id.tv_date);
            tv_tieude = itemView.findViewById(R.id.tv_tieude);
            tv_content = itemView.findViewById(R.id.tv_comment);
        }
    }
    // Thêm phần tử mới vào danh sách
    public void addItem(BaiViet baiViet) {
        gvs.add(baiViet.getGiang_vien().getHoTen());
        dates.add(baiViet.getNgayTao());
        tieudes.add(baiViet.getTieuDe());
        contents.add(baiViet.getNoiDung());
        notifyItemInserted(gvs.size() - 1); // Thông báo phần tử mới đã được thêm
    }
    public interface OnItemClickListener {
        void onItemClick(int position); // Interface để xử lý click
    }
}
