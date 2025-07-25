package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.AbstractC22898ad;
import com.mbridge.msdk.tracker.network.C22899ae;
import com.mbridge.msdk.tracker.network.NetworkMonitor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkUtility.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.i */
/* loaded from: classes6.dex */
final class C22926i {

    /* compiled from: NetworkUtility.java */
    /* renamed from: com.mbridge.msdk.tracker.network.toolbox.i$a */
    /* loaded from: classes6.dex */
    static class C22928a {

        /* renamed from: a */
        final String f59837a;

        /* renamed from: b */
        final AbstractC22898ad f59838b;

        private C22928a(String str, AbstractC22898ad abstractC22898ad) {
            this.f59837a = str;
            this.f59838b = abstractC22898ad;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m49430a(InputStream inputStream, int i, C22918c c22918c, NetworkMonitor networkMonitor) throws IOException {
        byte[] bArr;
        C22929l c22929l = new C22929l(c22918c, i);
        if (networkMonitor != null) {
            networkMonitor.m49471f(0L);
        }
        try {
            bArr = c22918c.m49449a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c22929l.write(bArr, 0, read);
                    if (networkMonitor != null) {
                        networkMonitor.m49471f(networkMonitor.m49472f() + read);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C22899ae.m49517a("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    c22918c.m49448a(bArr);
                    c22929l.close();
                    throw th;
                }
            }
            byte[] byteArray = c22929l.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C22899ae.m49517a("Error occurred when closing InputStream", new Object[0]);
            }
            c22918c.m49448a(bArr);
            c22929l.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
