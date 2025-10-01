public class BonusSlotMachine extends AbstractSlotMachine {
    public String display(){
        return "Bonus Slot Machine has " + cabinetSize.toString() + display.toString() + payType.toString() + gpu.toString() + os.toString();
    }
}