public abstract class AbstractSlotMachine {
    Cabinet cabinetSize;
    Display display;
    Payment payType;
    GPU gpu;
    OpSys os;

    public void setCabinetSize(Cabinet newCabinet){
        cabinetSize = newCabinet;
    }
    public void setDisplayType(Display newDisplay){
        display = newDisplay;
    }
    public void setPayType(Payment newPayment){
        payType = newPayment;
    }
    public void setGPU(GPU newGPU){
        gpu = newGPU;
    }
    public void setOS(OpSys newOS){
        os = newOS;
    }
    public abstract String display();
}