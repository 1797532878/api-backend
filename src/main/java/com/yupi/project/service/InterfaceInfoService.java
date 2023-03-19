package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import model.entity.InterfaceInfo;

/**
* @author cc
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-01-30 20:35:12
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
