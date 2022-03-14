package ch02;

public class UserInfo { // 유저 정보(UserInfo) Class 구현
    // 클래스의 속성, 특성을 멤버 변수(Member Variable)라 말한다.
    // 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태를 클래스(Class)라 말한다.
    String userId; // 아이디
    String userPassword; // 비밀번호
    String userName; // 유저이름
    String address; // 주소
    String phoneNumber; // 전화번호

    public void setUserName(String name) {
        userName = name;
    }

    public void setUserId(String id) {
        userId = id;
    }

    public void showUserInfo() {
        System.out.println("아이디: " + userId + ", 비밀번호: " + userPassword + ", \n유저이름: " + userName + ", 주소: " + address + ", 전화번호: " + phoneNumber);
    }
}
