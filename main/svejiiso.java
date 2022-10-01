package main;


public class svejiiso {
	private String name;
	private String surname;
	private int age;
	
	private svejiiso() {}
	
	private svejiiso(String name,String surname, int age) {
		this.name=name;
		this.surname= surname;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	private void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public static SvBuilder build() {
		return new SvBuilder();
		
	}
	
	public static class SvBuilder{
		private svejiiso sv = null;
		
		public SvBuilder() {
			sv = new svejiiso();
		}
		
		public svejiiso build() {
			return new svejiiso(sv.name,sv.surname,sv.age);
		}
		
//		public svejiiso build() {
//			svejiiso ssv = sv ;
//			sv = null;
//			return ssv;
//		}
		
		public SvBuilder whatIsYourName(String name) {
			sv.name=name;
			return this;
		}
		
		public SvBuilder whatIsYourSurname(String surname) {
			sv.surname=surname;
			return this;
		}
		
		public SvBuilder howOldAreYou(int age) {
			sv.age=age;
			return this;
		}
		
	}
}

