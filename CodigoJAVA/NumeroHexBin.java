package practicajala1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhenier Lopez
 */
public class NumeroHexBin {
    String ConvertirNum;
    
    public NumeroHexBin(String num){
        ConvertirNum=num;
    }
    
    public int ConvertirDec(int base){  //Se debe enviar la base del numero que se desea convertir
        String Hexa="0123456789ABCDEF";
        String Bin="01";
        String Caso;
        String conv=ConvertirNum.toUpperCase();
        char dig;
        int index=conv.length()-1;
        int numDecimal=0;
        int digito;
        if(base==16){
            Caso=Hexa;
        }
        else{
            Caso=Bin;
        }
        for(int i=0;i<conv.length();i++){
            dig=conv.charAt(index);
            digito=Caso.indexOf(dig);
            numDecimal +=(base^i)*digito;
        }
        return numDecimal;
    }
}
