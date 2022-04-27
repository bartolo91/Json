package car_task.model;

public enum Addon {

    AIR_CONDITION(2000),
    SEAT_MASSAGE(5000),
    AUDIO_SYSTEM(1000),
    APPLE_CAR_PLAY(1500);

    int price;

    Addon(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
