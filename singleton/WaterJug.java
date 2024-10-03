package java_codes.singletonClass;

class WaterJug{
    private WaterJug(){}

    private int waterQuantity = 500;
    private static WaterJug object = null;

    public int getWater(int quantity){
        waterQuantity -= quantity;
        return quantity;
    }
    public static WaterJug getInstance(){
        if(object == null){
            object = new WaterJug();
        }
        return object;
    }
}
