import org.icu.stream.StreamCommon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;


public class streamTest {

    StreamCommon streamCommon = new StreamCommon();
    ArrayList<String> arrayList = streamCommon.add();
    ArrayList<String> arrayListForMap = streamCommon.addByCollections();

    @Test
    public void streamForeachTest(){

        //源码：void forEach(Consumer<? super T> action);需要一个参数去消费
        //Consumer：消费者
        //直接通过Stream接口调用forEach方法也可以，n是集合中每一个元素
        Stream.of(arrayList).forEach((n)-> System.out.println(n));
        Stream.of(arrayList).forEach(n-> System.out.println(n));
    }

    @Test
    public void streamCountTest(){

        //统计集合中元素数量
        System.out.println(arrayList.stream().count());
    }

    @Test
    public void streamFilterTest(){

        //过滤集合中元素
        //源码：Stream<T> filter(Predicate<? super T> predicate);需要一个参数去推断
        //Predicate：断言
        arrayList.stream().filter(n->n.startsWith("赵")).forEach(n-> System.out.println(n));
    }

    @Test
    public void streamLimitTest(){

        //取用前几个集合中元素，底层遍历了所有 但是保留了0-2索引对应的值
        //源码：Stream<T> limit(long maxSize);
        arrayList.stream().limit(3).forEach(n-> System.out.println(n));
    }

    @Test
    public void streamSkipTest(){

        //跳过前几个集合中元素
        arrayList.stream().skip(3).forEach(n-> System.out.println(n));
    }

    @Test
    public void streamMapTest(){

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);返回值前第一个R泛型方法的声明，第二个R是Stream的泛型
        //public interface Function<T, R> {   双参数泛型
        //    R apply(T t);    第一个参数参数类型，第二个参数返回值类型
        // }
        //映射集合中元素
        arrayListForMap.stream().map(n->Integer.parseInt(n)).forEach(n-> System.out.println(n+1));
    }
}
