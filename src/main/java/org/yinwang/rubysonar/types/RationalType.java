package org.yinwang.rubysonar.types;

public class RationalType extends Type {

    @Override
    public boolean equals(Object other) {
        return other instanceof RationalType;
    }


    @Override
    protected String printType(Type.CyclicTypeRecorder ctr) {
        return "rational";
    }
}
