package ch3.ch3_13.domain.userinfo.dao.mysql;

import ch3.ch3_13.domain.userinfo.UserInfo;
import ch3.ch3_13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID : " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update MySQL DB userID : " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete MySQL DB userID : " + userInfo.getUserId());
    }
}
