package ex1;

public class Carro{
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String mc, String md){
        marca = mc;
        modelo = md;
        motor = new Motor("V8", 8000);
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Motor getMotor(){
        return motor;
    }

    public void setMarca(String mc){
        marca = mc;
    }

    public void setModelo(String md){
        modelo = md;
    }

    public void setMotor(Motor mt){
        motor = mt;
    }

    public void exibirInfoCompleta(){
        System.out.println("A marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
        motor.exibirInfo();
        /*System.out.println("O tipo do motor do carro é: " + motor.getTipo());
        System.out.println("A potencia do motor do carro é: " + motor.getPotencia());*/
    }
}