package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;

/**
 * Wrap javadns TCPClient since it is only package visible.
 */
public final class MobilyzerTCPClient {
    private final TCPClient client;

    public MobilyzerTCPClient(long endTime) throws IOException {
        client = new TCPClient(endTime);
    }

    public void bind(SocketAddress addr) throws IOException {
        client.bind(addr);
    }

    public void connect(SocketAddress addr) throws IOException {
        client.connect(addr);
    }

    public void send(byte[] data) throws IOException {
        client.send(data);
    }

    public byte[] recv() throws IOException {
        return client.recv();
    }

    public static byte[] sendrecv(SocketAddress local, SocketAddress remote, byte[] data, long endTime) throws IOException {
        return TCPClient.sendrecv(local, remote, data, endTime);
    }

    public static byte[] sendrecv(SocketAddress addr, byte[] data, long endTime) throws IOException {
        return TCPClient.sendrecv(addr, data, endTime);
    }
}
