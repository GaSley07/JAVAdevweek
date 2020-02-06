/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajala2;

/**
 *
 * @author
 */
public class Lista {
    int[] List;
    
    public Lista (int[] valores){
        List=valores;
    }
    
    public int BusquedaLineal(int num){
        int indice=-1;
        for(int i=0;i<List.length;i++){
            if(List[i]==num){
                indice=i;
                break;
            }
        }
        return indice;
    }
    
    public int BusquedaBinaria(int num){
        int posicion=-1;
        int star=0;
        int end=List.length-1;
        int mid=List.length/2;
        while(List[mid]!=num || end!=0){
            mid=(end-star)/2;
            if(List[mid]==num){
                posicion=mid;
                break;
            }
            if(List[mid]>num){
                star=mid;
            } 
            else{
                end=mid/2;
            }
        }
        return posicion;
    }
}
