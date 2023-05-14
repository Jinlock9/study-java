package ch2.ch2_10;

public class Birthday {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        isValid = month >= 1 && month <= 12;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "/" + month + "/" + day);
        }
        else {
            System.out.println("Error : Invalid Date");
        }
    }
}
