package com.shaw.schedule;

import com.shaw.base.utils.SpringContextHolder;
import com.shaw.entity.TblTeam;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.context.ApplicationContext;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 * Created by shaw on 2017/7/17.
 */
public class Hello {

      private static ApplicationContext applicationContext;
//    private static Hello ourInstance = new Hello();
//
//    public static Hello getInstance() {
//        return ourInstance;
//    }
//
//    private Hello() {
//    }
//
//    public static void main(String args[]){
//        Map<Integer,String> map = new HashMap<>();
//        map.put(2,"hello");
//        map.put(1,"world");
//        map.put(3,"homie");
//        map.put(4,"fly");
//        map.put(5,"away");
//        List<Map.Entry<Integer,String>> infolds = new ArrayList<>(map.entrySet());
//
//        Collections.sort(infolds, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getKey().toString().compareTo(o2.getValue());
//            }
//        });
//
//        for (int i=0;i<infolds.size();i++){
//            System.out.println(infolds.get(i).toString());
//        }
//    }

    public void method(){
        try{
            System.out.println("A");
            int i = 10/0;
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }

    }

    public static void importXls(){
        File file = new File("E:/");
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            Workbook workbook = Workbook.getWorkbook(is);
            Sheet sheet = workbook.getSheet(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int[] remove(int[] array) {
        Set<Integer> treeSet = new HashSet<>();
        for (int a : array){
            treeSet.add(a);
        }
        int b[] = new int[treeSet.size()];
        int j = 0;
        for (Integer i : treeSet){
            b[j++] = i;
        }
        return b;
    }

    public static void main(String args[]){
//        BigDecimal decimal = BigDecimal.valueOf(1.00);
//        String str = String.valueOf("1234");
//        System.out.println(str.length());
//        int[] arr = new int[]{1,6,4,1,0,3,2,1};
//        for (int a : remove(arr)) {
//            System.out.println(a);
//        }
        iteratorMap();
    }

    public static void iteratorMap(){
        List<String> list = new ArrayList<>();
        TblTeam tblTeam = SpringContextHolder.getBean(TblTeam.class);
        tblTeam.setName("hello");
        tblTeam.setCity("shanghai");
        Map<String,String> map = new HashMap<>();
        map.put("name",tblTeam.getName());
        map.put("city",tblTeam.getCity());
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }
    }
}

