public class Application {

public static void main(String[] args) {
Building building = new Building("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential",
"R1");

SingleFamilyHome single = new SingleFamilyHome("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1", 4, 3, true, true);

// printing these objects
System.out.println("Building Details\n" + building.displayData()+"\n");

System.out.println("SingleFamilyHome Details\n" + single.displayData()+"\n");
}

}//End Class