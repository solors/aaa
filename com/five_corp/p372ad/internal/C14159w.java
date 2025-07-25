package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.BuildConfig;
import com.five_corp.p372ad.internal.util.C14119g;
import java.io.File;

/* renamed from: com.five_corp.ad.internal.w */
/* loaded from: classes4.dex */
public final class C14159w implements InterfaceC14112u {

    /* renamed from: a */
    public final File f26829a;

    public C14159w(File file) {
        this.f26829a = new File(file, BuildConfig.LIBRARY_PACKAGE_NAME);
    }

    /* renamed from: a */
    public final void m78048a(String str) {
        m78044c(str + "_SUCCESS").delete();
        m78044c(str).delete();
    }

    /* renamed from: b */
    public final boolean m78046b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_SUCCESS");
        return m78044c(sb2.toString()).exists() && m78044c(str).exists();
    }

    /* renamed from: c */
    public final File m78044c(String str) {
        return new File(this.f26829a, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.five_corp.p372ad.internal.util.C14118f m78043d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            boolean r2 = r5.m78046b(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            if (r2 != 0) goto L12
            r5.m78048a(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            com.five_corp.ad.internal.t r6 = com.five_corp.p372ad.internal.EnumC14106t.f26690w     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            com.five_corp.ad.internal.util.f r6 = com.five_corp.p372ad.internal.util.C14118f.m78086a(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            return r6
        L12:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            java.io.File r6 = r5.m78044c(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            java.nio.channels.FileChannel r6 = r2.getChannel()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            long r3 = r6.size()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r6 = (int) r3     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.read(r6)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            com.five_corp.ad.internal.util.f r3 = new com.five_corp.ad.internal.util.f     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r4 = 1
            r3.<init>(r4, r1, r6)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.close()     // Catch: java.io.IOException -> L33
            return r3
        L33:
            r6 = move-exception
            android.util.Log.getStackTraceString(r6)
            com.five_corp.ad.internal.s r2 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r3 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r2.<init>(r3, r1, r6, r1)
            com.five_corp.ad.internal.util.f r6 = new com.five_corp.ad.internal.util.f
            r6.<init>(r0, r2, r1)
            return r6
        L44:
            r6 = move-exception
            goto L73
        L46:
            r6 = move-exception
            goto L4d
        L48:
            r6 = move-exception
            r2 = r1
            goto L73
        L4b:
            r6 = move-exception
            r2 = r1
        L4d:
            android.util.Log.getStackTraceString(r6)     // Catch: java.lang.Throwable -> L44
            com.five_corp.ad.internal.s r3 = new com.five_corp.ad.internal.s     // Catch: java.lang.Throwable -> L44
            com.five_corp.ad.internal.t r4 = com.five_corp.p372ad.internal.EnumC14106t.f26690w     // Catch: java.lang.Throwable -> L44
            r3.<init>(r4, r1, r6, r1)     // Catch: java.lang.Throwable -> L44
            com.five_corp.ad.internal.util.f r6 = new com.five_corp.ad.internal.util.f     // Catch: java.lang.Throwable -> L44
            r6.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L72
            r2.close()     // Catch: java.io.IOException -> L62
            goto L72
        L62:
            r6 = move-exception
            android.util.Log.getStackTraceString(r6)
            com.five_corp.ad.internal.s r2 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r3 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r2.<init>(r3, r1, r6, r1)
            com.five_corp.ad.internal.util.f r6 = new com.five_corp.ad.internal.util.f
            r6.<init>(r0, r2, r1)
        L72:
            return r6
        L73:
            if (r2 == 0) goto L8a
            r2.close()     // Catch: java.io.IOException -> L79
            goto L8a
        L79:
            r6 = move-exception
            android.util.Log.getStackTraceString(r6)
            com.five_corp.ad.internal.s r2 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r3 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r2.<init>(r3, r1, r6, r1)
            com.five_corp.ad.internal.util.f r6 = new com.five_corp.ad.internal.util.f
            r6.<init>(r0, r2, r1)
            return r6
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.C14159w.m78043d(java.lang.String):com.five_corp.ad.internal.util.f");
    }

    /* renamed from: a */
    public static String m78049a(long j) {
        return "adcfg-" + Long.toString(j) + ".json";
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.five_corp.p372ad.internal.util.C14119g m78045b(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.io.File r5 = r4.m78044c(r5)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            r2.write(r6)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r6 = 1
            boolean r5 = r5.setReadable(r6, r0)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            if (r5 != 0) goto L30
            com.five_corp.ad.internal.t r5 = com.five_corp.p372ad.internal.EnumC14106t.f26690w     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            com.five_corp.ad.internal.util.g r5 = com.five_corp.p372ad.internal.util.C14119g.m78085b(r5)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.close()     // Catch: java.io.IOException -> L1f
            return r5
        L1f:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
            com.five_corp.ad.internal.s r6 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r2 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r6.<init>(r2, r1, r5, r1)
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g
            r5.<init>(r0, r6)
            return r5
        L30:
            r2.flush()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.FileDescriptor r5 = r2.getFD()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r5.sync()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.close()     // Catch: java.io.IOException -> L43
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g
            r5.<init>(r6, r1)
            return r5
        L43:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
            com.five_corp.ad.internal.s r6 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r2 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r6.<init>(r2, r1, r5, r1)
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g
            r5.<init>(r0, r6)
            return r5
        L54:
            r5 = move-exception
            goto L83
        L56:
            r5 = move-exception
            goto L5d
        L58:
            r5 = move-exception
            r2 = r1
            goto L83
        L5b:
            r5 = move-exception
            r2 = r1
        L5d:
            android.util.Log.getStackTraceString(r5)     // Catch: java.lang.Throwable -> L54
            com.five_corp.ad.internal.s r6 = new com.five_corp.ad.internal.s     // Catch: java.lang.Throwable -> L54
            com.five_corp.ad.internal.t r3 = com.five_corp.p372ad.internal.EnumC14106t.f26690w     // Catch: java.lang.Throwable -> L54
            r6.<init>(r3, r1, r5, r1)     // Catch: java.lang.Throwable -> L54
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g     // Catch: java.lang.Throwable -> L54
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L72
            goto L82
        L72:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
            com.five_corp.ad.internal.s r6 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r2 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r6.<init>(r2, r1, r5, r1)
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g
            r5.<init>(r0, r6)
        L82:
            return r5
        L83:
            if (r2 == 0) goto L9a
            r2.close()     // Catch: java.io.IOException -> L89
            goto L9a
        L89:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
            com.five_corp.ad.internal.s r6 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r2 = com.five_corp.p372ad.internal.EnumC14106t.f26690w
            r6.<init>(r2, r1, r5, r1)
            com.five_corp.ad.internal.util.g r5 = new com.five_corp.ad.internal.util.g
            r5.<init>(r0, r6)
            return r5
        L9a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.C14159w.m78045b(java.lang.String, byte[]):com.five_corp.ad.internal.util.g");
    }

    /* renamed from: a */
    public final C14119g m78050a() {
        File file = this.f26829a;
        return (file.exists() || (file.mkdirs() && file.setReadable(true, false) && file.setWritable(true, false) && file.setExecutable(true, false))) ? new C14119g(true, null) : C14119g.m78085b(EnumC14106t.f26690w);
    }

    /* renamed from: a */
    public final C14119g m78047a(String str, byte[] bArr) {
        C14119g m78045b = m78045b(str, bArr);
        if (!m78045b.f26746a) {
            m78048a(str);
            return m78045b;
        }
        C14119g m78045b2 = m78045b(str + "_SUCCESS", new byte[0]);
        if (!m78045b2.f26746a) {
            m78048a(str);
            return m78045b2;
        }
        return new C14119g(true, null);
    }
}
