package com.ironsource;

import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.ug */
/* loaded from: classes6.dex */
public class C21078ug {

    /* renamed from: a */
    private final C21205x1 f53788a;

    public C21078ug(C21205x1 c21205x1) {
        this.f53788a = c21205x1;
    }

    /* renamed from: a */
    public void m54650a() {
        this.f53788a.m54205a(EnumC21057u1.INIT_SUCCESS, null);
    }

    /* renamed from: a */
    public void m54649a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f53788a.m54205a(EnumC21057u1.INIT_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m54648a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.f53788a.m54205a(EnumC21057u1.INIT_ENDED, hashMap);
    }

    /* renamed from: a */
    public void m54647a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + SignedToken.f2767c + str2);
        this.f53788a.m54205a(EnumC21057u1.INIT_STARTED, hashMap);
    }
}
