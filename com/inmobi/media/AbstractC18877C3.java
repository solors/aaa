package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.C3 */
/* loaded from: classes6.dex */
public abstract class AbstractC18877C3 {

    /* renamed from: a */
    public static final InterfaceC38501j f47129a;

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C18863B3.f47109a);
        f47129a = m14554a;
    }

    /* renamed from: a */
    public static final void m61241a(C18938G8 mRequest, int i, C19548z3 eventPayload, String str, int i2, long j, C18969Ib c18969Ib, C18849A3 listener, boolean z) {
        Intrinsics.checkNotNullParameter(mRequest, "$request");
        Intrinsics.checkNotNullParameter(eventPayload, "$eventPayload");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(mRequest, "mRequest");
        C18952H8 m61108b = mRequest.m61108b();
        if (m61108b.m61087b()) {
            if (i > 1) {
                Intrinsics.checkNotNullExpressionValue("C3", "TAG");
                m61108b.m61088a();
                m61240a(eventPayload, str, i2, i - 1, j, c18969Ib, listener, z);
                return;
            }
            listener.m61273a(eventPayload, true);
            return;
        }
        listener.getClass();
        Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
        String TAG = listener.f47084d;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        listener.f47081a.m59559a(eventPayload.f48954a);
        listener.f47081a.m59560a(System.currentTimeMillis());
        if (listener.f47083c != null) {
            List eventIds = eventPayload.f48954a;
            Intrinsics.checkNotNullParameter(eventIds, "eventIds");
            Integer num = AbstractC19346kb.f48454c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                AbstractC19346kb.f48453b = 0;
                C19508w5 c19508w5 = AbstractC19346kb.f48452a;
                if (c19508w5 != null) {
                    c19508w5.m59620a("count", 0);
                }
                AbstractC19346kb.f48454c = null;
            }
        }
        listener.f47085e.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        r4 = kotlin.collections.C37559r0.m17282l(p804nd.C38513v.m14532a("X-im-retry-count", java.lang.String.valueOf(r0)));
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m61240a(final com.inmobi.media.C19548z3 r15, final java.lang.String r16, final int r17, final int r18, final long r19, final com.inmobi.media.C18969Ib r21, final com.inmobi.media.C18849A3 r22, final boolean r23) {
        /*
            r3 = r15
            r5 = r17
            r2 = r18
            java.lang.String r0 = "C3"
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.inmobi.media.w3 r4 = com.inmobi.media.AbstractC18994K8.m60980a()
            r6 = 0
            if (r4 != 0) goto La9
            boolean r4 = com.inmobi.media.C18954Ha.m61059m()
            if (r4 != 0) goto L1b
            goto La9
        L1b:
            com.inmobi.media.G8 r1 = new com.inmobi.media.G8
            java.lang.String r8 = "POST"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 104(0x68, float:1.46E-43)
            r7 = r1
            r9 = r16
            r10 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r3.f48955b
            java.lang.String r4 = "payload"
            kotlin.Pair r0 = p804nd.C38513v.m14532a(r4, r0)
            r4 = 1
            kotlin.Pair[] r7 = new kotlin.Tuples[r4]
            r7[r6] = r0
            java.util.HashMap r0 = kotlin.collections.C37554o0.m17364l(r7)
            if (r0 == 0) goto L46
            java.util.HashMap r7 = r1.f47277k
            if (r7 == 0) goto L46
            r7.putAll(r0)
        L46:
            int r0 = r5 - r2
            if (r0 <= 0) goto L63
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "X-im-retry-count"
            kotlin.Pair r7 = p804nd.C38513v.m14532a(r8, r7)
            kotlin.Pair[] r4 = new kotlin.Tuples[r4]
            r4[r6] = r7
            java.util.HashMap r4 = kotlin.collections.C37554o0.m17364l(r4)
            if (r4 == 0) goto L63
            java.util.HashMap r7 = r1.f47275i
            r7.putAll(r4)
        L63:
            r1.f47290x = r6
            r1.f47286t = r6
            r1.f47287u = r6
            if (r23 == 0) goto L78
            if (r2 == r5) goto L7d
            double r6 = (double) r0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r8, r6)
            long r6 = (long) r6
            long r6 = r6 * r19
            goto L7f
        L78:
            if (r2 == r5) goto L7d
            r11 = r19
            goto L80
        L7d:
            r6 = 0
        L7f:
            r11 = r6
        L80:
            nd.j r0 = com.inmobi.media.AbstractC18877C3.f47129a
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r13 = r0
            java.util.concurrent.ScheduledExecutorService r13 = (java.util.concurrent.ScheduledExecutorService) r13
            o3.k r14 = new o3.k
            r0 = r14
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r0.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r13.schedule(r14, r11, r0)
            return
        La9:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r22
            r0.m61273a(r15, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC18877C3.m61240a(com.inmobi.media.z3, java.lang.String, int, int, long, com.inmobi.media.Ib, com.inmobi.media.A3, boolean):void");
    }
}
