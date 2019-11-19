package com.example.testsound;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RcvAdapter extends RecyclerView.Adapter<RcvAdapter.AnimalVH> {

    List<Animal> animals;

    MediaPlayer sound;

    Context context;

    public RcvAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public RcvAdapter.AnimalVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new AnimalVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RcvAdapter.AnimalVH holder, int position) {

        holder.imgvAnimal.setImageResource(animals.get(position).image);
        holder.txtvName.setText(animals.get(position).name);


        /*switch(position){
            case 0:
                holder.imgvAnimal.setImageResource(R.drawable.caballo);
                //sound = MediaPlayer.create(context, R.raw.caballo);
                break;
            case 1:
                holder.imgvAnimal.setImageResource(R.drawable.cabra);
                break;
            case 2:
                holder.imgvAnimal.setImageResource(R.drawable.cerdo);
                break;
            case 3:
                holder.imgvAnimal.setImageResource(R.drawable.gallo);
                break;
            case 4:
                holder.imgvAnimal.setImageResource(R.drawable.mono);
                break;
            case 5:
                holder.imgvAnimal.setImageResource(R.drawable.perro);
                break;
            case 6:
                holder.imgvAnimal.setImageResource(R.drawable.serpiente);
                break;
            case 7:
                holder.imgvAnimal.setImageResource(R.drawable.tigre);
                break;
        }*/

    }

    @Override
    public int getItemCount() {
        return animals.size();
        //return 8;
    }

    public class AnimalVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgvAnimal;
        TextView txtvName;

        public AnimalVH(@NonNull View itemView) {
            super(itemView);
            imgvAnimal = itemView.findViewById(R.id.imgvAnimal);
            txtvName = itemView.findViewById(R.id.txtvName);

            /*
             * enabled click on item
             */
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (sound != null){
                sound.stop();
            }

            sound = MediaPlayer.create(context, animals.get(getAdapterPosition()).sound);
            sound.start();

            /*sound = MediaPlayer.create(context.getApplicationContext(), R.raw.gallo);
            sound.start();*/
            Log.d("___sound", "sound");
            //getAdapterPosition();
        }
    }
}
