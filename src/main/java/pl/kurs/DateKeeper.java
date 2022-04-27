package pl.kurs;

import java.util.Date;

public class DateKeeper {

    private Date date;

    public DateKeeper() {
    }

    public DateKeeper(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "DateKeeper{" +
                "date=" + date +
                '}';
    }
}
