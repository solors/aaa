package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.sk */
/* loaded from: classes6.dex */
public class C20975sk {

    /* renamed from: a */
    private final C21205x1 f53480a;

    public C20975sk(C21205x1 c21205x1) {
        this.f53480a = c21205x1;
    }

    /* renamed from: a */
    public void m54947a() {
        this.f53480a.m54205a(EnumC21057u1.RELOAD_AD, new HashMap());
    }

    /* renamed from: b */
    public void m54938b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        this.f53480a.m54205a(EnumC21057u1.SKIP_RELOAD_AD, hashMap);
    }

    /* renamed from: c */
    public void m54935c(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        this.f53480a.m54205a(EnumC21057u1.RELOAD_AD_NO_FILL, hashMap);
    }

    /* renamed from: a */
    public void m54946a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.valueOf(i));
        this.f53480a.m54205a(EnumC21057u1.DESTROY_AD, hashMap);
    }

    /* renamed from: b */
    public void m54937b(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        this.f53480a.m54205a(EnumC21057u1.LOAD_AD_NO_FILL, hashMap);
    }

    /* renamed from: a */
    public void m54945a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.f53480a.m54205a(EnumC21057u1.RELOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: b */
    public void m54936b(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f53480a.m54205a(EnumC21057u1.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    /* renamed from: a */
    public void m54944a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        this.f53480a.m54205a(EnumC21057u1.LOAD_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m54943a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f53480a.m54205a(EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    /* renamed from: a */
    public void m54942a(long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f53480a.m54205a(EnumC21057u1.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public void m54941a(Boolean bool, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f53480a.m54205a(bool.booleanValue() ? EnumC21057u1.AD_READY_TRUE : EnumC21057u1.AD_READY_FALSE, hashMap);
    }

    /* renamed from: a */
    public void m54940a(boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f53480a.m54205a(EnumC21057u1.LOAD_AD, hashMap);
    }

    /* renamed from: a */
    public void m54939a(boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z2) {
            hashMap.put("errorCode", Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        this.f53480a.m54205a(z ? EnumC21057u1.AD_AVAILABILITY_CHANGED_TRUE : EnumC21057u1.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }
}
