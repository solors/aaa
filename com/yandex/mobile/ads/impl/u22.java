package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes8.dex */
public final class u22 extends AbstractC30731kj {

    /* renamed from: e */
    private final int f86084e;

    /* renamed from: f */
    private final byte[] f86085f;

    /* renamed from: g */
    private final DatagramPacket f86086g;
    @Nullable

    /* renamed from: h */
    private Uri f86087h;
    @Nullable

    /* renamed from: i */
    private DatagramSocket f86088i;
    @Nullable

    /* renamed from: j */
    private MulticastSocket f86089j;
    @Nullable

    /* renamed from: k */
    private InetAddress f86090k;

    /* renamed from: l */
    private boolean f86091l;

    /* renamed from: m */
    private int f86092m;

    /* renamed from: com.yandex.mobile.ads.impl.u22$a */
    /* loaded from: classes8.dex */
    public static final class C31549a extends C30748ku {
        public C31549a(Exception exc, int i) {
            super(exc, i);
        }
    }

    public u22(int i) {
        super(true);
        this.f86084e = 8000;
        byte[] bArr = new byte[2000];
        this.f86085f = bArr;
        this.f86086g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws C31549a {
        Uri uri = c30976nu.f83111a;
        this.f86087h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f86087h.getPort();
        m32537b(c30976nu);
        try {
            this.f86090k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f86090k, port);
            if (this.f86090k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f86089j = multicastSocket;
                multicastSocket.joinGroup(this.f86090k);
                this.f86088i = this.f86089j;
            } else {
                this.f86088i = new DatagramSocket(inetSocketAddress);
            }
            this.f86088i.setSoTimeout(this.f86084e);
            this.f86091l = true;
            m32535c(c30976nu);
            return -1L;
        } catch (IOException e) {
            throw new C31549a(e, 2001);
        } catch (SecurityException e2) {
            throw new C31549a(e2, 2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() {
        this.f86087h = null;
        MulticastSocket multicastSocket = this.f86089j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f86090k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f86089j = null;
        }
        DatagramSocket datagramSocket = this.f86088i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f86088i = null;
        }
        this.f86090k = null;
        this.f86092m = 0;
        if (this.f86091l) {
            this.f86091l = false;
            m32534e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f86087h;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws C31549a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f86092m == 0) {
            try {
                DatagramSocket datagramSocket = this.f86088i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f86086g);
                int length = this.f86086g.getLength();
                this.f86092m = length;
                m32536c(length);
            } catch (SocketTimeoutException e) {
                throw new C31549a(e, 2002);
            } catch (IOException e2) {
                throw new C31549a(e2, 2001);
            }
        }
        int length2 = this.f86086g.getLength();
        int i3 = this.f86092m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f86085f, length2 - i3, bArr, i, min);
        this.f86092m -= min;
        return min;
    }
}
