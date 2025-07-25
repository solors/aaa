package com.applovin.impl;

import java.io.IOException;

/* renamed from: com.applovin.impl.ch */
/* loaded from: classes2.dex */
public class C4187ch extends IOException {

    /* renamed from: a */
    public final boolean f5276a;

    /* renamed from: b */
    public final int f5277b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4187ch(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f5276a = z;
        this.f5277b = i;
    }

    /* renamed from: a */
    public static C4187ch m100188a(String str, Throwable th) {
        return new C4187ch(str, th, true, 1);
    }

    /* renamed from: b */
    public static C4187ch m100187b(String str, Throwable th) {
        return new C4187ch(str, th, true, 0);
    }

    /* renamed from: a */
    public static C4187ch m100189a(String str) {
        return new C4187ch(str, null, false, 1);
    }
}
