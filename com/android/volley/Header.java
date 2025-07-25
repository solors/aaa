package com.android.volley;

import android.text.TextUtils;
import com.ironsource.C21114v8;

/* renamed from: com.android.volley.g */
/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: a */
    private final String f3472a;

    /* renamed from: b */
    private final String f3473b;

    public Header(String str, String str2) {
        this.f3472a = str;
        this.f3473b = str2;
    }

    /* renamed from: a */
    public final String m102295a() {
        return this.f3472a;
    }

    /* renamed from: b */
    public final String m102294b() {
        return this.f3473b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Header.class != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        if (TextUtils.equals(this.f3472a, header.f3472a) && TextUtils.equals(this.f3473b, header.f3473b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3472a.hashCode() * 31) + this.f3473b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f3472a + ",value=" + this.f3473b + C21114v8.C21123i.f54139e;
    }
}
