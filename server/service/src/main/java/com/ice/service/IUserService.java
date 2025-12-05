package com.ice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.domain.dto.LoginFormDTO;
import com.ice.domain.po.User;
import com.ice.domain.vo.UserLoginVO;

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
