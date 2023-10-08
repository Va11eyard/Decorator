public class ExtendedReleaseDecorator extends MedicamentDecorator{
    //public ExtendedReleaseDecorator(){}
    public ExtendedReleaseDecorator(Medicament medicament){
        super(medicament);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " + Extended Release ";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.5;
    }
}
