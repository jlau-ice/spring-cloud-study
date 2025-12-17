package com.ice.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.user.domain.dto.LoginFormDTO;
import com.ice.user.domain.po.User;
import com.ice.user.domain.vo.UserLoginVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author ice
 * @since 2023-05-05
 */
public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
