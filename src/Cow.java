public class Cow extends Animal {
    private String noise = "Muuu";

    public String getNoise(){
        return noise;
    }

    public void sayMuu(String userName){
        System.out.println(noise + " "+ userName);
    }
}
