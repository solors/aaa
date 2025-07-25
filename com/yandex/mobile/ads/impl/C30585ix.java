package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.yandex.mobile.ads.impl.ix */
/* loaded from: classes8.dex */
public final class C30585ix {

    /* renamed from: a */
    public final String f80660a;

    /* renamed from: b */
    public final v90 f80661b;

    /* renamed from: c */
    public final v90 f80662c;

    /* renamed from: d */
    public final int f80663d;

    /* renamed from: e */
    public final int f80664e;

    public C30585ix(String str, v90 v90Var, v90 v90Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        C30937nf.m31567a(z);
        this.f80660a = C30937nf.m31569a(str);
        this.f80661b = (v90) C30937nf.m31570a(v90Var);
        this.f80662c = (v90) C30937nf.m31570a(v90Var2);
        this.f80663d = i;
        this.f80664e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30585ix.class != obj.getClass()) {
            return false;
        }
        C30585ix c30585ix = (C30585ix) obj;
        if (this.f80663d == c30585ix.f80663d && this.f80664e == c30585ix.f80664e && this.f80660a.equals(c30585ix.f80660a) && this.f80661b.equals(c30585ix.f80661b) && this.f80662c.equals(c30585ix.f80662c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int m31189a = C31014o3.m31189a(this.f80660a, (((this.f80663d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f80664e) * 31, 31);
        return this.f80662c.hashCode() + ((this.f80661b.hashCode() + m31189a) * 31);
    }
}
