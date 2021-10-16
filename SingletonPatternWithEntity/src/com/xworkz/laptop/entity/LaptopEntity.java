package com.xworkz.laptop.entity;

public class LaptopEntity {
	private int id;

	private String brand;

	private String color;

	private double price;

	private int Ram;

	private String Processor;

	private boolean Is_Camera_Present;

	private int Screen_Size;

	private int Weight;

	public LaptopEntity(int id, String brand, String color, double price, int ram, String processor,
			boolean is_Camera_Present, int screen_Size, int weight, boolean is_Cd_Supported) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.Ram = ram;
		this.Processor = processor;
		this.Is_Camera_Present = is_Camera_Present;
		this.Screen_Size = screen_Size;
		this.Weight = weight;
		this.Is_Cd_Supported = is_Cd_Supported;
	}

	public LaptopEntity(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public boolean isIs_Camera_Present() {
		return Is_Camera_Present;
	}

	public void setIs_Camera_Present(boolean is_Camera_Present) {
		Is_Camera_Present = is_Camera_Present;
	}

	public int getScreen_Size() {
		return Screen_Size;
	}

	public void setScreen_Size(int screen_Size) {
		Screen_Size = screen_Size;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public boolean isIs_Cd_Supported() {
		return Is_Cd_Supported;
	}

	public void setIs_Cd_Supported(boolean is_Cd_Supported) {
		Is_Cd_Supported = is_Cd_Supported;
	}

	private boolean Is_Cd_Supported;

	@Override
	public String toString() {
		return "LaptopEntity [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", Ram=" + Ram
				+ ", Processor=" + Processor + ", Is_Camera_Present=" + Is_Camera_Present + ", Screen_Size="
				+ Screen_Size + ", Weight=" + Weight + ", Is_Cd_Supported=" + Is_Cd_Supported + "]";
	}

}
