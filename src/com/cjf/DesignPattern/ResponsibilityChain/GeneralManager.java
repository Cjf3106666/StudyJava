package com.cjf.DesignPattern.ResponsibilityChain;

/**
 * @Descpription 责任链模式
 * @Author CJF
 * @Date 2018/12/18 14:47
 **/
public class GeneralManager extends Leader {

    public GeneralManager(String name, int max_leave_day) {
        super(name, max_leave_day);
    }

    @Override
    void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDay() < max_leave_day) {
            System.out.println("假条：" + request);
            System.out.println("总经理 " + this.name + " 审批通过！");
        } else {
            if (this.nextLeader != null) {
                System.out.println("TeamLeader 转交上级处理");
                this.nextLeader.handlerRequest(request);
            } else {
                System.out.println("假条：" + request);
                System.out.println("驳回请求");
            }
        }
    }
}
