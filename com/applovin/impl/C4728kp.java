package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.kp */
/* loaded from: classes2.dex */
final class C4728kp implements InterfaceC5019nl {

    /* renamed from: a */
    private final C4485gp f7563a;

    /* renamed from: b */
    private final long[] f7564b;

    /* renamed from: c */
    private final Map f7565c;

    /* renamed from: d */
    private final Map f7566d;

    /* renamed from: f */
    private final Map f7567f;

    public C4728kp(C4485gp c4485gp, Map map, Map map2, Map map3) {
        Map emptyMap;
        this.f7563a = c4485gp;
        this.f7566d = map2;
        this.f7567f = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f7565c = emptyMap;
        this.f7564b = c4485gp.m98877b();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        return this.f7564b[i];
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        return this.f7563a.m98886a(j, this.f7565c, this.f7566d, this.f7567f);
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return this.f7564b.length;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        int m93001a = AbstractC5863xp.m93001a(this.f7564b, j, false, false);
        if (m93001a < this.f7564b.length) {
            return m93001a;
        }
        return -1;
    }
}
