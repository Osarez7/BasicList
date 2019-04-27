package co.edu.intecap.listexample;

import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ItemViewHolder extends RecyclerView.ViewHolder {
    public ItemViewHolder(@NonNull final View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Click!!! " + ItemViewHolder.this.getLayoutPosition(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
