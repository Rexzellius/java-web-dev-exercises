package studios;

import java.time.*;
// there is a better option than making category a string
public class MenuItem {
    private String name;
    private double price = 0.0;
    private String description;
    private String category;
    private boolean isNew;
    private final LocalDate lastUpdated;

    public MenuItem(String name, double price, String description, String category, boolean isNew, LocalDate lastUpdated){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.lastUpdated = LocalDate.now();
    }
    // setters
    protected void setName(String name){
        this.name = name;
    }
    protected void setPrice(double price){
        this.price = price;
    }
    protected void setDescription(String description){
        this.description = description;
    }
    protected void setCategory(String category){
        this.category = category;
    }
    protected void setIsNew(boolean newItem){
        this.isNew = !this.isNew;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public boolean getIsNew(){
        return isNew;
    }

    public LocalDate getDate() {
        return lastUpdated;
    }

}
