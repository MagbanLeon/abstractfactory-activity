public class NewJerseySlotFactory extends AbstractSlotFactory{
    public AbstractSlotMachine StraightMachine(){
        AbstractSlotMachine straight = new StraightSlotMachine();
        straight.setCabinetSize(Cabinet smallCabinet = new Small());
        straight.setDisplayType(Display lcdDisplay = new LCD());
        straight.setPayType(Payment coinsPay = new Coins());
        straight.setGPU(GPU armGPU = new ARM());
        straight.setOS(OpSys wme = new WindowsME());
        return straight;
    }
    public AbstractSlotMachine BonusMachine(){
        AbstractSlotMachine bonus = new BonusSlotMachine();
        bonus.setCabinetSize(Cabinet largeCabinet = new Large());
        bonus.setDisplayType(Display reelsDisplay = new Reels());
        bonus.setPayType(Payment coinsPay = new Coins());
        bonus.setGPU(GPU armGPU = new ARM());
        bonus.setOS(OpSys wme = new WindowsME());
        return bonus;
    }
    public AbstractSlotMachine ProgressiveMachine(){
        AbstractSlotMachine progressive = new ProgressiveSlotMachine();
        progressive.setCabinetSize(Cabinet smallCabinet = new Small());
        progressive.setDisplayType(Display crtDisplay = new CRT());
        progressive.setPayType(Payment billsPay = new Bills());
        progressive.setGPU(GPU x86gpu = new X86());
        progressive.setOS(OpSys wxp = new WindowsXP());
        return progressive;
    }
}