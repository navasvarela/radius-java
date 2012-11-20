package org.radius;

import java.util.Properties;

public class ServerConfiguration {

	private static final String SERVER_ACCT_PORT_PROP = "led.server.acct.port";
	private static final String SERVER_AUTH_PORT_PROP = "led.server.auth.port";
	private static final String SERVER_THREADS_PROP = "led.server.threads";

	private static final int DEFAULT_AUTH_PORT = 1812;
	private static final int DEFAULT_ACCT_PORT = 1813;
	private static final int DEFAULT_THREADS = 100;

	private final int acctPort;
	private final int authPort;
	private final int threads;

	public ServerConfiguration(Properties properties) {

		acctPort = Integer.parseInt(properties.getProperty(
				SERVER_ACCT_PORT_PROP, Integer.toString(DEFAULT_ACCT_PORT)));
		authPort = Integer.parseInt(properties.getProperty(
				SERVER_ACCT_PORT_PROP, Integer.toString(DEFAULT_AUTH_PORT)));
		threads = Integer.parseInt(properties.getProperty(SERVER_THREADS_PROP,
				Integer.toString(DEFAULT_THREADS)));

	}

	public ServerConfiguration(int theAuthPort, int theAcctPort, int theThreads) {
		authPort = theAuthPort;
		acctPort = theAcctPort;
		threads = theThreads;

	}

	public ServerConfiguration() {
		this(DEFAULT_AUTH_PORT, DEFAULT_ACCT_PORT, DEFAULT_THREADS);
	}

	public int getAcctPort() {
		return acctPort;
	}

	public int getThreads() {
		return threads;
	}

	public int getAuthPort() {
		return authPort;
	}

}
