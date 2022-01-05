package org.icu.stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamCommon {

    public StreamCommon() {
    }

    public ArrayList<String> add(){

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("张无忌");
        arrayList.add("赵敏");
        arrayList.add("金毛狮王");
        arrayList.add("金毛狮王2");

        return arrayList;

    }

    public ArrayList<String> addByCollections(){

        ArrayList<String> arrayListForMap = new ArrayList();
        Collections.addAll(arrayListForMap,"100","200","300","400");
        return arrayListForMap;


    }

}
