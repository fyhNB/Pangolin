package com.yuheng.pangolin.service.user;

import com.yuheng.pangolin.model.user.Token;
import com.yuheng.pangolin.model.user.User;
import com.yuheng.pangolin.model.user.UserRes;

import java.util.List;

public interface UserService {
    // 注册
    Token signUp(String username, String password, UserCallBack callback);

    // 是否存在某用户名
    boolean hasUserWithUsername(String username);

    // 登录
    Token signIn(String username, String password, UserCallBack userCallback);

    // 登出
    void signOut(String token);

    UserRes getUserById(String uid);

    // 修改用户信息
    Token editUserInfo(User user);
}
