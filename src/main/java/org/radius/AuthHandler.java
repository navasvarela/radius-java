package org.radius;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AuthHandler implements
		CompletionHandler<AsynchronousSocketChannel, Void> {
	private static final Logger LOG = LogManager.getLogger(AcctHandler.class);

	private final AsynchronousServerSocketChannel listener;

	public AuthHandler(AsynchronousServerSocketChannel serverSocketChannel) {
		listener = serverSocketChannel;
	}

	@Override
	public void completed(AsynchronousSocketChannel result, Void attachment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void failed(Throwable exc, Void attachment) {
		// TODO Auto-generated method stub

	}

}
