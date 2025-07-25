package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: classes4.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";

    /* renamed from: a */
    private static final Object f36154a = new Object();

    /* renamed from: b */
    private static final Object f36155b = new Object();
    @GuardedBy("valueLock")

    /* renamed from: c */
    private static boolean f36156c = false;
    @GuardedBy("valueLock")

    /* renamed from: d */
    private static long f36157d = 0;
    @GuardedBy("valueLock")

    /* renamed from: e */
    private static String f36158e = "time.android.com";

    /* loaded from: classes4.dex */
    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private SntpClient() {
    }

    /* renamed from: e */
    static /* synthetic */ long m72559e() throws IOException {
        return m72556h();
    }

    /* renamed from: g */
    private static void m72557g(byte b, byte b2, int i, long j) throws IOException {
        if (b != 3) {
            if (b2 != 4 && b2 != 5) {
                throw new IOException("SNTP: Untrusted mode: " + ((int) b2));
            } else if (i != 0 && i <= 15) {
                if (j != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            } else {
                throw new IOException("SNTP: Untrusted stratum: " + i);
            }
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (f36155b) {
            if (f36156c) {
                j = f36157d;
            } else {
                j = -9223372036854775807L;
            }
        }
        return j;
    }

    public static String getNtpHost() {
        String str;
        synchronized (f36155b) {
            str = f36158e;
        }
        return str;
    }

    /* renamed from: h */
    private static long m72556h() throws IOException {
        InetAddress byName = InetAddress.getByName(getNtpHost());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            m72553k(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            long m72554j = m72554j(bArr, 24);
            long m72554j2 = m72554j(bArr, 32);
            long m72554j3 = m72554j(bArr, 40);
            m72557g((byte) ((b >> 6) & 3), (byte) (b & 7), bArr[1] & 255, m72554j3);
            long j2 = (j + (((m72554j2 - m72554j) + (m72554j3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: i */
    private static long m72555i(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
                return;
            }
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (f36155b) {
            z = f36156c;
        }
        return z;
    }

    /* renamed from: j */
    private static long m72554j(byte[] bArr, int i) {
        long m72555i = m72555i(bArr, i);
        long m72555i2 = m72555i(bArr, i + 4);
        if (m72555i == 0 && m72555i2 == 0) {
            return 0L;
        }
        return ((m72555i - 2208988800L) * 1000) + ((m72555i2 * 1000) / 4294967296L);
    }

    /* renamed from: k */
    private static void m72553k(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) (j3 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j3 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j3 >> 0);
        long j4 = ((j - (j2 * 1000)) * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j4 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j4 >> 16);
        bArr[i7] = (byte) (j4 >> 8);
        bArr[i7 + 1] = (byte) (Math.random() * 255.0d);
    }

    public static void setNtpHost(String str) {
        synchronized (f36155b) {
            if (!f36158e.equals(str)) {
                f36158e = str;
                f36156c = false;
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.f36154a) {
                synchronized (SntpClient.f36155b) {
                    if (SntpClient.f36156c) {
                        return;
                    }
                    long m72559e = SntpClient.m72559e();
                    synchronized (SntpClient.f36155b) {
                        long unused = SntpClient.f36157d = m72559e;
                        boolean unused2 = SntpClient.f36156c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }
    }

    /* loaded from: classes4.dex */
    private static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        @Nullable

        /* renamed from: b */
        private final InitializationCallback f36159b;

        public NtpTimeCallback(@Nullable InitializationCallback initializationCallback) {
            this.f36159b = initializationCallback;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
            if (this.f36159b != null) {
                if (!SntpClient.isInitialized()) {
                    this.f36159b.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                } else {
                    this.f36159b.onInitialized();
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
            InitializationCallback initializationCallback = this.f36159b;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
        }
    }
}
