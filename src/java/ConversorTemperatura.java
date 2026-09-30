/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ConversorTemperatura {
    
     public double convertir(double temperatura, String conversion) {

        double resultado = 0;

        switch (conversion) {

            case "CF":
                resultado = (temperatura * 9 / 5) + 32;
                break;

            case "FC":
                resultado = (temperatura - 32) * 5 / 9;
                break;

            case "CK":
                resultado = temperatura + 273.15;
                break;

            case "KC":
                resultado = temperatura - 273.15;
                break;
        }

        return resultado;
    }
    
    
}
