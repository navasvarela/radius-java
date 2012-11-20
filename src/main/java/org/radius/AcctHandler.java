package org.radius;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AcctHandler implements
		CompletionHandler<AsynchronousSocketChannel, Void> {
	private static final Logger LOG = LogManager.getLogger(AcctHandler.class);

	private final AsynchronousServerSocketChannel listener;

	public AcctHandler(AsynchronousServerSocketChannel theListener) {
		listener = theListener;
	}

	@Override
	public void completed(AsynchronousSocketChannel result, Void attachment) {
		listener.accept(attachment, this);

		// TODO Handle
	}

	@Override
	public void failed(Throwable exc, Void attachment) {
		LOG.debug("failed", exc);

	}

}
