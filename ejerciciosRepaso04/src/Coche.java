public class Coche {
    Motor motor;
    int rpm = 4000;
    Coche(){
        this.motor = new Motor();
    }
    int getRpmMotor(){
        return motor.getRpm();
    }
}
