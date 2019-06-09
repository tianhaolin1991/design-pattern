package com.designPattern.bridge;

public class Test {
    public static void main(String[] args) {
        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        huaWeiPhone.setSoftWare(new CameraSoftWare());
        huaWeiPhone.run();

        IPhone iPhone = new IPhone();
        iPhone.setSoftWare(new AppStore());
        iPhone.run();
    }
}
