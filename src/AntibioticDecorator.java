public class AntibioticDecorator extends MedicamentDecorator {
    public AntibioticDecorator(Medicament medicament){
        super(medicament);
    }
    @Override
    public String getDescription(){
        return decoratorMedicament.getDescription() + " with Antibiotics ";
    }
    @Override
    public double getCost(){
        return decoratorMedicament.getCost() + 3.5;
    }
}
