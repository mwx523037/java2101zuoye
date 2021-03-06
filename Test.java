import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("宋厚宇",29, Arrays.asList("唱歌","跳舞"));
        String stuJson=JSON.toJSON(student).toString();
        System.out.println(stuJson);

        //json字符串转化为对象宋厚宇
        String stuJson2 = "{\"ski士大夫lls\":[\"唱歌\",\"跳舞\"],\"name\":\"徐伟\",\"age\":29}";
        Student student1 = JSON.parseObject(stuJson2,Student.class);
        System.out.println("转化为学生对象："+student1.getName());
    }
}
