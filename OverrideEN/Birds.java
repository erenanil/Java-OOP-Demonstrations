package OverrideEN;

public class Birds extends Animals {
    public boolean hasBeak;
    public boolean hasWings;
    public void reproduce(){
        System.out.println("Birds reproduce by laying eggs.");
    }
    public void respire(){
        System.out.println("Birds respire with their lungs.");
    }
}
