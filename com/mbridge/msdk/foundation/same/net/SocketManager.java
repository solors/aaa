package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;

/* renamed from: com.mbridge.msdk.foundation.same.net.e */
/* loaded from: classes6.dex */
public final class SocketManager {

    /* renamed from: a */
    private static volatile AtomicInteger f56591a = new AtomicInteger(1);

    /* renamed from: b */
    private ThreadPoolExecutor f56592b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SocketManager.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.e$b */
    /* loaded from: classes6.dex */
    public static final class C21995b {

        /* renamed from: a */
        private static SocketManager f56605a = new SocketManager();
    }

    /* renamed from: a */
    public static SocketManager m52208a() {
        return C21995b.f56605a;
    }

    private SocketManager() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.net.e.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("SocketThreadPool");
                return newThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.f56592b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public final String m52206a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    /* renamed from: a */
    public final void m52207a(String str, int i, String str2, boolean z, IListener iListener) {
        final C21994a c21994a = new C21994a(str, i, str2, z, iListener);
        this.f56592b.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.e.2
            @Override // java.lang.Runnable
            public final void run() {
                c21994a.m52204a();
            }
        });
    }

    /* compiled from: SocketManager.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.e$a */
    /* loaded from: classes6.dex */
    public class C21994a {

        /* renamed from: b */
        private ByteBuffer f56597b;

        /* renamed from: c */
        private String f56598c;

        /* renamed from: d */
        private boolean f56599d;

        /* renamed from: e */
        private IListener f56600e;

        /* renamed from: f */
        private OutputStream f56601f;

        /* renamed from: g */
        private int f56602g;

        /* renamed from: h */
        private Socket f56603h;

        /* renamed from: i */
        private String f56604i;

        C21994a(String str, int i, String str2, boolean z, IListener iListener) {
            this.f56598c = str;
            this.f56602g = i;
            this.f56604i = str2;
            this.f56599d = z;
            this.f56600e = iListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0085 A[Catch: all -> 0x02a5, TryCatch #6 {IOException -> 0x02d0, blocks: (B:100:0x029a, B:3:0x0005, B:5:0x0025, B:10:0x0037, B:12:0x0085, B:18:0x0097, B:20:0x00ad, B:29:0x0102, B:36:0x0152, B:39:0x018c, B:42:0x019a, B:53:0x01ba, B:62:0x01e2, B:72:0x0203, B:74:0x0207, B:75:0x0214, B:97:0x0293, B:21:0x00bf, B:23:0x00c3, B:28:0x00ec, B:26:0x00cd, B:27:0x00e6, B:13:0x008b, B:17:0x0094, B:84:0x0233, B:86:0x0240, B:88:0x0246, B:90:0x024d, B:85:0x023a), top: B:123:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[Catch: all -> 0x02a5, TryCatch #6 {IOException -> 0x02d0, blocks: (B:100:0x029a, B:3:0x0005, B:5:0x0025, B:10:0x0037, B:12:0x0085, B:18:0x0097, B:20:0x00ad, B:29:0x0102, B:36:0x0152, B:39:0x018c, B:42:0x019a, B:53:0x01ba, B:62:0x01e2, B:72:0x0203, B:74:0x0207, B:75:0x0214, B:97:0x0293, B:21:0x00bf, B:23:0x00c3, B:28:0x00ec, B:26:0x00cd, B:27:0x00e6, B:13:0x008b, B:17:0x0094, B:84:0x0233, B:86:0x0240, B:88:0x0246, B:90:0x024d, B:85:0x023a), top: B:123:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[Catch: all -> 0x02a5, TryCatch #6 {IOException -> 0x02d0, blocks: (B:100:0x029a, B:3:0x0005, B:5:0x0025, B:10:0x0037, B:12:0x0085, B:18:0x0097, B:20:0x00ad, B:29:0x0102, B:36:0x0152, B:39:0x018c, B:42:0x019a, B:53:0x01ba, B:62:0x01e2, B:72:0x0203, B:74:0x0207, B:75:0x0214, B:97:0x0293, B:21:0x00bf, B:23:0x00c3, B:28:0x00ec, B:26:0x00cd, B:27:0x00e6, B:13:0x008b, B:17:0x0094, B:84:0x0233, B:86:0x0240, B:88:0x0246, B:90:0x024d, B:85:0x023a), top: B:123:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[Catch: all -> 0x02a5, TryCatch #6 {IOException -> 0x02d0, blocks: (B:100:0x029a, B:3:0x0005, B:5:0x0025, B:10:0x0037, B:12:0x0085, B:18:0x0097, B:20:0x00ad, B:29:0x0102, B:36:0x0152, B:39:0x018c, B:42:0x019a, B:53:0x01ba, B:62:0x01e2, B:72:0x0203, B:74:0x0207, B:75:0x0214, B:97:0x0293, B:21:0x00bf, B:23:0x00c3, B:28:0x00ec, B:26:0x00cd, B:27:0x00e6, B:13:0x008b, B:17:0x0094, B:84:0x0233, B:86:0x0240, B:88:0x0246, B:90:0x024d, B:85:0x023a), top: B:123:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m52204a() {
            /*
                Method dump skipped, instructions count: 754
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.SocketManager.C21994a.m52204a():void");
        }

        /* renamed from: a */
        private void m52202a(String str) {
            if (this.f56600e != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f56600e.onError(new CommonError(13, new C21991a(404, str.getBytes(), null)));
            }
        }
    }
}
