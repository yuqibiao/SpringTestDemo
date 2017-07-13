package com.yyyu.spring.pojo;

/**
 * 功能：用户订单
 *
 * @author yu
 * @date 2017/7/13.
 */
public class UserOrder {

    private Integer oId;
    private String tip;
    private User user;

    public UserOrder() {
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
