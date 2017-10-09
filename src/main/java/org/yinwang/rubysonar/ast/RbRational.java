package org.yinwang.rubysonar.ast;

import org.apache.commons.lang3.math.Fraction;
import org.jetbrains.annotations.NotNull;
import org.yinwang.rubysonar.State;
import org.yinwang.rubysonar.types.Type;


public class RbRational extends Node {

    public Fraction value;

    public RbRational(String s, String file, int start, int end) {
        super(file, start, end);
        s = s.replaceAll("r", "");
        this.value = Fraction.getFraction(s);
    }


    @NotNull
    @Override
    public Type transform(State s) {
        return Type.RATIONAL;
    }


    @NotNull
    @Override
    public String toString() {
        return "(rational:" + value + ")";
    }

}
