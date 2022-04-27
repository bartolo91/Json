package club_task.model;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private String club;
    private String country;
    private int year;
    private boolean isSuper;
    private String captain;
    private List<String> titles;

    public static List<Club> clubExtension = new ArrayList<>();

    public Club() {
        clubExtension.add(this);
    }

    public Club(String club, String country, int year, boolean isSuper, String captain, List<String> titles) {
        this.club = club;
        this.country = country;
        this.year = year;
        this.isSuper = isSuper;
        this.captain = captain;
        this.titles = titles;
        clubExtension.add(this);
    }

    public String getClub() {
        return club;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsSuper() {
        return isSuper;
    }

    public String getCaptain() {
        return captain;
    }

    public List<String> getTitles() {
        return titles;
    }

    @Override
    public String toString() {
        return "Club{" +
                "club='" + club + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", isSuper=" + isSuper +
                ", captain='" + captain + '\'' +
                ", titles=" + titles +
                '}';
    }
}

