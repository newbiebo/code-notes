package org.icu.genericity;

/**
 * 子类是泛型类，子类父类泛型要一致
 * @param <T>
 */
public class ChildGenericWithOutFormalParameter<T> extends Generic<T>{

    public ChildGenericWithOutFormalParameter(T t) {
        super(t);
    }
}
