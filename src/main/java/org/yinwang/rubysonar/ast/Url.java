package org.yinwang.rubysonar.ast;

import org.jetbrains.annotations.NotNull;
import org.yinwang.rubysonar.Analyzer;
import org.yinwang.rubysonar.State;
import org.yinwang.rubysonar.types.Type;


/**
 * virtual-AST node used to represent virtual source locations for builtins
 * as external urls.
 */
public class Url extends Node {

    private String url;


    public Url(String url) {
        this.url = url;
    }


    public String getURL() {
        return url;
    }


    @NotNull
    @Override
    public Type transform(State s) {
        return Type.UNKNOWN_STR;
    }


    @NotNull
    @Override
    public String toString() {
        return "(url:" + url + ")";
    }


    @Override
    public void visit(@NotNull NodeVisitor v) {
        v.visit(this);
    }
}