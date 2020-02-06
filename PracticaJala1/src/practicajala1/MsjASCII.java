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
public class MsjASCII {
    int[] mensaje={34,66,105,101,110,118,101,110,105,100,111,115,32,97,32,108,97,32,70,117,110,100,97,99,105,111,110,32,74,97,108,97,32,58,45,41,33,34};
    
    public String DecifrarMsj(){
      String MsjDecifrado="";
      for(int i=0;i<mensaje.length;i++){
          MsjDecifrado=MsjDecifrado+(char)mensaje[i];
      }
      return MsjDecifrado;
    }
}
