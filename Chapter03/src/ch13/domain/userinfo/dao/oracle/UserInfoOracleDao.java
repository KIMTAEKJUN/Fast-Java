package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

// UserInfoOracleDao 클래스가 UserInfoDao를 상속받는다.
public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID = " + userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = " + userInfo.getUserID());
    }
}
