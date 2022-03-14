package ch02;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo my = new UserInfo();

        my.setUserId("kuah0408");
        my.userPassword = "qpwoei01124";
        my.setUserName("쿠아님");
        my.address = "서울 강남구";
        my.phoneNumber = "010-1234-5678";

        my.showUserInfo();
    }
}
