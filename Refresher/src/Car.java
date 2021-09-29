import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model ;

public void  setModel(String model){
String validModel = model.toLowerCase();
if(validModel.equals("carrera")){
    this.model = model;
}
else{
    this.model = "Unknown";

}


}
public String getModel(){
    return this.model;
}

}
