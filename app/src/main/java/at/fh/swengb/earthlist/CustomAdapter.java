package at.fh.swengb.earthlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by David on 24.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<Planet> listPlanets;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Planet> listPlanets) {
        this.context = applicationContext;
        this.listPlanets= listPlanets;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listPlanets.size();
    }

    @Override
    public Object getItem(int i) {
        return listPlanets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.planetName);
        TextView viewSurface=(TextView)view.findViewById(R.id.planetSurface);
        TextView viewSize=(TextView)view.findViewById(R.id.planetSize);

        Planet Planet = listPlanets.get(i);
        viewName.setText(Planet.getName());
        viewSurface.setText(Planet.getSurface());
        viewSize.setText(Planet.getSize());

        return view;
    }
}
