package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class zi2 {
    /* renamed from: a */
    public static void m26150a(xh2 xh2Var) {
        if (xh2Var.m27483h()) {
            if (!xh2Var.m27480k()) {
                return;
            }
            throw new IllegalStateException("AdSession is finished");
        }
        throw new IllegalStateException("AdSession is not started");
    }
}
