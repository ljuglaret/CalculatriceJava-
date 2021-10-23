/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Calculatrice;

import org.junit.jupiter.api.Test;

import sansMVC.Modele.Calculer;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.Math;

class AppTest {

    // L'égalité entre les doubles n'existe pas réellement, c'est une approximation
    // deux double a et b sont "égaux" si et seulement si : |a-b| < 10^-7

    final double ecartAutorise = Math.pow(10.0, -7);

    @Test
    void test_calculAdd() {
        Calculer calcul = new Calculer(" 12 + 21 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 33.0);
    }

    @Test
    void test_calculAdd3() {
        Calculer calcul = new Calculer(" 12 + 21 + 30 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 63.0);
    }

    @Test
    void test_calculAddDecimaux() {
        Calculer calcul = new Calculer(" 12.5 + 21.4 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 33.9);
    }

    @Test
    void test_calculMelange() {
        Calculer calcul = new Calculer(" -2 + 3 * 2 -5 ");
        double chaineEvaluee = calcul.evaluer();

        assertEquals(chaineEvaluee, -1.0);
    }

    @Test
    void test_calculProd() {
        Calculer calcul = new Calculer(" 3 * -2 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, -6.0, ecartAutorise);
    }

    @Test
    void test_calculSous() {
        Calculer calcul = new Calculer(" 15 + -7 ");
        double chaineEvaluee = calcul.evaluer();

        assertEquals(chaineEvaluee, 8.0, ecartAutorise);
    }

    @Test
    void test_calculDiv() {
        Calculer calcul = new Calculer(" 10 / 4 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 2.5, ecartAutorise);
    }

    @Test
    void test_calculPrio() {
        Calculer calcul = new Calculer(" 3 + 5 * 4 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 23.0);
    }

    @Test
    void test_calculParenthese() {
        Calculer calcul = new Calculer(" ( -321.5 -12.5 ) * ( 20.5 + 4 ) -7 ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, -8190.0, ecartAutorise);
    }

    @Test
    void test_calculParenthese2() {
        Calculer calcul = new Calculer(" -2 - ( -5 -7 ) ");
        double chaineEvaluee = calcul.evaluer();
        assertEquals(chaineEvaluee, 10, ecartAutorise);
    }
}