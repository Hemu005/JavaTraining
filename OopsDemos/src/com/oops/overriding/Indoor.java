package com.oops.overriding;

public class Indoor extends Sports {
    @Override
    String[] showTypes() {
        return new String[]{"ches","table tennis","carrom"};
    }
}
