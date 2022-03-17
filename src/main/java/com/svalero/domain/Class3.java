package com.svalero.domain;

import java.util.Objects;

public class Class3 {
    private String s1;
    private String s2;
    private int i1;
    private int i2;
    private float f;

    public Class3() {
    }

    public Class3(String s1) {
        this.s1 = s1;
    }

    public Class3(String s1, String s2, int i1, int i2, float f) {
        this.s1 = s1;
        this.s2 = s2;
        this.i1 = i1;
        this.i2 = i2;
        this.f = f;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class3 class3 = (Class3) o;
        return s1.equals(class3.s1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s1);
    }

    @Override
    public String toString() {
        return "Class3{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", i1=" + i1 +
                ", i2=" + i2 +
                ", f=" + f +
                '}';
    }
}
