import org.icu.genericity.ChildGenericWithFormalParameter;
import org.icu.genericity.ChildGenericWithOutFormalParameter;
import org.icu.genericity.Generic;
import org.junit.Test;

public class genericityTest {

    @Test
    public void GenericClassTest(){
        //指定String类型，不指定为Object类型，且不支持基本数据类型
        //泛型在逻辑上可以看作不同类型，但其本质是统一字节码文件
        Generic<String> stringGeneric = new Generic("abc");
        String t = stringGeneric.getT();
        System.out.println(t);
    }

    @Test
    public void ChildGenericWithFPTest(){
        new ChildGenericWithFormalParameter("abc");
    }

    @Test
    public void ChildGenericWithOutFPTest(){
        new ChildGenericWithOutFormalParameter<String>("abc");
    }
}
