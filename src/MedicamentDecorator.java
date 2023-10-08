public abstract class MedicamentDecorator implements Medicament {
    protected Medicament decoratorMedicament;

    //public MedicamentDecorator(){}
    public MedicamentDecorator(Medicament medicament){
        this.decoratorMedicament = medicament;
    }

    @Override
    public String getDescription(){
        return decoratorMedicament.getDescription();
    }
    @Override
    public double getCost(){
        return decoratorMedicament.getCost();
    }

}
