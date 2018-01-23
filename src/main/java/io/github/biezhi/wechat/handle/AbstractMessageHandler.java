package io.github.biezhi.wechat.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.github.biezhi.wechat.api.WechatApi;
import io.github.biezhi.wechat.model.GroupMessage;
import io.github.biezhi.wechat.model.UserMessage;

/**
 * 一个默认的消息处理实现
 *
 * @author biezhi
 * 17/06/2017
 */
public abstract class AbstractMessageHandler implements MessageHandle {

	protected static final Logger log = LoggerFactory.getLogger(AbstractMessageHandler.class);
    @Override
    public void wxSync(JsonObject msg) {
    }

    @Override
    public void groupListChange(String groupId, JsonArray memberList) {
    }

    @Override
    public void groupMemberChange(String groupId, JsonArray memberList) {
    }

    public abstract void userMessage(UserMessage userMessage);

    public abstract void groupMessage(GroupMessage groupMessage);

}
