package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.ironsource.C21114v8;

/* loaded from: classes8.dex */
public final class tc0 {

    /* renamed from: a */
    private final String f85591a;

    /* renamed from: b */
    private final String f85592b;

    public tc0(String str, String str2) {
        this.f85591a = str;
        this.f85592b = str2;
    }

    /* renamed from: a */
    public final String m29229a() {
        return this.f85591a;
    }

    /* renamed from: b */
    public final String m29228b() {
        return this.f85592b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tc0.class != obj.getClass()) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        if (TextUtils.equals(this.f85591a, tc0Var.f85591a) && TextUtils.equals(this.f85592b, tc0Var.f85592b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f85592b.hashCode() + (this.f85591a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f85591a + ",value=" + this.f85592b + C21114v8.C21123i.f54139e;
    }
}
