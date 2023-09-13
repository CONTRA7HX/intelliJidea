package GetterSetter;

public class ExampleOfGetterandSetters {
  private int k;  //data hiding ab dusri classes directly access nhi kar sakti
  private String name = "nikhil";

  public String getName() {
    return name;
  }

  public void setName(String naam) {
    name = naam;
  }

  public int getK()  //ye method var ko view karwane me help karti hai
  {
    return k;
  }
  public void setK(int kal) //is method me hum dusra var create karke usko usi me intialize karwate hai
  {
    k = kal;
  }

}