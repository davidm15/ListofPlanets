package at.fh.swengb.earthlist;

import java.io.Serializable;

/**
 * Created by David on 24.11.2016.
 */

public class Planet implements Serializable {

    private String name;
    private String surface;
    private String temperature;
    private String size;

    public Planet(String name, String surface, String temperature, String size) {
        this.name = name;
        this.surface = surface;
        this.temperature = temperature;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        if (name != null ? !name.equals(planet.name) : planet.name != null) return false;
        if (surface != null ? !surface.equals(planet.surface) : planet.surface != null)
            return false;
        if (temperature != null ? !temperature.equals(planet.temperature) : planet.temperature != null)
            return false;
        return size != null ? size.equals(planet.size) : planet.size == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surface != null ? surface.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", surface='" + surface + '\'' +
                ", temperature='" + temperature + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
