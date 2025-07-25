package com.bytedance.sdk.component.p256bg;

import com.bytedance.sdk.component.p256bg.C7597rri;
import com.bytedance.sdk.component.p256bg.C7599tC;
import com.bytedance.sdk.component.p256bg.InterfaceC7581VB;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.component.bg.LZ */
/* loaded from: classes3.dex */
public class C7577LZ {

    /* renamed from: IL */
    private final Set<String> f16510IL;

    /* renamed from: bX */
    private final C7597rri f16511bX = C7583VzQ.f16515bg;

    /* renamed from: bg */
    private final Set<String> f16512bg;
    private final C7599tC eqN;

    /* renamed from: zx */
    private InterfaceC7581VB.InterfaceC7582bg f16513zx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7577LZ(C7599tC c7599tC, Set<String> set, Set<String> set2) {
        this.eqN = c7599tC;
        if (set != null && !set.isEmpty()) {
            this.f16512bg = new LinkedHashSet(set);
        } else {
            this.f16512bg = new LinkedHashSet();
        }
        if (set2 != null && !set2.isEmpty()) {
            this.f16510IL = new LinkedHashSet(set2);
        } else {
            this.f16510IL = new LinkedHashSet();
        }
    }

    /* renamed from: IL */
    final synchronized kMt m88494IL(String str, AbstractC7573IL abstractC7573IL) {
        return m88490bg(str, abstractC7573IL, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000e, B:10:0x001a, B:12:0x001e, B:13:0x0024, B:15:0x002a, B:17:0x003a, B:19:0x004a, B:21:0x004e, B:23:0x0052, B:25:0x0058, B:29:0x0066, B:31:0x006a, B:32:0x006f), top: B:41:0x0001 }] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.bytedance.sdk.component.p256bg.kMt m88489bg(boolean r8, java.lang.String r9, com.bytedance.sdk.component.p256bg.AbstractC7573IL r10) throws com.bytedance.sdk.component.p256bg.C7599tC.C7600bg {
        /*
            r7 = this;
            monitor-enter(r7)
            android.net.Uri r0 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r0.getHost()     // Catch: java.lang.Throwable -> L79
            r2 = 0
            if (r1 != 0) goto Le
            monitor-exit(r7)
            return r2
        Le:
            java.util.Set<java.lang.String> r3 = r7.f16510IL     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r10.mo88421bg()     // Catch: java.lang.Throwable -> L79
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L1d
            com.bytedance.sdk.component.bg.kMt r3 = com.bytedance.sdk.component.p256bg.kMt.PUBLIC     // Catch: java.lang.Throwable -> L79
            goto L1e
        L1d:
            r3 = r2
        L1e:
            java.util.Set<java.lang.String> r4 = r7.f16512bg     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L79
        L24:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = r0.getHost()     // Catch: java.lang.Throwable -> L79
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L4a
            java.lang.String r6 = "."
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r6.concat(r5)     // Catch: java.lang.Throwable -> L79
            boolean r5 = r1.endsWith(r5)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L24
        L4a:
            com.bytedance.sdk.component.bg.kMt r3 = com.bytedance.sdk.component.p256bg.kMt.PRIVATE     // Catch: java.lang.Throwable -> L79
        L4c:
            if (r3 != 0) goto L68
            com.bytedance.sdk.component.bg.VB$bg r0 = r7.f16513zx     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L68
            boolean r0 = r0.m88485bg(r9)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L68
            com.bytedance.sdk.component.bg.VB$bg r0 = r7.f16513zx     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r10.mo88421bg()     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.m88484bg(r9, r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L66
            monitor-exit(r7)
            return r2
        L66:
            com.bytedance.sdk.component.bg.kMt r3 = com.bytedance.sdk.component.p256bg.kMt.PRIVATE     // Catch: java.lang.Throwable -> L79
        L68:
            if (r8 == 0) goto L6f
            com.bytedance.sdk.component.bg.kMt r8 = r7.m88491bg(r9, r10)     // Catch: java.lang.Throwable -> L79
            goto L73
        L6f:
            com.bytedance.sdk.component.bg.kMt r8 = r7.m88494IL(r9, r10)     // Catch: java.lang.Throwable -> L79
        L73:
            if (r8 == 0) goto L77
            monitor-exit(r7)
            return r8
        L77:
            monitor-exit(r7)
            return r3
        L79:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p256bg.C7577LZ.m88489bg(boolean, java.lang.String, com.bytedance.sdk.component.bg.IL):com.bytedance.sdk.component.bg.kMt");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void m88495IL(C7597rri.InterfaceC7598bg interfaceC7598bg) {
        if (this.f16511bX != null) {
            throw null;
        }
    }

    /* renamed from: bg */
    final synchronized kMt m88491bg(String str, AbstractC7573IL abstractC7573IL) throws C7599tC.C7600bg {
        return m88490bg(str, abstractC7573IL, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m88493bg(InterfaceC7581VB.InterfaceC7582bg interfaceC7582bg) {
        this.f16513zx = interfaceC7582bg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m88492bg(C7597rri.InterfaceC7598bg interfaceC7598bg) {
        if (this.f16511bX != null) {
            throw null;
        }
    }

    /* renamed from: bg */
    private kMt m88490bg(String str, AbstractC7573IL abstractC7573IL, boolean z) {
        if (!z || this.eqN == null) {
            return null;
        }
        throw null;
    }
}
