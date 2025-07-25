package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsException;
import com.smaato.sdk.core.dns.DnsQueryResult;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.dns.g */
/* loaded from: classes7.dex */
public final class DnsDataSource {
    @NonNull
    /* renamed from: b */
    private DnsMessage m39607b(@NonNull DnsMessage dnsMessage, @NonNull InetAddress inetAddress, int i) throws IOException {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(inetAddress, i), 5000);
            socket.setSoTimeout(5000);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dnsMessage.m39613q(dataOutputStream);
            dataOutputStream.flush();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2 += dataInputStream.read(bArr, i2, readUnsignedShort - i2)) {
            }
            DnsMessage dnsMessage2 = new DnsMessage(bArr);
            if (dnsMessage2.f71481a == dnsMessage.f71481a) {
                socket.close();
                return dnsMessage2;
            }
            throw new DnsException.IdMismatch(dnsMessage, dnsMessage2);
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* renamed from: c */
    private DnsMessage m39606c(@NonNull DnsMessage dnsMessage, @NonNull InetAddress inetAddress, int i) throws IOException {
        DatagramPacket m39618l = dnsMessage.m39618l(inetAddress, i);
        byte[] bArr = new byte[1024];
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(5000);
            datagramSocket.send(m39618l);
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
            datagramSocket.receive(datagramPacket);
            DnsMessage dnsMessage2 = new DnsMessage(datagramPacket.getData());
            if (dnsMessage2.f71481a == dnsMessage.f71481a) {
                datagramSocket.close();
                return dnsMessage2;
            }
            throw new DnsException.IdMismatch(dnsMessage, dnsMessage2);
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* renamed from: a */
    public DnsQueryResult m39608a(@NonNull DnsMessage dnsMessage, @NonNull InetAddress inetAddress, int i) throws DnsException {
        ArrayList arrayList = new ArrayList();
        try {
            DnsMessage m39606c = m39606c(dnsMessage, inetAddress, i);
            if (!m39606c.f71483c) {
                return new DnsQueryResult(inetAddress, DnsQueryResult.QueryMethod.UDP, dnsMessage, m39606c, i);
            }
        } catch (IOException e) {
            arrayList.add(e);
        }
        try {
            return new DnsQueryResult(inetAddress, DnsQueryResult.QueryMethod.TCP, dnsMessage, m39607b(dnsMessage, inetAddress, i), i);
        } catch (IOException e2) {
            arrayList.add(e2);
            throw new DnsException.C27085a(arrayList);
        }
    }
}
