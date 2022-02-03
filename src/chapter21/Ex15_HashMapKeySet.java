package chapter21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex15_HashMapKeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //key-value 기반 데이터 저장
        map.put("홍길동", 20);
        map.put("전우치", 25);
        map.put("손오공", 27);

        //key만 달고 있는 컬렉션 객체 생성
        Set<String> ks = map.keySet();

        //전체 key 출력
        for (String s : ks) {
            System.out.print(s + "\t");
        }
        System.out.println();

        //전체 value 출력
        for (String s : ks) {
            System.out.print(map.get(s).toString() + "\t");
        }
        System.out.println();

        //전체 value 출력(반복자 기반)
        for (Iterator<String> itr = ks.iterator(); itr.hasNext(); ) {
            System.out.print(map.get(itr.next()).toString() + "\t");
        }
        System.out.println();

    }
}
