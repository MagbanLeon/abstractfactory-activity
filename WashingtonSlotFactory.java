public class WashingtonSlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(new Large());
        straight.setDisplayType(new Reels());
        straight.setPayType(new Bills());
        straight.setGPU(new ARM());
        straight.setOS(new Linux());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(new Medium());
        bonus.setDisplayType(new VGA());
        bonus.setPayType(new Ticket());
        bonus.setGPU(new ARM());
        bonus.setOS(new Symbian());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(new Large());
        progressive.setDisplayType(new Reels());
        progressive.setPayType(new Coins());
        progressive.setGPU(new ARM());
        progressive.setOS(new Android());
        return progressive;
    }
}