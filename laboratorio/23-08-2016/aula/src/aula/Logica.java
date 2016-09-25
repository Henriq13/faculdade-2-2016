/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.io.ObjectStreamException;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1323594
 */
public class Logica {

    public int soma(int a, int b) {

        return (a + b);
    }

    public float soma(float a, float b) {

        return (a + b);
    }

    public boolean soma(boolean a, boolean b) {

        return (a || b);
    }

    public double soma(double a, double b) {

        return (a + b);
    }

    public long soma(long a, long b) {

        return (a + b);
    }

    public String soma(String a, String b) {
        double ai, bi;
        ai = Double.parseDouble(a);
        bi = Double.parseDouble(b);
        ai = ai + bi;
        return (String.valueOf(ai));
    }

    public Object soma(Object a, Object b) {
        try {
            a.toString();
            b.toString();
            return (soma(a.toString(), b.toString()));

        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Tondo, deu erro: " + ex);
            return null;
        }

    }

    /*Subtracao*/
    public int subritracao(int a, int b) {

        return (a - b);
    }

    public float subritracao(float a, float b) {

        return (a - b);
    }

    public boolean subritracao(boolean a, boolean b) {

        return (a && b);
    }

    public double subritracao(double a, double b) {

        return (a - b);
    }

    public long subritracao(long a, long b) {

        return (a - b);
    }

    public String subritracao(String a, String b) {
        double ai, bi;
        ai = Double.parseDouble(a);
        bi = Double.parseDouble(b);
        ai = ai - bi;
        return (String.valueOf(ai));
    }

    public Object subritracao(Object a, Object b) {
        a.toString();
        b.toString();

        return (subritracao(a.toString(), b.toString()));
    }

    public Object subtracao(Object a, Object b) {
        a.toString();
        b.toString();

        return (subtracao(a.toString(), b.toString()));
    }

    /*Multiplicacao*/
    public int mutiplicacao(int a, int b) {

        return (a * b);
    }

    public float mutiplicacao(float a, float b) {

        return (a * b);
    }

    public boolean mutiplicacao(boolean a, boolean b) {

        return (a && b);
    }

    public double mutiplicacao(double a, double b) {

        return (a * b);
    }

    public long mutiplicacao(long a, long b) {

        return (a * b);
    }

    public String mutiplicacao(String a, String b) {
        double ai, bi;
        ai = Double.parseDouble(a);
        bi = Double.parseDouble(b);
        ai = ai * bi;
        return (String.valueOf(ai));
    }

    public Object mutiplicacao(Object a, Object b) {
        a.toString();
        b.toString();

        return (mutiplicacao(a.toString(), b.toString()));
    }

    /*Multiplicacao*/
    public int divisao(int a, int b) {

        return (a / b);
    }

    public float divisao(float a, float b) {

        return (a / b);
    }

    public boolean divisao(boolean a, boolean b) {

        return (a && b);
    }

    public double divisao(double a, double b) {

        return (a / b);
    }

    public long divisao(long a, long b) {

        return (a / b);
    }

    public String divisao(String a, String b) {
        double ai, bi;
        ai = Double.parseDouble(a);
        bi = Double.parseDouble(b);
        ai = ai / bi;
        return (String.valueOf(ai));
    }

    public Object divisao(Object a, Object b) {
        a.toString();
        b.toString();

        return (divisao(a.toString(), b.toString()));
    }

}
