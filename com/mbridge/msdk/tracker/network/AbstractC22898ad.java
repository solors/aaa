package com.mbridge.msdk.tracker.network;

/* compiled from: VolleyError.java */
/* renamed from: com.mbridge.msdk.tracker.network.ad */
/* loaded from: classes6.dex */
public abstract class AbstractC22898ad extends Exception {

    /* renamed from: a */
    public final C22913r f59723a;

    /* renamed from: b */
    private long f59724b;

    /* renamed from: c */
    private int f59725c;

    /* renamed from: d */
    private String f59726d;

    public AbstractC22898ad() {
        this.f59725c = 0;
        this.f59726d = "";
        this.f59723a = null;
    }

    /* renamed from: a */
    public abstract int mo49368a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m49521a(long j) {
        this.f59724b = j;
    }

    /* renamed from: b */
    public final int m49519b() {
        return this.f59725c;
    }

    /* renamed from: c */
    public final String m49518c() {
        return this.f59726d;
    }

    /* renamed from: a */
    public final void m49522a(int i) {
        this.f59725c = i;
    }

    /* renamed from: a */
    public final void m49520a(String str) {
        this.f59726d = str;
    }

    public AbstractC22898ad(C22913r c22913r) {
        this.f59725c = 0;
        this.f59726d = "";
        this.f59723a = c22913r;
    }

    public AbstractC22898ad(String str) {
        super(str);
        this.f59725c = 0;
        this.f59726d = "";
        this.f59723a = null;
    }

    public AbstractC22898ad(Throwable th) {
        super(th);
        this.f59725c = 0;
        this.f59726d = "";
        this.f59723a = null;
    }
}
