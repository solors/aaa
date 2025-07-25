package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32453ccoc2oic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cco22 */
/* loaded from: classes8.dex */
public class C32591cco22 extends Thread {
    private Context cco22;
    private C32589c2oc2i cii2c2;
    private InterfaceC32600cioccoiococ ciii2coi2;
    private final String coo2iico = "GMCDownloadThread";
    private final int coi222o222 = 20000;
    private final int c2oc2i = 4096;
    private final int cioccoiococ = 1;
    private final int c2oc2o = 5;
    private int coiic = 0;
    private ExecutorService cicic = C32465cioc2.c2oc2i;
    private HashMap<String, Integer> cicc2iiccc = new HashMap<>();
    private final int[] ccoc2oic = {0, 3, 10};
    private List<C32596cii2c2> coiio2 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cco22$coi222o222 */
    /* loaded from: classes8.dex */
    public class RunnableC32592coi222o222 implements Runnable {
        final /* synthetic */ C32596cii2c2 coo2iico;

        RunnableC32592coi222o222(C32596cii2c2 c32596cii2c2) {
            this.coo2iico = c32596cii2c2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.coo2iico != null) {
                MLog.m25887i("GMCDownloadThread", "download retry, url = " + this.coo2iico.c2oc2o());
                C32591cco22.this.c2oc2i(this.coo2iico);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cco22$coo2iico */
    /* loaded from: classes8.dex */
    public class RunnableC32593coo2iico implements Runnable {
        final /* synthetic */ C32596cii2c2 coo2iico;

        RunnableC32593coo2iico(C32596cii2c2 c32596cii2c2) {
            this.coo2iico = c32596cii2c2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C32591cco22.this.cioccoiococ(this.coo2iico);
        }
    }

    public C32591cco22(@NonNull Context context, @NonNull C32589c2oc2i c32589c2oc2i, @NonNull InterfaceC32600cioccoiococ interfaceC32600cioccoiococ) {
        this.cco22 = context;
        this.cii2c2 = c32589c2oc2i;
        this.ciii2coi2 = interfaceC32600cioccoiococ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2oc2i(C32596cii2c2 c32596cii2c2) {
        this.cicic.execute(new RunnableC32593coo2iico(c32596cii2c2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void cioccoiococ(com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.C32596cii2c2 r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.C32591cco22.cioccoiococ(com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cii2c2):void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Context context;
        if (this.ciii2coi2 != null && (context = this.cco22) != null && this.cii2c2 != null) {
            if (!C32453ccoc2oic.c2oc2i(context)) {
                coo2iico(C32601coi222o222.c2oc2i);
                return;
            }
            String coo2iico = coo2iico(this.cii2c2.coi222o222());
            if (TextUtils.isEmpty(coo2iico)) {
                coo2iico(C32601coi222o222.c2oc2o);
                return;
            }
            this.cii2c2.coo2iico(coo2iico);
            if (this.cii2c2.coo2iico() <= 0) {
                coo2iico(C32601coi222o222.cioccoiococ, (C32596cii2c2) null);
                return;
            }
            C32596cii2c2 c32596cii2c2 = new C32596cii2c2(0, this.cii2c2.c2oc2i(), (this.cii2c2.coo2iico() / 1) * 0, this.cii2c2.coo2iico(), 0L);
            this.coiio2.add(c32596cii2c2);
            c2oc2i(c32596cii2c2);
            return;
        }
        coo2iico(C32601coi222o222.cco22);
    }

    private boolean coi222o222() {
        try {
            File file = new File(this.cii2c2.c2oc2o());
            File file2 = new File(this.cii2c2.cioccoiococ());
            if (file.exists()) {
                file.renameTo(file2);
                return true;
            }
            return false;
        } catch (Exception e) {
            MLog.m25888e("GMCDownloadThread", "rename temp file", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String coo2iico(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L74
            int r0 = r5.coiic
            r1 = 5
            if (r0 < r1) goto Ld
            goto L74
        Ld:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0 = 0
            r1.setInstanceFollowRedirects(r0)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            r1.connect()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            r1.getInputStream()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            int r0 = r1.getResponseCode()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            r2 = 301(0x12d, float:4.22E-43)
            if (r0 == r2) goto L43
            r2 = 302(0x12e, float:4.23E-43)
            if (r0 == r2) goto L43
            r2 = 303(0x12f, float:4.25E-43)
            if (r0 != r2) goto L34
            goto L43
        L34:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L68
            com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.c2oc2i r0 = r5.cii2c2     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            int r2 = r1.getContentLength()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            long r2 = (long) r2     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            r0.coo2iico(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            goto L68
        L43:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r1.getHeaderField(r0)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            int r2 = r5.coiic     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            int r2 = r2 + 1
            r5.coiic = r2     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            java.lang.String r6 = r5.coo2iico(r0)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L6c
            r1.disconnect()
            return r6
        L57:
            r0 = move-exception
            goto L5f
        L59:
            r6 = move-exception
            goto L6e
        L5b:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L5f:
            java.lang.String r2 = "GMCDownloadThread"
            java.lang.String r3 = "get final url had exception"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r3, r0)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6b
        L68:
            r1.disconnect()
        L6b:
            return r6
        L6c:
            r6 = move-exception
            r0 = r1
        L6e:
            if (r0 == 0) goto L73
            r0.disconnect()
        L73:
            throw r6
        L74:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.C32591cco22.coo2iico(java.lang.String):java.lang.String");
    }

    private boolean coi222o222(C32596cii2c2 c32596cii2c2) {
        if (c32596cii2c2 == null) {
            return false;
        }
        String coo2iico = coo2iico(c32596cii2c2);
        if (TextUtils.isEmpty(coo2iico)) {
            return false;
        }
        int intValue = this.cicc2iiccc.containsKey(coo2iico) ? this.cicc2iiccc.get(coo2iico).intValue() : 0;
        if (intValue >= this.ccoc2oic.length) {
            return false;
        }
        this.cicc2iiccc.put(coo2iico, Integer.valueOf(intValue + 1));
        if (intValue >= 0) {
            int[] iArr = this.ccoc2oic;
            if (intValue < iArr.length) {
                coo2iico(c32596cii2c2, iArr[intValue] * 1000);
                return true;
            }
        }
        return false;
    }

    private void coo2iico() {
        synchronized (this.coiio2) {
            for (C32596cii2c2 c32596cii2c2 : this.coiio2) {
                if (!c32596cii2c2.cco22()) {
                    return;
                }
            }
            if (!coi222o222()) {
                this.ciii2coi2.coo2iico(this.cii2c2.coi222o222(), C32601coi222o222.cii2c2);
                return;
            }
            InterfaceC32600cioccoiococ interfaceC32600cioccoiococ = this.ciii2coi2;
            if (interfaceC32600cioccoiococ != null) {
                interfaceC32600cioccoiococ.coo2iico(this.cii2c2.coi222o222(), this.cii2c2.cioccoiococ(), this.cii2c2.coo2iico());
                C32590c2oc2o.coo2iico(this.cii2c2);
            }
        }
    }

    private String coo2iico(C32596cii2c2 c32596cii2c2) {
        if (c32596cii2c2 != null) {
            return c32596cii2c2.c2oc2o() + "-" + c32596cii2c2.coi222o222();
        }
        return "";
    }

    private void coo2iico(C32596cii2c2 c32596cii2c2, int i) {
        GlobalHolder.getBackgroundHandler().postDelayed(new RunnableC32592coi222o222(c32596cii2c2), i);
    }

    private void coo2iico(C32601coi222o222 c32601coi222o222, C32596cii2c2 c32596cii2c2) {
        if (coi222o222(c32596cii2c2)) {
            return;
        }
        coo2iico(c32601coi222o222);
    }

    private void coo2iico(C32601coi222o222 c32601coi222o222) {
        InterfaceC32600cioccoiococ interfaceC32600cioccoiococ = this.ciii2coi2;
        if (interfaceC32600cioccoiococ != null) {
            interfaceC32600cioccoiococ.coo2iico(this.cii2c2.coi222o222(), c32601coi222o222);
        }
        C32590c2oc2o.coo2iico(this.cii2c2);
    }
}
