package net.anotheria.anoprise.eventservice;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

public class RemoteEventServicePushConsumerProxy implements EventServicePushConsumer {

	private RemoteEventServicePushConsumer consumer;

	private Logger logger = Logger.getLogger(RemoteEventServicePushConsumerProxy.class.getName());

	public RemoteEventServicePushConsumerProxy(RemoteEventServicePushConsumer aConsumer) {
		this.consumer = aConsumer;
	}

	@Override
	public void push(Event e) {
		if (consumer == null)
			return;

		try {
			consumer.push(e);
		} catch (RemoteException re) {
			logger.warn("Delivering event service event to remote consumer fail.", re);
		}
	}

}
