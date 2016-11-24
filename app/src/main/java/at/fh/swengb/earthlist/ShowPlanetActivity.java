package at.fh.swengb.earthlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowPlanetActivity extends AppCompatActivity {

    private Planet planet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_planet);

        Intent intent = getIntent();
        planet = (Planet)intent.getExtras().get("planet");

        TextView name = (TextView) findViewById(R.id.planetName);
        TextView surface = (TextView) findViewById(R.id.planetSurface);
        TextView temp = (TextView) findViewById(R.id.planetTemp);
        TextView size = (TextView) findViewById(R.id.planetSize);

        name.setText("Name: " + planet.getName());
        surface.setText("Surface: " + planet.getSurface());
        temp.setText(planet.getTemperature()+ " °C Average");
        size.setText(planet.getSize() + " km Diameter");

    }


    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+planet.getName());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+planet.getSize());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
