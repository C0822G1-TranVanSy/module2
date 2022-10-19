package casy_study.mvc.models;

public class Facility {
    private String nameService;
    private double area;
    private int costRent;
    private int maxPeople;
    private String dateRent;

    public Facility(String nameService, double area, int costRent, int maxPeople, String dateRent) {
        this.nameService = nameService;
        this.area = area;
        this.costRent = costRent;
        this.maxPeople = maxPeople;
        this.dateRent = dateRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCostRent() {
        return costRent;
    }

    public void setCostRent(int costRent) {
        this.costRent = costRent;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getDateRent() {
        return dateRent;
    }

    public void setDateRent(String dateRent) {
        this.dateRent = dateRent;
    }
}
