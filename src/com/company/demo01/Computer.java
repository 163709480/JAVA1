package com.company.demo01;

public class Computer {
    public void poweron(){
        System.out.println("笔记本开机");
    }

    public void poweroff(){
        System.out.println("笔记本关机");
    }
    //使用usb设备
    public void  useDevice(USB usb){
        usb.open();//打开设备

        if(usb instanceof  Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.close();
        }else  if(usb instanceof  Keyboard){
            Keyboard keyboard=(Keyboard)usb;
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
