package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e */
/* loaded from: classes4.dex */
public final class C14984e {

    /* renamed from: a */
    public final String f29404a;

    /* renamed from: b */
    public final boolean f29405b;

    public C14984e(boolean z, String str) {
        this.f29404a = str;
        this.f29405b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C14984e.class) {
            return false;
        }
        C14984e c14984e = (C14984e) obj;
        if (TextUtils.equals(this.f29404a, c14984e.f29404a) && this.f29405b == c14984e.f29405b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        String str = this.f29404a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (this.f29405b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }
}
