package cn.bdqn;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * @author LiSheng
 * @create 2020-11-26 23:20
 */
public class TestGC {

    //实现:不断的产生新的数据(对象)，随机的废弃对象(垃圾)
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();

        while (true){
            int sleep = new Random().nextInt(100);
            //当前的时间戳，是偶数
            if(System.currentTimeMillis() % 2 ==0){
                list.clear();  //废弃清空
            }else{
                //向list中添加10000个对象
                for (int i = 0; i < 10000; i++) {
                    Properties properties = new Properties();
                    properties.put("key_"+i, "value_" + System.currentTimeMillis() + i);
                    list.add(properties);
                }
            }

           // System.out.println("list大小为：" + list.size());
            Thread.sleep(sleep);
        }
    }
}
