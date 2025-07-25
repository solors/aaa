package com.applovin.impl;

import java.util.UUID;

/* renamed from: com.applovin.impl.k9 */
/* loaded from: classes2.dex */
public final class C4704k9 implements InterfaceC5895y4 {

    /* renamed from: d */
    public static final boolean f7396d;

    /* renamed from: a */
    public final UUID f7397a;

    /* renamed from: b */
    public final byte[] f7398b;

    /* renamed from: c */
    public final boolean f7399c;

    static {
        boolean z;
        if ("Amazon".equals(AbstractC5863xp.f12153c)) {
            String str = AbstractC5863xp.f12154d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f7396d = z;
            }
        }
        z = false;
        f7396d = z;
    }

    public C4704k9(UUID uuid, byte[] bArr, boolean z) {
        this.f7397a = uuid;
        this.f7398b = bArr;
        this.f7399c = z;
    }
}
