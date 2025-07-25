package pa;

import kotlin.Metadata;

@Metadata
/* renamed from: pa.a */
/* loaded from: classes8.dex */
public final class RenderMetrics {

    /* renamed from: a */
    private long f103176a;

    /* renamed from: b */
    private long f103177b;

    /* renamed from: c */
    private long f103178c;

    /* renamed from: d */
    private long f103179d;

    /* renamed from: e */
    private long f103180e;

    /* renamed from: a */
    public final void m13212a(long j) {
        this.f103180e += j;
    }

    /* renamed from: b */
    public final void m13211b(long j) {
        this.f103179d += j;
    }

    /* renamed from: c */
    public final void m13210c(long j) {
        this.f103178c += j;
    }

    /* renamed from: d */
    public final void m13209d(long j) {
        this.f103176a = j;
    }

    /* renamed from: e */
    public final long m13208e() {
        return this.f103180e;
    }

    /* renamed from: f */
    public final long m13207f() {
        return this.f103179d;
    }

    /* renamed from: g */
    public final long m13206g() {
        return this.f103178c;
    }

    /* renamed from: h */
    public final long m13205h() {
        return Math.max(this.f103176a, this.f103177b) + this.f103178c + this.f103179d + this.f103180e;
    }

    /* renamed from: i */
    public final void m13204i(long j) {
        this.f103177b = j;
    }

    /* renamed from: j */
    public final void m13203j() {
        this.f103178c = 0L;
        this.f103179d = 0L;
        this.f103180e = 0L;
        this.f103176a = 0L;
        this.f103177b = 0L;
    }
}
