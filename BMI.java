/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author SALSABILA
 */
public class BMI {
    double hasil;
    
    void getBMI (double tinggi, double berat){
        hasil = berat / (tinggi * tinggi);
        System.out.println("hasil BMI saya adalah " + hasil);
        
        String category = getBMIcategory(hasil); 
        System.out.println("kategori BMI salsa " + category);
    }
        
        
    public String getBMIcategory (double hasil){
        if (hasil < 18.5){
            return "underweight";  
        }else if (hasil >= 18.5 && hasil < 24.9){
            return "Normal Weight";
        }else if (hasil >=25 && hasil <29.9){
            return "Overweight";
        }else {
            return "obesity";
        }
    }    
}
