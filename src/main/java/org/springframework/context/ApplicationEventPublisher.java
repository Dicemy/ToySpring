package org.springframework.context;

public interface ApplicationEventPublisher {

	/**
	 * 发布事件
	 *
	 * @param event
	 */
	void publishEvent(ApplicationEvent event);
}
