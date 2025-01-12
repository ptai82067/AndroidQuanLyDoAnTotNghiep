package vn.edu.taipp.projectfinalexam.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BinhLuan;

public class BinhLuanAdapter extends RecyclerView.Adapter<BinhLuanAdapter.BinhLuanViewHolder> {
    private List<BinhLuan> binhLuanList;

    public BinhLuanAdapter(List<BinhLuan> binhLuanList) {
        this.binhLuanList = binhLuanList;
    }

    @NonNull
    @Override
    public BinhLuanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_binh_luan, parent, false);
        return new BinhLuanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BinhLuanViewHolder holder, int position) {
        BinhLuan binhLuan = binhLuanList.get(position);
        holder.tv_comment.setText(binhLuan.getNoiDung());
        holder.tv_date.setText(binhLuan.getNgayBinhLuan());
        holder.tv_person.setText(binhLuan.getNguoiBinhLuan().getHoTen());

    }

    @Override
    public int getItemCount() {
        return binhLuanList.size();
    }

    public static class BinhLuanViewHolder extends RecyclerView.ViewHolder {
        TextView tv_person, tv_date, tv_comment;

        public BinhLuanViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_person = itemView.findViewById(R.id.tv_person);
            tv_date = itemView.findViewById(R.id.tv_date);
            tv_comment = itemView.findViewById(R.id.tv_comment);
        }
    }
}
