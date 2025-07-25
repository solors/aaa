package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: com.applovin.impl.np */
/* loaded from: classes2.dex */
public final class C5025np extends AbstractC3982a2 {

    /* renamed from: e */
    private final int f8655e;

    /* renamed from: f */
    private final byte[] f8656f;

    /* renamed from: g */
    private final DatagramPacket f8657g;

    /* renamed from: h */
    private Uri f8658h;

    /* renamed from: i */
    private DatagramSocket f8659i;

    /* renamed from: j */
    private MulticastSocket f8660j;

    /* renamed from: k */
    private InetAddress f8661k;

    /* renamed from: l */
    private InetSocketAddress f8662l;

    /* renamed from: m */
    private boolean f8663m;

    /* renamed from: n */
    private int f8664n;

    /* renamed from: com.applovin.impl.np$a */
    /* loaded from: classes2.dex */
    public static final class C5026a extends C4567i5 {
        public C5026a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C5025np() {
        this(2000);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        Uri uri = c4698k5.f7366a;
        this.f8658h = uri;
        String host = uri.getHost();
        int port = this.f8658h.getPort();
        m101076b(c4698k5);
        try {
            this.f8661k = InetAddress.getByName(host);
            this.f8662l = new InetSocketAddress(this.f8661k, port);
            if (this.f8661k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f8662l);
                this.f8660j = multicastSocket;
                multicastSocket.joinGroup(this.f8661k);
                this.f8659i = this.f8660j;
            } else {
                this.f8659i = new DatagramSocket(this.f8662l);
            }
            this.f8659i.setSoTimeout(this.f8655e);
            this.f8663m = true;
            m101075c(c4698k5);
            return -1L;
        } catch (IOException e) {
            throw new C5026a(e, 2001);
        } catch (SecurityException e2) {
            throw new C5026a(e2, 2006);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f8658h;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f8658h = null;
        MulticastSocket multicastSocket = this.f8660j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f8661k);
            } catch (IOException unused) {
            }
            this.f8660j = null;
        }
        DatagramSocket datagramSocket = this.f8659i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f8659i = null;
        }
        this.f8661k = null;
        this.f8662l = null;
        this.f8664n = 0;
        if (this.f8663m) {
            this.f8663m = false;
            m101073g();
        }
    }

    public C5025np(int i) {
        this(i, 8000);
    }

    public C5025np(int i, int i2) {
        super(true);
        this.f8655e = i2;
        byte[] bArr = new byte[i];
        this.f8656f = bArr;
        this.f8657g = new DatagramPacket(bArr, 0, i);
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f8664n == 0) {
            try {
                this.f8659i.receive(this.f8657g);
                int length = this.f8657g.getLength();
                this.f8664n = length;
                m101074d(length);
            } catch (SocketTimeoutException e) {
                throw new C5026a(e, 2002);
            } catch (IOException e2) {
                throw new C5026a(e2, 2001);
            }
        }
        int length2 = this.f8657g.getLength();
        int i3 = this.f8664n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f8656f, length2 - i3, bArr, i, min);
        this.f8664n -= min;
        return min;
    }
}
