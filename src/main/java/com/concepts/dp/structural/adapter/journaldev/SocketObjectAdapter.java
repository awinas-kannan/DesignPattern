package com.concepts.dp.structural.adapter.journaldev;

public class SocketObjectAdapter implements Mobile {

	// Using Composition for adapter pattern
	private Socket socket;

	public SocketObjectAdapter(Socket s) {
		this.socket = s;
	}

	@Override
	public Integer getDesiredVolts() {
		return socket.getVolts();
	}
}