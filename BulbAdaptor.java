public class BulbAdaptor implements SmartDevice{
    private final LegacyBulb bulb;
    private static final int k = 4;
    public BulbAdaptor(LegacyBulb bulb){
        if (bulb == null){
            System.out.println("LegacyBulb cannot be null");
        }
        this.bulb = bulb;
    }

    @Override
    public void turnOn(){
        bulb.setBrightness(255);
    }

    @Override
    public void turnOff(){
        bulb.setBrightness(0);
    }

    @Override
    public boolean isOn(){
        if(bulb.hasPower()){
            return true;
        }
        return false;
    }

    @Override
    public int getPowerPercent(){
        if(!bulb.hasPower()){
            return 0;
        }

    }
}
