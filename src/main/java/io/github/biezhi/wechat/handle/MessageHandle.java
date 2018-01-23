package io.github.biezhi.wechat.handle;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.biezhi.wechat.model.GroupMessage;
import io.github.biezhi.wechat.model.UserMessage;

/**
 * 一个默认的消息处理实现
 *
 * @author biezhi
 * 17/06/2017
 */
public interface MessageHandle {

	final String join_type = "入群:A01";
	final String depart_type = "退群:A02";
	final String incomprehension = "A1000";  //机器人没有正确的回答结果
	
    /**
     * 保存微信消息
     *
     * @param msg
     */
    void wxSync(JsonObject msg);

    void userMessage(UserMessage userMessage);

    void groupMessage(GroupMessage groupMessage);

    void groupMemberChange(String groupId, JsonArray memberList);

    void groupListChange(String groupId, JsonArray memberList);

}
