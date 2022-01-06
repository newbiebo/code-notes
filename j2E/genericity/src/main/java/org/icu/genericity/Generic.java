package org.icu.genericity;

/**
 * 泛型类
 * @param <T> 泛型标识，类型形参
 *           T 创建对象制定具体的参数类型
 */
public class Generic<T> {

    private T t;
    //泛型方法
    public Generic(T t){
        this.t=t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
