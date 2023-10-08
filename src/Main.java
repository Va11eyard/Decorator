public class Main {
    public static void main(String[] args) {
        Medicament basicMedicament = new BasicMedicament("Aspirin", 2.5);

        Medicament extendedReleaseMedicament = new ExtendedReleaseDecorator(basicMedicament);
        System.out.println(extendedReleaseMedicament.getDescription() + "Costs: $" + extendedReleaseMedicament.getCost());

        Medicament medicamentWithAntibiotics = new AntibioticDecorator(basicMedicament);
        System.out.println(medicamentWithAntibiotics.getDescription() + "Costs: $" + medicamentWithAntibiotics.getCost());

        Medicament medicamentWithPainkiller = new PainkillerDecorator(basicMedicament);
        System.out.println(medicamentWithPainkiller.getDescription() + "Costs: $" + medicamentWithPainkiller.getCost());

    }
}