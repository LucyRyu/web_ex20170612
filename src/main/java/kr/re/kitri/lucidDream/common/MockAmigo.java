package kr.re.kitri.lucidDream.common;

import kr.re.kitri.lucidDream.model.Amigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockAmigo {

    public List<Amigo> getAmigo(){

        List<Amigo> amigoList = new ArrayList<>();

        Amigo a = new Amigo();
        a.setAmigoName("aaa");
        a.setAmigoPhone("01088889999");
        a.setAmigoEmail("abc@aa.co.kr");
        amigoList.add(a);

        return amigoList;
    }
}
