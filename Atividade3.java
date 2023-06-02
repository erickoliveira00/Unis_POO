package atividade3;

import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String[] args) {
        double alturaCm;
        double peso;
        String respAltura;
        String respPeso;
        
        respAltura = JOptionPane.showInputDialog("Digite sua Altura em cm:");
        alturaCm = Double.parseDouble(respAltura);
        double alturaMetros = alturaCm / 100; 
        
        respPeso = JOptionPane.showInputDialog("Digite seu Peso:");
        peso = Double.parseDouble(respPeso);
        
        double imc = peso / (alturaMetros * alturaMetros);
        
        if (imc < 17) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Muito abaixo do Peso");
        } else if (imc >= 17 && imc <= 18.49) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Abaixo do Peso");
        } else if (imc >= 18.50 && imc <= 24.99) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Peso Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Acima do Peso");
        } else if (imc >= 30 && imc <= 34.99) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Obesidade II (Severa)");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + " Obesidade III (Mórbida)");
        }
    }
}
