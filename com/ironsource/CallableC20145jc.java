package com.ironsource;

import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.jc */
/* loaded from: classes6.dex */
public class CallableC20145jc implements Callable<C20629pa> {

    /* renamed from: d */
    private static final String f50701d = "FileWorkerThread";

    /* renamed from: e */
    private static final String f50702e = "X-Android-Protocols";

    /* renamed from: f */
    private static final String f50703f = "http/1.1,h2";

    /* renamed from: a */
    private final C20574oa f50704a;

    /* renamed from: b */
    private final String f50705b;

    /* renamed from: c */
    private long f50706c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC20145jc(C20574oa c20574oa, String str, long j) {
        this.f50704a = c20574oa;
        this.f50705b = str;
        this.f50706c = j;
    }

    /* renamed from: a */
    int m57851a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public C20629pa call() {
        int i;
        if (this.f50706c == 0) {
            this.f50706c = 1L;
        }
        C20629pa c20629pa = null;
        for (int i2 = 0; i2 < this.f50706c; i2++) {
            c20629pa = m57853a(this.f50704a.m56038e(), i2, this.f50704a.m56042a(), this.f50704a.m56040c(), this.f50704a.m56037f());
            int m55854b = c20629pa.m55854b();
            if (m55854b != 1008 && m55854b != 1009) {
                break;
            }
        }
        if (c20629pa != null && c20629pa.m55858a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f50705b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(this.f50704a.m56041b().getName());
            String sb3 = sb2.toString();
            String str2 = this.f50704a.m56039d() + str + C21216x8.f54443E + this.f50704a.m56041b().getName();
            try {
                if (m57851a(c20629pa.m55858a(), str2) == 0) {
                    c20629pa.m55857a(1006);
                } else if (!m57852a(str2, sb3)) {
                    c20629pa.m55857a(1014);
                }
            } catch (FileNotFoundException e) {
                C20086i9.m57997d().m58003a(e);
                i = 1018;
                c20629pa.m55857a(i);
            } catch (Error e2) {
                C20086i9.m57997d().m58003a(e2);
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    Logger.m54970i(f50701d, e2.getMessage());
                }
                i = 1019;
                c20629pa.m55857a(i);
            } catch (Exception e3) {
                C20086i9.m57997d().m58003a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.m54970i(f50701d, e3.getMessage());
                }
                c20629pa.m55857a(1009);
            }
        }
        return c20629pa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0140, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0153, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #9 {all -> 0x008e, blocks: (B:23:0x0087, B:24:0x008a, B:48:0x00c2), top: B:112:0x0018 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.net.HttpURLConnection, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.ironsource.C20629pa m57853a(java.lang.String r7, int r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC20145jc.m57853a(java.lang.String, int, int, int, boolean):com.ironsource.pa");
    }

    /* renamed from: a */
    boolean m57852a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    /* renamed from: a */
    byte[] m57854a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
