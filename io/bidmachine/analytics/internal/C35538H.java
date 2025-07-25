package io.bidmachine.analytics.internal;

/* renamed from: io.bidmachine.analytics.internal.H */
/* loaded from: classes9.dex */
public final class C35538H {

    /* renamed from: a */
    private final int f96311a;

    /* renamed from: b */
    private final StringBuffer f96312b;

    /* renamed from: c */
    private Long f96313c;

    public C35538H(int i, int i2) {
        this.f96311a = i2;
        this.f96312b = new StringBuffer(i);
    }

    /* renamed from: a */
    public final void m20385a(String str) {
        if (this.f96312b.length() + str.length() < this.f96311a) {
            this.f96312b.append((CharSequence) str).append('\n');
            this.f96313c = Long.valueOf(System.currentTimeMillis());
        }
    }

    public String toString() {
        return this.f96312b.toString();
    }

    /* renamed from: a */
    public final Long m20386a() {
        return this.f96313c;
    }
}
