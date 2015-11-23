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
package space.mygeek.dac.hb;

import java.util.Random;

/**
 *
 * @author https://github.com/SirJacob
 */
public class Body {

    protected Head head;
    protected Torso torso;
    protected Arm arm1;
    protected Arm arm2;
    protected Leg leg1;
    protected Leg leg2;

//<editor-fold defaultstate="collapsed" desc="Final Doubles">
    protected static final double HEAD_MALE_HEIGHT = 0;
    protected static final double HEAD_FEMALE_HEIGHT = 0;
    protected static final double HEAD_MALE_WEIGHT = 0;
    protected static final double HEAD_FEMALE_WEIGHT = 0;

    protected static final double TORSO_MALE_HEIGHT = 0;
    protected static final double TORSO_FEMALE_HEIGHT = 0;
    protected static final double TORSO_MALE_WEIGHT = 0;
    protected static final double TORSO_FEMALE_WEIGHT = 0;
    protected static final double TORSO_MALE_STRENGTH = 0;
    protected static final double TORSO_FEMALE_STRENGTH = 0;

    protected static final double ARM_MALE_WEIGHT = 0;
    protected static final double ARM_FEMALE_WEIGHT = 0;
    protected static final double ARM_MALE_STRENGTH = 0;
    protected static final double ARM_FEMALE_STRENGTH = 0;

    protected static final double LEG_MALE_HEIGHT = 0;
    protected static final double LEG_FEMALE_HEIGHT = 0;
    protected static final double LEG_MALE_WEIGHT = 0;
    protected static final double LEG_FEMALE_WEIGHT = 0;
    protected static final double LEG_MALE_STRENGTH = 0;
    protected static final double LEG_FEMALE_STRENGTH = 0;
//</editor-fold>

    public Body() {
        Random ranGen = new Random();
        int intFemale = ranGen.nextInt(2) + 1;
        boolean female = intFemale == 1;
        if (female == true) {
            head = new Head(HEAD_FEMALE_WEIGHT, 0, HEAD_FEMALE_HEIGHT, false);
            torso = new Torso(TORSO_FEMALE_WEIGHT, TORSO_FEMALE_STRENGTH, TORSO_FEMALE_HEIGHT, false, female);
            arm1 = new Arm(ARM_FEMALE_WEIGHT, ARM_FEMALE_STRENGTH, 0, false, false);
            arm2 = new Arm(ARM_FEMALE_WEIGHT, ARM_FEMALE_STRENGTH, 0, false, true);
            leg1 = new Leg(LEG_FEMALE_WEIGHT, LEG_FEMALE_STRENGTH, LEG_FEMALE_HEIGHT, false, false);
            leg2 = new Leg(LEG_FEMALE_WEIGHT, LEG_FEMALE_STRENGTH, LEG_FEMALE_HEIGHT, false, true);
        } else {
            head = new Head(HEAD_MALE_WEIGHT, 0, HEAD_MALE_HEIGHT, false);
            torso = new Torso(TORSO_MALE_WEIGHT, TORSO_MALE_STRENGTH, TORSO_MALE_HEIGHT, false, female);
            arm1 = new Arm(ARM_MALE_WEIGHT, ARM_MALE_STRENGTH, 0, false, false);
            arm2 = new Arm(ARM_MALE_WEIGHT, ARM_MALE_STRENGTH, 0, false, true);
            leg1 = new Leg(LEG_MALE_WEIGHT, LEG_MALE_STRENGTH, LEG_MALE_HEIGHT, false, false);
            leg2 = new Leg(LEG_MALE_WEIGHT, LEG_MALE_STRENGTH, LEG_MALE_HEIGHT, false, true);
        }
    }

    public Body(boolean female,
            double head_weight, double head_height,
            double torso_weight, double torso_height, double torso_strength,
            double arm_weight, double arm_strength, boolean arm1_broken, boolean arm2_broken,
            double leg_weight, double leg_strength, double leg_height, boolean leg1_broken, boolean leg2_broken) {
        head = new Head(head_weight, 0, head_height, false);
        torso = new Torso(torso_weight, torso_strength, torso_height, false, female);
        arm1 = new Arm(arm_weight, arm_strength, 0, arm1_broken, false);
        arm2 = new Arm(arm_weight, arm_strength, 0, arm2_broken, true);
        leg1 = new Leg(leg_weight, leg_strength, leg_height, leg1_broken, false);
        leg2 = new Leg(leg_weight, leg_strength, leg_height, leg2_broken, true);
    }

    public double getHeight() {
        return head.getHeight() + torso.getHeight() + leg1.getHeight();
    }

    public double getWeight() {
        return head.getWeight() + torso.getWeight() + arm1.getWeight() + arm2.getWeight() + leg1.getWeight() + leg2.getWeight();
    }

    public double getStrength() {
        return leg1.getStrength() + leg2.getStrength() + arm1.getStrength() + arm2.getStrength();
    }
}
