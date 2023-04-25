package com.example.demo.Model;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class Student_Model {
		@Id
		private int id;
		private String Name;
		private int age;
		private int pincode;
		private String City;
		private String Country;
		
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "StudentDetails [id=" + id + ", Name=" + Name + ", age=" + age + ", pincode=" + pincode + ", City="
					+ City + ", Country=" + Country + "]";
		}
		
		
		
	
	
}
