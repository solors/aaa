package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.n3 */
/* loaded from: classes3.dex */
public final class C10061n3 {

    /* renamed from: a */
    public final String f22642a;

    /* renamed from: b */
    public final boolean f22643b;

    /* renamed from: c */
    public final String f22644c;

    public C10061n3(String str, boolean z, String webViewVersion) {
        Intrinsics.checkNotNullParameter(webViewVersion, "webViewVersion");
        this.f22642a = str;
        this.f22643b = z;
        this.f22644c = webViewVersion;
    }

    /* renamed from: a */
    public final String m81040a() {
        return this.f22642a;
    }

    /* renamed from: b */
    public final boolean m81039b() {
        return this.f22643b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10061n3)) {
            return false;
        }
        C10061n3 c10061n3 = (C10061n3) obj;
        if (Intrinsics.m17075f(this.f22642a, c10061n3.f22642a) && this.f22643b == c10061n3.f22643b && Intrinsics.m17075f(this.f22644c, c10061n3.f22644c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f22642a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + Boolean.hashCode(this.f22643b)) * 31) + this.f22644c.hashCode();
    }

    public String toString() {
        String str = this.f22642a;
        boolean z = this.f22643b;
        String str2 = this.f22644c;
        return "ConfigurationBodyFields(configVariant=" + str + ", webViewEnabled=" + z + ", webViewVersion=" + str2 + ")";
    }
}
