package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes4.dex */
public final class UdpDataSource extends BaseDataSource {
    public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
    public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 8000;
    public static final int UDP_PORT_UNSET = -1;

    /* renamed from: e */
    private final int f35910e;

    /* renamed from: f */
    private final byte[] f35911f;

    /* renamed from: g */
    private final DatagramPacket f35912g;
    @Nullable

    /* renamed from: h */
    private Uri f35913h;
    @Nullable

    /* renamed from: i */
    private DatagramSocket f35914i;
    @Nullable

    /* renamed from: j */
    private MulticastSocket f35915j;
    @Nullable

    /* renamed from: k */
    private InetAddress f35916k;

    /* renamed from: l */
    private boolean f35917l;

    /* renamed from: m */
    private int f35918m;

    /* loaded from: classes4.dex */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f35913h = null;
        MulticastSocket multicastSocket = this.f35915j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) Assertions.checkNotNull(this.f35916k));
            } catch (IOException unused) {
            }
            this.f35915j = null;
        }
        DatagramSocket datagramSocket = this.f35914i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f35914i = null;
        }
        this.f35916k = null;
        this.f35918m = 0;
        if (this.f35917l) {
            this.f35917l = false;
            m72805c();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f35914i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35913h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.uri;
        this.f35913h = uri;
        String str = (String) Assertions.checkNotNull(uri.getHost());
        int port = this.f35913h.getPort();
        m72804d(dataSpec);
        try {
            this.f35916k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f35916k, port);
            if (this.f35916k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f35915j = multicastSocket;
                multicastSocket.joinGroup(this.f35916k);
                this.f35914i = this.f35915j;
            } else {
                this.f35914i = new DatagramSocket(inetSocketAddress);
            }
            this.f35914i.setSoTimeout(this.f35910e);
            this.f35917l = true;
            m72803e(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f35918m == 0) {
            try {
                ((DatagramSocket) Assertions.checkNotNull(this.f35914i)).receive(this.f35912g);
                int length = this.f35912g.getLength();
                this.f35918m = length;
                m72806b(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.f35912g.getLength();
        int i3 = this.f35918m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f35911f, length2 - i3, bArr, i, min);
        this.f35918m -= min;
        return min;
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f35910e = i2;
        byte[] bArr = new byte[i];
        this.f35911f = bArr;
        this.f35912g = new DatagramPacket(bArr, 0, i);
    }
}
