package ru.itis.listapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.LessonViewHolder> {

    private ArrayList<Lesson> mLessons;

    public LessonAdapter(ArrayList<Lesson> lessons) {
        mLessons = lessons;
    }

    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_lessons,
                parent,
                false);
        return new LessonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        final Lesson lesson = mLessons.get(position);
        holder.tvName.setText(lesson.getName());
        holder.tvTime.setText(lesson.getTime());
        holder.tvRoom.setText(lesson.getRoom());
        holder.ivPicture.setImageResource(R.drawable.image);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), lesson.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mLessons.size();
    }

    public class LessonViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvTime;
        TextView tvRoom;
        ImageView ivPicture;
        View view;

        public LessonViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
            tvRoom = (TextView) itemView.findViewById(R.id.tv_room);
            ivPicture = (ImageView) itemView.findViewById(R.id.iv);
        }
    }

}
