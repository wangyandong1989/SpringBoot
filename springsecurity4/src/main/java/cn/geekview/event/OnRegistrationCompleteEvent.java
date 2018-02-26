package cn.geekview.event;

import cn.geekview.domain.entity.User;
import org.springframework.context.ApplicationEvent;


public class OnRegistrationCompleteEvent extends ApplicationEvent {

    private final String appUrl;

    private final User user;


    public OnRegistrationCompleteEvent(final User user, final String appUrl) {
        super(user);
        this.user = user;
        this.appUrl = appUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }


    public User getUser() {
        return user;
    }

}
