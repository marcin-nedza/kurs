package src.com.kurs.lesson2.excercise5;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private String lastName;
    private Map<Tournament, Integer> positions = new HashMap<>();
    private Map<Tournament, Integer> points = new HashMap<>();

    public Player(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Tournament, Integer> getPositions() {
        return positions;
    }

    public Map<Tournament, Integer> getPoints() {
        return points;
    }

    public void addResult(Tournament tournament, int position, int point) {
        this.positions.put(tournament, position);
        this.points.put(tournament, point);
    }
}
