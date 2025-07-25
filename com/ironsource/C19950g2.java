package com.ironsource;

/* renamed from: com.ironsource.g2 */
/* loaded from: classes6.dex */
public class C19950g2 {

    /* renamed from: e */
    public static final int f50169e = -1;

    /* renamed from: a */
    private final EnumC19951a f50170a;

    /* renamed from: b */
    private final long f50171b;

    /* renamed from: c */
    private final long f50172c;

    /* renamed from: d */
    private final long f50173d;

    /* renamed from: com.ironsource.g2$a */
    /* loaded from: classes6.dex */
    public enum EnumC19951a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C19950g2(EnumC19951a enumC19951a, long j, long j2, long j3) {
        this.f50170a = enumC19951a;
        this.f50171b = j;
        this.f50172c = j2;
        this.f50173d = j3;
    }

    /* renamed from: a */
    public EnumC19951a m58480a() {
        return this.f50170a;
    }

    /* renamed from: b */
    public long m58479b() {
        return this.f50173d;
    }

    /* renamed from: c */
    public long m58478c() {
        return this.f50172c;
    }

    /* renamed from: d */
    public long m58477d() {
        return this.f50171b;
    }

    /* renamed from: e */
    public boolean m58476e() {
        EnumC19951a enumC19951a = this.f50170a;
        if (enumC19951a != EnumC19951a.AUTOMATIC_LOAD_AFTER_CLOSE && enumC19951a != EnumC19951a.AUTOMATIC_LOAD_WHILE_SHOW) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m58475f() {
        EnumC19951a enumC19951a = this.f50170a;
        if (enumC19951a != EnumC19951a.MANUAL && enumC19951a != EnumC19951a.MANUAL_WITH_AUTOMATIC_RELOAD && enumC19951a != EnumC19951a.MANUAL_WITH_LOAD_ON_SHOW) {
            return false;
        }
        return true;
    }
}
