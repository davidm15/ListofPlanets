package at.fh.swengb.earthlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Planet> listPlanets;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myUserList);

        listPlanets = new ArrayList<>();
        listPlanets.add(new Planet("Earth", "Mischoberflaeche","20","12742"));
        listPlanets.add(new Planet("Mars", "Red","-55","6779"));
        listPlanets.add(new Planet("Jupiter", "Gas","-108","138346"));
        listPlanets.add(new Planet("Saturn", "Gas","-139","116464"));
        listPlanets.add(new Planet("Merkur", "Stone","167","4880"));

        myAdapter = new CustomAdapter(this,listPlanets);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Planet selectedUser = listPlanets.get(i);
        Intent intent = new Intent(view.getContext(),ShowPlanetActivity.class);
        intent.putExtra("planet",selectedUser);
        startActivity(intent);

    }

}
