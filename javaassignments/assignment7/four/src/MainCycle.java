public class MainCycle {
    public void cycle(CycleFactory cf){
        Cycle cycle=cf.getCycle();
        cycle.noOfWheels();
    }
    public static void main(String[] args){
        MainCycle mainCycle=new MainCycle();
        mainCycle.cycle(new UnicycleFactory());
        mainCycle.cycle(new BicycleFactory());
        mainCycle.cycle(new TricycleFactory());
    }
}