package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public class yc2 extends Exception {

    /* renamed from: b */
    public final c91 f88158b;

    public yc2() {
        this.f88158b = null;
    }

    public yc2(c91 c91Var) {
        this.f88158b = c91Var;
    }

    public yc2(Exception exc) {
        super("Failed to parse response", exc);
        this.f88158b = null;
    }

    public yc2(String str) {
        super(str);
        this.f88158b = null;
    }

    public yc2(Throwable th) {
        super(th);
        this.f88158b = null;
    }
}
