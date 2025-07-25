package com.ironsource;

/* renamed from: com.ironsource.hf */
/* loaded from: classes6.dex */
public class C20047hf {

    /* renamed from: a */
    private int f50456a;

    /* renamed from: b */
    private int f50457b;

    /* renamed from: c */
    private String f50458c;

    public C20047hf() {
        this.f50456a = 0;
        this.f50457b = 0;
        this.f50458c = "";
    }

    /* renamed from: a */
    public int m58156a() {
        return this.f50457b;
    }

    /* renamed from: b */
    public String m58155b() {
        return this.f50458c;
    }

    /* renamed from: c */
    public int m58154c() {
        return this.f50456a;
    }

    /* renamed from: d */
    public boolean m58153d() {
        if (this.f50457b > 0 && this.f50456a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m58152e() {
        if (this.f50457b == 0 && this.f50456a == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f50458c;
    }

    public C20047hf(int i, int i2, String str) {
        this.f50456a = i;
        this.f50457b = i2;
        this.f50458c = str;
    }
}
