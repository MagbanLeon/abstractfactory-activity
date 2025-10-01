public class Main {
    public static void main(String[] args) {
        AbstractSlotFactory NVFactory = new NevadaSlotFactory();
        AbstractSlotFactory NJFactory = new NewJerseySlotFactory();
        AbstractSlotMachine slot = NVFactory.BonusMachine();
        System.out.println(slot.display());

        AbstractSlotMachine slot2 = NJFactory.StraightMachine();
        System.out.println(slot2.display());
    }
}