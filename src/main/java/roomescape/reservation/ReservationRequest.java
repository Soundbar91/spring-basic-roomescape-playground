package roomescape.reservation;

public class ReservationRequest {
    private String name;
    private String date;
    private Long theme;
    private Long time;

    public void addName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public Long getTheme() {
        return theme;
    }

    public Long getTime() {
        return time;
    }
}
