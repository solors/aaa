package com.inmobi.media;

import io.bidmachine.unified.UnifiedMediationParams;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qb */
/* loaded from: classes6.dex */
public final class C19430qb {

    /* renamed from: a */
    public final C19531y0 f48601a;

    /* renamed from: b */
    public final String f48602b;

    /* renamed from: c */
    public final String f48603c;

    /* renamed from: d */
    public final String f48604d;

    /* renamed from: e */
    public String f48605e;

    public C19430qb(C19531y0 c19531y0, String str, String str2, String markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.f48601a = c19531y0;
        this.f48602b = str;
        this.f48603c = str2;
        this.f48604d = markupType;
    }

    /* renamed from: a */
    public final LinkedHashMap m59929a() {
        Boolean bool;
        String m61002m;
        String mo59644q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C19531y0 c19531y0 = this.f48601a;
        if (c19531y0 != null && (mo59644q = c19531y0.f48911a.mo59644q()) != null) {
            linkedHashMap.put("adType", mo59644q);
        }
        C19531y0 c19531y02 = this.f48601a;
        if (c19531y02 != null) {
            linkedHashMap.put("plId", Long.valueOf(c19531y02.f48911a.m59810I().m61003l()));
        }
        C19531y0 c19531y03 = this.f48601a;
        if (c19531y03 != null && (m61002m = c19531y03.f48911a.m59810I().m61002m()) != null) {
            linkedHashMap.put("plType", m61002m);
        }
        C19531y0 c19531y04 = this.f48601a;
        String str = null;
        if (c19531y04 != null) {
            C19223c0 m59628y = c19531y04.f48911a.m59628y();
            if (m59628y != null) {
                bool = m59628y.m60406o();
            } else {
                bool = null;
            }
            if (bool != null) {
                linkedHashMap.put("isRewarded", bool);
            }
        }
        String str2 = this.f48603c;
        if (str2 != null) {
            linkedHashMap.put(UnifiedMediationParams.KEY_CREATIVE_ID, str2);
        }
        String str3 = this.f48602b;
        if (str3 != null) {
            linkedHashMap.put("creativeType", str3);
        }
        linkedHashMap.put("markupType", this.f48604d);
        String str4 = this.f48605e;
        if (str4 != null) {
            str = str4;
        } else {
            Intrinsics.m17056y("triggerSource");
        }
        linkedHashMap.put("trigger", str);
        C19531y0 c19531y05 = this.f48601a;
        if (c19531y05 != null && c19531y05.m59563a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f48601a.m59563a());
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final void m59928b() {
        C19444rb c19444rb;
        AtomicBoolean atomicBoolean;
        C19531y0 c19531y0 = this.f48601a;
        if (c19531y0 != null && (c19444rb = c19531y0.f48912b) != null && (atomicBoolean = c19444rb.f48631a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        m59929a().put("networkType", C19212b3.m60446q());
        m59929a().put("errorCode", (short) 2180);
        LinkedHashMap m59929a = m59929a();
        C19262eb c19262eb = C19262eb.f48183a;
        C19262eb.m60370b("AdImpressionSuccessful", m59929a, EnumC19332jb.f48415a);
    }

    /* renamed from: c */
    public final void m59927c() {
        C19444rb c19444rb;
        AtomicBoolean atomicBoolean;
        C19531y0 c19531y0 = this.f48601a;
        if (c19531y0 != null && (c19444rb = c19531y0.f48912b) != null && (atomicBoolean = c19444rb.f48631a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        m59929a().put("networkType", C19212b3.m60446q());
        m59929a().put("errorCode", (short) 2177);
        LinkedHashMap m59929a = m59929a();
        C19262eb c19262eb = C19262eb.f48183a;
        C19262eb.m60370b("AdImpressionSuccessful", m59929a, EnumC19332jb.f48415a);
    }

    /* renamed from: d */
    public final void m59926d() {
        C19444rb c19444rb;
        AtomicBoolean atomicBoolean;
        C19531y0 c19531y0 = this.f48601a;
        if (c19531y0 != null && (c19444rb = c19531y0.f48912b) != null && (atomicBoolean = c19444rb.f48631a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        m59929a().put("networkType", C19212b3.m60446q());
        m59929a().put("errorCode", (short) 0);
        LinkedHashMap m59929a = m59929a();
        C19262eb c19262eb = C19262eb.f48183a;
        C19262eb.m60370b("AdImpressionSuccessful", m59929a, EnumC19332jb.f48415a);
    }
}
