/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadradoperfeito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class QuadradoPerfeitoTest {

    @Test
    public void testQuadradoPerfeito() {
        System.out.println("quadradoPerfeito");
        int k = 0;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadradoPerfeito(k);
        assertEquals(expResult, result);
        
    }
}
