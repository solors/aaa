package com.mbridge.msdk.foundation.p431c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.foundation.c.b */
/* loaded from: classes6.dex */
public final class MBFailureReason implements Serializable {

    /* renamed from: a */
    private int f56072a;

    /* renamed from: b */
    private int f56073b;

    /* renamed from: c */
    private String f56074c;

    /* renamed from: d */
    private Throwable f56075d;

    /* renamed from: e */
    private CampaignEx f56076e;

    /* renamed from: f */
    private MBridgeIds f56077f;

    /* renamed from: g */
    private String f56078g;

    /* renamed from: h */
    private String f56079h;

    /* renamed from: i */
    private boolean f56080i;

    /* renamed from: j */
    private int f56081j = -1;

    /* renamed from: k */
    private String f56082k;

    /* renamed from: l */
    private HashMap<Object, Object> f56083l;

    /* renamed from: m */
    private int f56084m;

    /* renamed from: n */
    private String f56085n;

    /* renamed from: o */
    private String f56086o;

    /* renamed from: p */
    private String f56087p;

    /* renamed from: q */
    private boolean f56088q;

    public MBFailureReason(int i) {
        this.f56072a = i;
        this.f56073b = FailureInfo.m52834b(i);
    }

    /* renamed from: a */
    public final int m52832a() {
        return this.f56072a;
    }

    /* renamed from: b */
    public final String m52823b() {
        int i;
        String str = !TextUtils.isEmpty(this.f56074c) ? this.f56074c : "";
        if (TextUtils.isEmpty(str) && (i = this.f56072a) != -1) {
            str = FailureInfo.m52837a(i);
        }
        Throwable th = this.f56075d;
        if (th != null) {
            String message = th.getMessage();
            if (TextUtils.isEmpty(message)) {
                return str;
            }
            return str + " # " + message;
        }
        return str;
    }

    /* renamed from: c */
    public final CampaignEx m52820c() {
        return this.f56076e;
    }

    /* renamed from: d */
    public final MBridgeIds m52818d() {
        if (this.f56077f == null) {
            this.f56077f = new MBridgeIds();
        }
        return this.f56077f;
    }

    /* renamed from: e */
    public final int m52816e() {
        return this.f56073b;
    }

    /* renamed from: f */
    public final String m52814f() {
        return this.f56079h;
    }

    /* renamed from: g */
    public final int m52812g() {
        return this.f56081j;
    }

    /* renamed from: h */
    public final String m52811h() {
        return this.f56082k;
    }

    /* renamed from: i */
    public final int m52810i() {
        return this.f56084m;
    }

    /* renamed from: j */
    public final String m52809j() {
        return this.f56085n;
    }

    /* renamed from: k */
    public final String m52808k() {
        return this.f56086o;
    }

    /* renamed from: l */
    public final String m52807l() {
        return this.f56087p;
    }

    /* renamed from: m */
    public final boolean m52806m() {
        return this.f56088q;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f56072a + ", errorSubType=" + this.f56073b + ", message='" + this.f56074c + "', cause=" + this.f56075d + ", campaign=" + this.f56076e + ", ids=" + this.f56077f + ", requestId='" + this.f56078g + "', localRequestId='" + this.f56079h + "', isHeaderBidding=" + this.f56080i + ", typeD=" + this.f56081j + ", reasonD='" + this.f56082k + "', extraMap=" + this.f56083l + ", serverErrorCode=" + this.f56084m + ", errorUrl='" + this.f56085n + "', serverErrorResponse='" + this.f56086o + "'}";
    }

    /* renamed from: a */
    public final void m52826a(String str) {
        this.f56074c = str;
    }

    /* renamed from: c */
    public final void m52819c(String str) {
        this.f56082k = str;
    }

    /* renamed from: e */
    public final void m52815e(String str) {
        this.f56086o = str;
    }

    /* renamed from: f */
    public final void m52813f(String str) {
        this.f56087p = str;
    }

    /* renamed from: a */
    public final void m52825a(Throwable th) {
        this.f56075d = th;
    }

    /* renamed from: a */
    public final void m52830a(CampaignEx campaignEx) {
        this.f56076e = campaignEx;
    }

    /* renamed from: d */
    public final void m52817d(String str) {
        this.f56085n = str;
    }

    public MBFailureReason(int i, String str) {
        this.f56072a = i;
        if (!TextUtils.isEmpty(str)) {
            m52827a("his_reason", str);
        }
        this.f56074c = str;
        this.f56073b = FailureInfo.m52834b(i);
    }

    /* renamed from: a */
    public final void m52829a(MBridgeIds mBridgeIds) {
        this.f56077f = mBridgeIds;
    }

    /* renamed from: a */
    public final void m52824a(boolean z) {
        this.f56080i = z;
    }

    /* renamed from: a */
    public final void m52827a(Object obj, Object obj2) {
        if (this.f56083l == null) {
            this.f56083l = new HashMap<>();
        }
        this.f56083l.put(obj, obj2);
    }

    /* renamed from: a */
    public final Object m52828a(Object obj) {
        HashMap<Object, Object> hashMap = this.f56083l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f56083l.get(obj);
        }
        return null;
    }

    /* renamed from: b */
    public final void m52822b(String str) {
        this.f56079h = str;
    }

    /* renamed from: b */
    public final void m52821b(boolean z) {
        this.f56088q = z;
    }

    public MBFailureReason(int i, int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            m52827a("his_reason", str);
            this.f56074c = str;
        } else {
            this.f56074c = FailureInfo.m52837a(i2);
        }
        this.f56084m = i;
        this.f56073b = FailureInfo.m52834b(i2);
    }

    /* renamed from: a */
    public final void m52831a(int i) {
        this.f56081j = i;
    }
}
