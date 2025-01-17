package com.wwwang.assignment.shortenurl.shorten.scissor;

/**
 * 裁剪长字符串的剪刀
 */
public interface IScissor {

    /**
     * 把长信息转为唯一对应的短信息
     * @param info
     * @return
     */
    String cut(String info);

}
