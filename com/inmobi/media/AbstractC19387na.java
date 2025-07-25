package com.inmobi.media;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.na */
/* loaded from: classes6.dex */
public abstract class AbstractC19387na extends C18938G8 {

    /* renamed from: A */
    public final Map f48546A;

    /* renamed from: B */
    public final AtomicBoolean f48547B;

    /* renamed from: y */
    public final int f48548y;

    /* renamed from: z */
    public final int f48549z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19387na(String url, C18969Ib c18969Ib, String str, int i, int i2) {
        super("POST", url, c18969Ib, C19017M3.m60917a(C19017M3.f47463a, false, 1, null), (InterfaceC18850A4) null, "application/x-www-form-urlencoded", 64);
        Intrinsics.checkNotNullParameter("POST", "requestType");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter("application/x-www-form-urlencoded", "requestContentType");
        this.f48548y = i;
        this.f48549z = i2;
        this.f48546A = null;
        this.f47279m = str;
        this.f48547B = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.C18938G8
    /* renamed from: f */
    public void mo59879f() {
        Set<Map.Entry> entrySet;
        super.mo59879f();
        Map map = this.f48546A;
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                if (!this.f47275i.containsKey(entry.getKey())) {
                    this.f47275i.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
