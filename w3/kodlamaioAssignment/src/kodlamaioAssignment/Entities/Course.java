package kodlamaioAssignment.Entities;

public class Course {
	private int id;
	private int categoryId;
	private int lecturerId;
	private double price;
	public double getPrice() {
		return price;
	}
	public Course(int id, int categoryId, int lecturerId, double price, String name, String description) {
		this.id = id;
		this.categoryId = categoryId;
		this.lecturerId = lecturerId;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private String description;
}
