public class remoteLCD {
    public static void main(String[] args) {
        System.out.println("Nama : A. Issadurrofiq Jaya Utama");
        System.out.println("NIM : 235150700111023");
        miniLCD lcda = new miniLCD();
        lcda.turnOn();
        lcda.turnOff();
        lcda.freeze();
        lcda.setStatus("Freeze");
        lcda.cableUp();
        lcda.cableDown();
        lcda.setCable(3);
        lcda.volumeUp();
        lcda.volumeDown();
        lcda.setVolume(50);
        lcda.brightnessUp();
        lcda.brightnessDown();
        lcda.setBrightness(50);
        miniLCD.displayMessage(lcda);

        System.out.println("===============================");
        miniLCD lcdb = new miniLCD();
        lcdb.turnOn();
        lcdb.turnOff();
        lcdb.freeze();
        lcdb.setStatus("Off");
        lcdb.cableUp();
        lcdb.cableDown();
        lcdb.setCable(2);
        lcdb.volumeUp();
        lcdb.volumeDown();
        lcdb.setVolume(00);
        lcdb.brightnessUp();
        lcdb.brightnessDown();
        lcdb.setBrightness(00);
        miniLCD.displayMessage(lcdb);

        System.out.println("===============================");
        miniLCD lcdc = new miniLCD();
        lcdc.turnOn();
        lcdc.turnOff();
        lcdc.freeze();
        lcdc.setStatus("Freeze");
        lcdc.cableUp();
        lcdc.cableDown();
        lcdc.setCable(0);
        lcdc.volumeUp();
        lcdc.volumeDown();
        lcdc.setVolume(125);
        lcdc.brightnessUp();
        lcdc.brightnessDown();
        lcdc.setBrightness(75);
        miniLCD.displayMessage(lcdc);

        System.out.println("===============================");
        miniLCD lcdd = new miniLCD();
        lcdd.turnOn();
        lcdd.turnOff();
        lcdd.freeze();
        lcdd.setStatus("On");
        lcdd.cableUp();
        lcdd.cableDown();
        lcdd.setCable(1);
        lcdd.volumeUp();
        lcdd.volumeDown();
        lcdd.setVolume(1000);
        lcdd.brightnessUp();
        lcdd.brightnessDown();
        lcdd.setBrightness(100);
        miniLCD.displayMessage(lcdd);
        System.out.println("===============================");
    }
}
// -public class remoteLCD {
// -    public static void main(String[] args) {
// -        miniLCD lcd = new miniLCD();
// -        lcd.turnOn();
// -        lcd.turnOff();
// -        lcd.freeze();
// -        lcd.setStatus("On");
// -        lcd.cableUp();
// -        lcd.cableDown();
// -        lcd.volumeUp();
// -        lcd.volumeDown();
// -        lcd.setVolume(50);
// -        lcd.brightnessUp();
// -        lcd.brightnessDown();
// -        lcd.setBrightness(50);
// -        miniLCD.displayMessage(lcd);
// -    }
// }
// <<<<<<<  e047c485-b313-4c87-9d4b-8e6213daf357  >>>>>>>