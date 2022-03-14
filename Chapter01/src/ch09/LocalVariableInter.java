package ch09;

public class LocalVariableInter {
    public static void main(String[] args) {
        // var: 지역변수를 선언할 때 초깃값을 통하여 데이터 타입을 추론한다.
        var i = 10; // integer
        var j = 10.0; // double
        var str = "test"; // string

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "Hello"; // 같은 string type이라 변수에 값이 바뀐다.
        // str = 3; string이랑은 다른 type(int)이라 변수에 값이 바뀌지않는다.
    }
}
