package co.edu.intecap.listexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItems = findViewById(R.id.rv_items);

        //1 Layout Manager
        rvItems.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.HORIZONTAL, false));

        //2 Asignar un adapter
        rvItems.setAdapter(new AdapterItems());
    }
}
