
public class Gon {
private static String nen;
private int age;
private Boolean hunterLicense;
	public Gon() {}
	public Gon() {
		nen = "Enhancement";
		age = 12;
		hunterLicense = True;
	}	

	int getAge() {
		return age;
	}
	boolean getHunterLicense() {
		return hunterLicense;
	}
	String getNen() {
		return nen;
	}
	void setAge(int age) {
		Gon.age = age;
	}

}
