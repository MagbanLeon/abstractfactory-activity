public class NewJerseySlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(new Small());
        straight.setDisplayType(new LCD());
        straight.setPayType(new Coins());
        straight.setGPU(new ARM());
        straight.setOS(new WindowsME());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(new Large());
        bonus.setDisplayType(new Reels());
        bonus.setPayType(new Coins());
        bonus.setGPU(new ARM());
        bonus.setOS(new WindowsME());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(new Small());
        progressive.setDisplayType(new CRT());
        progressive.setPayType(new Bills());
        progressive.setGPU(new X86());
        progressive.setOS(new WindowsXP());
        return progressive;
    }
}