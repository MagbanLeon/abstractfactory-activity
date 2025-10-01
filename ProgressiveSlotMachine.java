public class ProgressiveSlotMachine extends AbstractSlotMachine {
    public String display(){
        return "Progressive Slot Machine has " + cabinetSize.toString() + display.toString() + payType.toString() + gpu.toString() + os.toString();
    }
}