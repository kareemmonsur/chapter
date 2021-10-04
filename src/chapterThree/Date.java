package chapterThree;


public class Date {
    private int month;
    private int year;
    private int day;

    public Date(int month, int day, int year) {

        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setMonth(int month) {
        if(month >= 0 && month < 12){
            this.month = month;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day >= 0 && day < 31 )
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }
}
