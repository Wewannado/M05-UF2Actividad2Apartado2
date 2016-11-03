/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m05uf2actividad2apartado2.DNI;
import m05uf2actividad2apartado2.IncorrectFormatLengthException;
import m05uf2actividad2apartado2.IncorrectNumericalDataException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roger G. Coscojuela
 */
public class Tests {
    DNI dni;

    public Tests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestValidaDNI() throws IncorrectNumericalDataException, IncorrectFormatLengthException {
        dni = new DNI("46947903G");
        boolean esValid = dni.esValid();
        assertTrue(esValid);
    }

    @Test
    public void TestValidaDNIFalse() throws IncorrectNumericalDataException, IncorrectFormatLengthException {
        dni = new DNI("46947903X");
        boolean esValid = dni.esValid();
        assertFalse(esValid);
    }

    @Test(expected = IncorrectNumericalDataException.class)
    public void TestValidaDNIExceptionNumeric() throws IncorrectNumericalDataException, IncorrectFormatLengthException {
        dni = new DNI("46A47903G");
        boolean esValid = dni.esValid();
        fail("El test debe de pasar si se introduce una letra en la parte numerica.");
    }

    @Test(expected = IncorrectFormatLengthException.class)
    public void TestValidaDNIExceptionIncorrectDataLengthMIN() throws IncorrectNumericalDataException, IncorrectFormatLengthException {
        dni = new DNI("447903G");
        boolean esValid = dni.esValid();
        fail("El test debe de pasar si se introduce un DNI de menos de 8 caracteres.");
    }
    
    @Test(expected = IncorrectFormatLengthException.class)
    public void TestValidaDNIExceptionIncorrectDataLengthMAX() throws IncorrectNumericalDataException, IncorrectFormatLengthException {
        dni = new DNI("469747903G");
        boolean esValid = dni.esValid();
        fail("El test debe de pasar si se introduce un DNI de mas de 9 caracteres.");
    }
}
