package com.ironsource;

/* renamed from: com.ironsource.rf */
/* loaded from: classes6.dex */
public class C20757rf {

    /* renamed from: c */
    public static final int f52755c = 1001;

    /* renamed from: a */
    private String f52756a;

    /* renamed from: b */
    private int f52757b;

    public C20757rf(int i, String str) {
        this.f52757b = i;
        this.f52756a = str == null ? "" : str;
    }

    /* renamed from: a */
    public int m55492a() {
        return this.f52757b;
    }

    /* renamed from: b */
    public String m55491b() {
        return this.f52756a;
    }

    public String toString() {
        return "error - code:" + this.f52757b + ", message:" + this.f52756a;
    }
}
