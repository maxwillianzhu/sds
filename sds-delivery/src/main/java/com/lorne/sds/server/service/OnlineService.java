package com.lorne.sds.server.service;

import com.lorne.core.framework.exception.ServiceException;
import com.lorne.sds.server.model.SocketModel;

/**
 * create by lorne on 2017/12/6
 */
public interface OnlineService {

    boolean add(String modelName,String uniqueKey);

    boolean remove(String modelName,String uniqueKey);

    boolean putKey(String modelName, String uniqueKey, String key);

    SocketModel getModelByKey(String key) throws ServiceException;

    boolean check(String key);
}
