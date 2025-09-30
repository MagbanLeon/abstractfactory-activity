public class WashingtonSlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(Cabinet largeCabinet = new Large());
        straight.setDisplayType(Display reelsDisplay = new Reels());
        straight.setPayType(Payment billsPay = new Bills());
        straight.setGPU(GPU armGPU = new ARM());
        straight.setOS(OpSys linuxOS = new Linux());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(Cabinet mediumCabinet = new Medium());
        bonus.setDisplayType(Display vgaDisplay = new VGA());
        bonus.setPayType(Payment ticketPayment = new Ticket());
        bonus.setGPU(GPU armGPU = new ARM());
        bonus.setOS(OpSys symbianOS = new Symbian());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(Cabinet largeCabinet = new Large());
        progressive.setDisplayType(Display reelsDisplay = new Reels());
        progressive.setPayType(Payment coinsPay = new Coins());
        progressive.setGPU(GPU armGPU = new ARM());
        progressive.setOS(OpSys androidOS = new Android());
        return progressive;
    }
}