public class StraightSlotMachine extends AbstractSlotMachine {
    public String display(){
        return "Straight Slot Machine has " + cabinetSize.toString() + display.toString() + payType.toString() + gpu.toString() + os.toString();
    }
}