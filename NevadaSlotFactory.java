public class NevadaSlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(Cabinet largeCabinet = new Large());
        straight.setDisplayType(Display reelsDisplay = new Reels());
        straight.setPayType(Payment ticketPayment = new Ticket());
        straight.setGPU(GPU armGPU = new ARM());
        straight.setOS(OpSys linuxOS = new Linux());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(Cabinet smallCabinet = new Small());
        bonus.setDisplayType(Display crtDisplay = new CRT());
        bonus.setPayType(Payment ticketPayment = new Ticket());
        bonus.setGPU(GPU x86gpu = new X86());
        bonus.setOS(OpSys linuxOS = new Linux());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(Cabinet mediumCabinet = new Medium());
        progressive.setDisplayType(Display lcdDisplay = new LCD());
        progressive.setPayType(Payment ticketPayment = new Ticket());
        progressive.setGPU(GPU x77gpu = new X77());
        progressive.setOS(OpSys androidOS = new Android());
        return progressive;
    }
}