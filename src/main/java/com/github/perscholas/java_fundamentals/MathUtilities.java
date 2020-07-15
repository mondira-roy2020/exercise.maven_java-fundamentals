package com.github.perscholas.java_fundamentals;

import java.util.Scanner;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public static Integer add(int baseValue, int difference) {
       Integer someIntegerValue= baseValue+difference;
        return someIntegerValue;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {
        Long someLongValue= baseValue+difference;
        return someLongValue;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
        Short result = (short) (baseValue + difference);;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte add(byte baseValue, byte difference) {
        Byte result = (byte) (baseValue + difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {
        Float result = (float) (baseValue + difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {
        Double result = (double) (baseValue + difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {
        return (baseValue-difference);
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {
        Long result = (long) (baseValue - difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtract(short baseValue, short difference) {
        Short result = (short) (baseValue - difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtract(byte baseValue, byte difference) {
        Byte result = (byte) (baseValue - difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {
        Float result = (float) (baseValue - difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public static Double subtract(double baseValue, double difference) {
        Double result = (double) (baseValue - difference);
        return result;
    }


    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public static Integer divide(int dividend, int divisor) {

        return (dividend/divisor);
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {
        Long result = (long) (dividend/divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divide(short dividend, short divisor) {
        Short result = (short) (dividend/divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divide(byte dividend, byte divisor) {
        Byte result = (byte) (dividend/divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {
        Float result = (float) (dividend/divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {
        Double result = (double) (dividend/divisor);
        return result;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {

        return (multiplicand * multiplier);
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {
        long result = (long) (multiplicand * multiplier);
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiply(short multiplicand, short multiplier) {
        Short result = (short) (multiplicand * multiplier);
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiply(byte multiplicand, byte multiplier) {
        Byte result = (byte) (multiplicand * multiplier);
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {
        Float result = (float) (multiplicand * multiplier);
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public static Double multiply(double multiplicand, double multiplier) {
        return (multiplicand * multiplier);
    }


    public static void main(String[] args) {
        System.out.println(add(3,7));
        System.out.println(subtract(75.6,45.8));
        System.out.println(divide(5,6));
        System.out.println(multiply(34.5,76.9));
    }
}