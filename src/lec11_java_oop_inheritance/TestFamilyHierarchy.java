package lec11_java_oop_inheritance;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		
		Grandfather grandfather = new Grandfather();
		grandfather.grandfatherInfo();
		
		Father father = new Father();
		father.fatherInfo();
		
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		
		Cousin cousin = new Cousin();
		cousin.cousinInfo();
		
		Sister sister = new Sister();
		sister.sisterInfo();
		Nephew nephew = new Nephew();
		nephew.nephewInfo();
		
		Me me = new Me();
		me.myInfo();
		

	}

}
