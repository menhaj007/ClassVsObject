package classes_vs_objects;

public class TestTester {
	public static void main(String[] args) {
		//Producing the car and introducing to the market.
		Tesla model3 = new Tesla("Model 3", "Tesla INC", 2021, "White", "A38378382");
		
		int serialNumber = 10200;
//		
		Tesla modelS = new Tesla("Model S", "Tesla INC", 2020, "Black", "B3k39393S3");
//		
		Tesla modelX = new Tesla("Model X", "Tesla INC", 2022, "Red", "CX399388302");
//		

		System.out.println(model3);
		
//		System.out.println("Production Total: " + Tesla.getTotalProducedCars());
		
		System.out.println(modelS);
		System.out.println(modelX);
//		System.out.println();
		
		System.out.println("Production Total: " + Tesla.getTotalProducedCars());
	}
	

}
