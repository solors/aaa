package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* loaded from: classes8.dex */
public final class da0 implements InterfaceC31680vt {

    /* renamed from: d */
    public static final boolean f78013d;

    /* renamed from: a */
    public final UUID f78014a;

    /* renamed from: b */
    public final byte[] f78015b;

    /* renamed from: c */
    public final boolean f78016c;

    static {
        boolean z;
        if ("Amazon".equals(y32.f88012c)) {
            String str = y32.f88013d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f78013d = z;
            }
        }
        z = false;
        f78013d = z;
    }

    public da0(UUID uuid, byte[] bArr, boolean z) {
        this.f78014a = uuid;
        this.f78015b = bArr;
        this.f78016c = z;
    }
}
