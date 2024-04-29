import javax.swing.*;
public class Calculadoraswing{
    public static void main(String[] args){
        String inputPeso = JOptionPane.showInputDialog("Qual é o seu peso");
        String inputAltura = JOptionPane.showInputDialog("Qual é a sua altura");
        float altura = Float.parseFloat(inputAltura);
        float peso = Float.parseFloat(inputPeso);
        float imc = peso/(altura*altura);

        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "O seu imc é : " + imc +"\nClassificaçao: Magreza " );
        } else if(imc < 25){
            JOptionPane.showMessageDialog(null, "O seu imc é : "+ imc +"\nClassificaçao: Normal " );
        } else if(imc < 30){
            JOptionPane.showMessageDialog(null, "O seu imc é : "+ imc +"\n Classificaço: Sobrepeso" );
        } else if(imc < 35){
            JOptionPane.showMessageDialog(null, "O seu imc é : "+ imc +"\n Classificaçao: Obesidade Grau 1" );
        } else if(imc < 40){
            JOptionPane.showMessageDialog(null, "O seu imc é : "+ imc +"\n Classificaçao: Obesidade Grau 2" );
        } else {
            JOptionPane.showMessageDialog(null, "O seu imc é : "+ imc +"\n Classificaçao: Obesidade Grau 3" );
        }
    }
}