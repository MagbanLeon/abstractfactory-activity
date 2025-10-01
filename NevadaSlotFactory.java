public class NevadaSlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(new Large());
        straight.setDisplayType(new Reels());
        straight.setPayType(new Ticket());
        straight.setGPU(new ARM());
        straight.setOS(new Linux());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(new Small());
        bonus.setDisplayType(new CRT());
        bonus.setPayType(new Ticket());
        bonus.setGPU(new X86());
        bonus.setOS(new Linux());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(new Medium());
        progressive.setDisplayType(new LCD());
        progressive.setPayType(new Ticket());
        progressive.setGPU(new X77());
        progressive.setOS(new Android());
        return progressive;
    }
}