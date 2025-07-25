package com.mbridge.msdk.tracker;

import com.p552ot.pubsub.util.C26601v;
import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Event.java */
/* renamed from: com.mbridge.msdk.tracker.e */
/* loaded from: classes6.dex */
public final class C22885e implements Serializable {

    /* renamed from: a */
    private String f59656a;

    /* renamed from: d */
    private JSONObject f59659d;

    /* renamed from: i */
    private EventPropertyDecorate f59664i;

    /* renamed from: b */
    private int f59657b = 0;

    /* renamed from: c */
    private int f59658c = 0;

    /* renamed from: g */
    private long f59662g = 0;

    /* renamed from: h */
    private long f59663h = C26601v.f69834a;

    /* renamed from: j */
    private boolean f59665j = false;

    /* renamed from: k */
    private boolean f59666k = false;

    /* renamed from: f */
    private long f59661f = System.currentTimeMillis();

    /* renamed from: e */
    private String f59660e = UUID.randomUUID().toString();

    public C22885e(String str) {
        this.f59656a = str;
    }

    /* renamed from: a */
    public final String m49606a() {
        return this.f59656a;
    }

    /* renamed from: b */
    public final int m49599b() {
        return this.f59657b;
    }

    /* renamed from: c */
    public final int m49596c() {
        return this.f59658c;
    }

    /* renamed from: d */
    public final JSONObject m49594d() {
        JSONObject jSONObject = this.f59659d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f59659d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final String m49593e() {
        return this.f59660e;
    }

    /* renamed from: f */
    public final long m49592f() {
        return this.f59661f;
    }

    /* renamed from: g */
    public final long m49591g() {
        return this.f59662g;
    }

    /* renamed from: h */
    public final long m49590h() {
        return this.f59663h;
    }

    /* renamed from: i */
    public final EventPropertyDecorate m49589i() {
        return this.f59664i;
    }

    /* renamed from: j */
    public final boolean m49588j() {
        return this.f59665j;
    }

    /* renamed from: k */
    public final boolean m49587k() {
        return this.f59666k;
    }

    /* renamed from: a */
    public final void m49605a(int i) {
        this.f59657b = i;
    }

    /* renamed from: b */
    public final void m49598b(int i) {
        this.f59658c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m49595c(long j) {
        this.f59663h = j;
    }

    /* renamed from: a */
    public final void m49601a(JSONObject jSONObject) {
        this.f59659d = jSONObject;
    }

    /* renamed from: b */
    public final void m49597b(long j) {
        this.f59662g = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m49602a(String str) {
        this.f59660e = str;
    }

    /* renamed from: a */
    public final void m49604a(long j) {
        this.f59661f = j;
    }

    /* renamed from: a */
    public final void m49603a(EventPropertyDecorate eventPropertyDecorate) {
        this.f59664i = eventPropertyDecorate;
    }

    /* renamed from: a */
    public final void m49600a(boolean z) {
        this.f59666k = z;
    }
}
