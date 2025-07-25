package com.inmobi.media;

import java.util.LinkedList;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y0 */
/* loaded from: classes6.dex */
public final class C19531y0 {

    /* renamed from: a */
    public final AbstractC19503w0 f48911a;

    /* renamed from: b */
    public final C19444rb f48912b;

    /* renamed from: c */
    public long f48913c;

    /* renamed from: d */
    public long f48914d;

    /* renamed from: e */
    public long f48915e;

    /* renamed from: f */
    public long f48916f;

    /* renamed from: g */
    public long f48917g;

    /* renamed from: h */
    public long f48918h;

    /* renamed from: i */
    public long f48919i;

    /* renamed from: j */
    public final C19517x0 f48920j;

    public C19531y0(AbstractC19503w0 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f48911a = adUnit;
        this.f48912b = new C19444rb();
        this.f48920j = new C19517x0(this);
    }

    /* renamed from: a */
    public final String m59563a() {
        C19223c0 m59628y;
        LinkedList<C19292h> m60415f;
        Object m17529r0;
        String m60284w;
        AbstractC19503w0 abstractC19503w0 = this.f48911a;
        if (abstractC19503w0 != null && (m59628y = abstractC19503w0.m59628y()) != null && (m60415f = m59628y.m60415f()) != null) {
            m17529r0 = _Collections.m17529r0(m60415f);
            C19292h c19292h = (C19292h) m17529r0;
            if (c19292h != null && (m60284w = c19292h.m60284w()) != null) {
                return m60284w;
            }
        }
        return "";
    }
}
