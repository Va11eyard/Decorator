public class PainkillerDecorator extends MedicamentDecorator{
    public PainkillerDecorator(Medicament medicament){
        super(medicament);
    }
    @Override
    public String getDescription(){
        return decoratorMedicament.getDescription() + " with Painkiller ";
    }
    @Override
    public double getCost(){
        return decoratorMedicament.getCost() + 4.5;
    }
}
