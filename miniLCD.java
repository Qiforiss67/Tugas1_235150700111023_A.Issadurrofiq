public class miniLCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    private int cableType;

    public String turnOff() {
        status = "Off";
        return status;
    }

    public String turnOn() {
        status = "On";
        return status;
    }

    public String freeze() {
        status = "Freeze";
        return status;
    }

    public int volumeUp() {
        volume++;
        return volume;
    }

    public int volumeDown() {
        volume--;
        return volume;
    }

    public int brightnessUp() {
        brightness++;
        return brightness;
    }

    public int brightnessDown() {
        brightness--;
        return brightness;
    }

    public String setStatus(String status) {
        this.status = status;
        return status;
    }

    public String getCable() {
        return cable;
    }

    public int setVolume(int volume) {
        this.volume = volume;
        return this.volume;
    }

    public int setBrightness(int brightness) {
        this.brightness = brightness;
        return this.brightness;
    }

    public void cableUp() {
        this.cableType++;
        check();
        setCable(cableType);
    }

    public void cableDown() {
        this.cableType--;
        check();
        setCable(cableType);
    }

    private void check() {
        if (cableType < 0) {
            cableType += 3;
        }
    }
    
    public void setCable(int cableType) {
        switch (cableType) {
            case 0:
                cable = "VGA";
                break;
            case 1:
                cable = "DVI";
                break;
            case 2:
                cable = "HDMI";
                break;
            case 3:
                cable = "DisplayPort";
                break;
            default:
                cable = "Unknown";
        }
    }
    
    public static void displayMessage(miniLCD lcd) {
        System.out.println("LCD Status: " + lcd.status);
        System.out.println("Volume: " + lcd.volume);
        System.out.println("Brightness: " + lcd.brightness);
        System.out.println("Cable: " + lcd.cable);
    }
}
