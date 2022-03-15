package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

// UserInfoMySqlDao 클래스가 UserInfoDao를 상속받는다.
public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userID = " + userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = " + userInfo.getUserID());
    }
}
