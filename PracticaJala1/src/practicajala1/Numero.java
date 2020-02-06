package practicajala1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Numero {
    int Valor;
    public  Numero(int num){
        Valor = num;
    }
    public int InvertirNumero(){
        int numInvertido=0;
        int aux1;
        int numOriginal=Valor;
        while(numOriginal>=10){
            aux1=numOriginal%10;
            numOriginal=(numOriginal-numOriginal%10)/10;
            numInvertido=(numInvertido+aux1)*10;
        }
        numInvertido+=numOriginal;
        return (numInvertido);
    }
    
    public String ConvertirBinario(){
        int decimal=Valor;
        //int index;
        String aux="";
        String binario="";
        while(decimal>1){
            aux=aux+(decimal%2);
            decimal=decimal/2;
        }
        aux=aux+decimal;
        //index=aux.length();
        for(int i=aux.length();i>0;i--){
            binario=binario+aux.charAt(i-1);
        }
        return  binario;
    }
}
