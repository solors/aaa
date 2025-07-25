package com.p551my.target;

/* renamed from: com.my.target.b8 */
/* loaded from: classes7.dex */
public class C25659b8 extends C25689ca {

    /* renamed from: d */
    public float f66643d;

    /* renamed from: e */
    public float f66644e;

    public C25659b8(String str) {
        super("playheadReachedValue", str);
        this.f66643d = -1.0f;
        this.f66644e = -1.0f;
    }

    /* renamed from: a */
    public static C25659b8 m44159a(String str) {
        return new C25659b8(str);
    }

    /* renamed from: b */
    public void m44158b(float f) {
        this.f66643d = f;
    }

    /* renamed from: d */
    public float m44157d() {
        return this.f66644e;
    }

    /* renamed from: e */
    public float m44156e() {
        return this.f66643d;
    }

    public String toString() {
        return "ProgressStat{value=" + this.f66643d + ", pvalue=" + this.f66644e + '}';
    }

    /* renamed from: a */
    public void m44160a(float f) {
        this.f66644e = f;
    }
}
