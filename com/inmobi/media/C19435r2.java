package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.r2 */
/* loaded from: classes6.dex */
public final class C19435r2 {

    /* renamed from: a */
    public final Config f48608a;

    /* renamed from: b */
    public final InterfaceC19365m2 f48609b;

    public C19435r2(Config config, InterfaceC19365m2 interfaceC19365m2) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f48608a = config;
        this.f48609b = interfaceC19365m2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19435r2)) {
            return false;
        }
        C19435r2 c19435r2 = (C19435r2) obj;
        if (Intrinsics.m17075f(this.f48608a, c19435r2.f48608a) && Intrinsics.m17075f(this.f48609b, c19435r2.f48609b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f48608a.hashCode() * 31;
        InterfaceC19365m2 interfaceC19365m2 = this.f48609b;
        if (interfaceC19365m2 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC19365m2.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ConfigFetchInputs(config=" + this.f48608a + ", listener=" + this.f48609b + ')';
    }
}
