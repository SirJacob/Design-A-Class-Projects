/*
 * The MIT License
 *
 * Copyright 2015 https://github.com/SirJacob
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.sirjacob.HumanBody;

/**
 *
 * @author https://github.com/SirJacob
 */
public abstract class BodyPart {

    protected double weight, strength, height;
    protected boolean broken;

    public BodyPart(double weight, double strength, double height, boolean broken) {
        this.weight = weight;
        this.strength = strength;
        this.height = height;
        this.broken = broken;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public double getWeight() {
        return weight;
    }

    public double getStrength() {
        return strength;
    }

    public double getHeight() {
        return height;
    }

    public boolean isBroken() {
        return broken;
    }

    @Override
    public abstract String toString();
}
