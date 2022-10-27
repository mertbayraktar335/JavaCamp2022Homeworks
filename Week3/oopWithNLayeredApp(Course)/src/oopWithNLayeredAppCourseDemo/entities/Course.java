package oopWithNLayeredAppCourseDemo.entities;

public class Course {
    private int id;
    private String name;
    private int categoryId;
    private int instructorId;
    private double price;
    public Course() {
    }
    public Course(int id, String name, int categoryId, int instructorId, double price) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.instructorId = instructorId;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
   
    
    
}
