package com.mbridge.msdk.tracker.network;

/* compiled from: DefaultRetryPolicy.java */
/* renamed from: com.mbridge.msdk.tracker.network.e */
/* loaded from: classes6.dex */
public final class C22905e implements InterfaceC22941z {

    /* renamed from: a */
    private int f59742a;

    /* renamed from: b */
    private long f59743b;

    /* renamed from: c */
    private int f59744c;

    /* renamed from: d */
    private final int f59745d;

    public C22905e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22941z
    /* renamed from: a */
    public final int mo49367a() {
        return this.f59742a;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22941z
    /* renamed from: b */
    public final long mo49365b() {
        return this.f59743b;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22941z
    /* renamed from: c */
    public final int mo49364c() {
        return this.f59744c;
    }

    public C22905e(int i, int i2) {
        this(i, 60000L, i2);
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22941z
    /* renamed from: a */
    public final boolean mo49366a(AbstractC22898ad abstractC22898ad) {
        int i = this.f59744c + 1;
        this.f59744c = i;
        return i <= this.f59745d;
    }

    public C22905e(int i, long j, int i2) {
        this.f59743b = j;
        this.f59742a = i;
        this.f59745d = i2;
    }
}
