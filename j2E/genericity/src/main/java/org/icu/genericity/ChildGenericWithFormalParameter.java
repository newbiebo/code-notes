package org.icu.genericity;

/**
 * 子类不是泛型类，父类要明确泛型类型
 * @param <T>
 */
public class ChildGenericWithFormalParameter extends Generic<String>{

    public ChildGenericWithFormalParameter(String s) {
        super(s);
    }
}
