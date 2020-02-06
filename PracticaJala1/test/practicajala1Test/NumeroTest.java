/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajala1Test;

import practicajala1.Numero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author
 */
public class NumeroTest {
    
    public NumeroTest() {
    }

    @Test
    public void testInvertirNumero() {
        System.out.println("InvertirNumero");
        Numero instance = new Numero(564);
        int expResult = 465;
        int result = instance.InvertirNumero();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testConvertirBinario() {
        System.out.println("ConvertirBinario");
        Numero instance = new Numero(15);
        String expResult = "1111";
        String result = instance.ConvertirBinario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
