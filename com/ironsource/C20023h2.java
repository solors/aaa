package com.ironsource;

/* renamed from: com.ironsource.h2 */
/* loaded from: classes6.dex */
public class C20023h2 {

    /* renamed from: e */
    public static final int f50336e = -1;

    /* renamed from: a */
    private final EnumC20024a f50337a;

    /* renamed from: b */
    private final long f50338b;

    /* renamed from: c */
    private final long f50339c;

    /* renamed from: d */
    private final long f50340d;

    /* renamed from: com.ironsource.h2$a */
    /* loaded from: classes6.dex */
    public enum EnumC20024a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C20023h2(EnumC20024a enumC20024a, long j, long j2, long j3) {
        this.f50337a = enumC20024a;
        this.f50338b = j;
        this.f50339c = j2;
        this.f50340d = j3;
    }

    /* renamed from: a */
    public EnumC20024a m58310a() {
        return this.f50337a;
    }

    /* renamed from: b */
    public long m58309b() {
        return this.f50340d;
    }

    /* renamed from: c */
    public long m58308c() {
        return this.f50339c;
    }

    /* renamed from: d */
    public long m58307d() {
        return this.f50338b;
    }

    /* renamed from: e */
    public boolean m58306e() {
        EnumC20024a enumC20024a = this.f50337a;
        if (enumC20024a != EnumC20024a.AUTOMATIC_LOAD_AFTER_CLOSE && enumC20024a != EnumC20024a.AUTOMATIC_LOAD_WHILE_SHOW) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m58305f() {
        EnumC20024a enumC20024a = this.f50337a;
        if (enumC20024a != EnumC20024a.MANUAL && enumC20024a != EnumC20024a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            return false;
        }
        return true;
    }
}
