package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;

/**
 * Wrap javadns UDPClient since it is only package visible.
 */
public final class MobilyzerUDPClient {
    private final UDPClient client;

    public MobilyzerUDPClient(long endTime) throws IOException {
        client = new UDPClient(endTime);
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

    public byte[] recv(int max) throws IOException {
        return client.recv(max);
    }

    public void cleanup() throws IOException {
        client.cleanup();
    }

    public static byte[] sendrecv(SocketAddress local, SocketAddress remote, byte[] data, int max, long endTime) throws IOException {
        return UDPClient.sendrecv(local, remote, data, max, endTime);
    }

    public static byte[] sendrecv(SocketAddress addr, byte[] data, int max, long endTime) throws IOException {
        return UDPClient.sendrecv(addr, data, max, endTime);
    }
}
