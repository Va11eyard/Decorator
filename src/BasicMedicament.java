public class BasicMedicament implements Medicament{
    private String name;
    private double cost;
    //public BasicMedicament(){}
    public BasicMedicament(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getDescription(){
        return name;
    }
    @Override
    public double getCost(){
        return cost;
    }
}
