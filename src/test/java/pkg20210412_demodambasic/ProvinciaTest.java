/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20210412_demodambasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Usuari
 */
public class ProvinciaTest {
    
    public ProvinciaTest() {
    }

    @Test
    public void testGetCapital() {
    }

    @Test
    public void testSetCapital() {
    }

    @Test
    public void testAddMunicipi() {
        Provincia p1 = new Provincia(1, "Barcelona");
        Municipi m1 = new Municipi(1, "Igualada",p1);
        assertTrue(p1.equals(m1.getProvincia()));
        assertEquals(1, p1.getNumMunicipis());
        fail("XXW");
    }

    @Test
    public void testRemoveMunicipi_int() {
    }

    @Test
    public void testRemoveMunicipi_Municipi() {
    }

    @Test
    public void testGetNumMunicipis() {
    }

    @Test
    public void testGetMunicipi() {
    }

    @Test
    public void testGetMunicipisIterator() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testEquals() {
    }
    
}
