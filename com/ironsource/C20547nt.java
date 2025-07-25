package com.ironsource;

/* renamed from: com.ironsource.nt */
/* loaded from: classes6.dex */
public class C20547nt {

    /* renamed from: a */
    protected long f52249a;

    /* renamed from: b */
    protected long f52250b;

    /* renamed from: c */
    protected long f52251c;

    /* renamed from: a */
    public long m56089a() {
        return Math.max(0L, this.f52249a - System.currentTimeMillis());
    }

    /* renamed from: b */
    public void m56087b() {
        this.f52249a = 0L;
        this.f52250b = 0L;
        this.f52251c = 0L;
    }

    /* renamed from: c */
    public void m56085c(long j) {
        this.f52250b = j;
        this.f52251c = 0L;
    }

    /* renamed from: a */
    public void m56088a(long j) {
        this.f52249a = System.currentTimeMillis() + j;
    }

    /* renamed from: b */
    public void m56086b(long j) {
        this.f52251c = j;
        this.f52249a += j - this.f52250b;
    }
}
