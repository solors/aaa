package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C21114v8;

/* compiled from: Header.java */
/* renamed from: com.mbridge.msdk.tracker.network.h */
/* loaded from: classes6.dex */
public final class C22909h {

    /* renamed from: a */
    private final String f59752a;

    /* renamed from: b */
    private final String f59753b;

    public C22909h(String str, String str2) {
        this.f59752a = str;
        this.f59753b = str2;
    }

    /* renamed from: a */
    public final String m49512a() {
        return this.f59752a;
    }

    /* renamed from: b */
    public final String m49511b() {
        return this.f59753b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22909h.class != obj.getClass()) {
            return false;
        }
        C22909h c22909h = (C22909h) obj;
        if (TextUtils.equals(this.f59752a, c22909h.f59752a) && TextUtils.equals(this.f59753b, c22909h.f59753b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f59752a.hashCode() * 31) + this.f59753b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f59752a + ",value=" + this.f59753b + C21114v8.C21123i.f54139e;
    }
}
