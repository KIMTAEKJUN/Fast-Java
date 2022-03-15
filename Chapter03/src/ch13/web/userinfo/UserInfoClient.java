package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        // FileInputStream : 파일로부터 바이트로 입력받아, 바이트 단위로 출력 할 수 있는 클래스
        FileInputStream fis = new FileInputStream("Chapter03/db.properties");

        // Properties : Key 와 Value 를 갖는다, load()는 properties의 파일을 읽어온다.
        Properties prop = new Properties();
        prop.load(fis);

        // getProperty() 메소드를 통해서 해당 Key의 Value에 접근 할 수 있다.
        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;

        if( dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if ( dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("DB ERROR");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
