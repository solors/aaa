package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.a5 */
/* loaded from: classes9.dex */
public class C34391a5 {

    /* renamed from: a */
    public final String f93912a;

    /* renamed from: b */
    public final String f93913b;

    public C34391a5(String str, String str2) {
        this.f93912a = str;
        this.f93913b = str2;
    }

    @NonNull
    /* renamed from: a */
    public final String m22022a() {
        return ApiKeyUtils.createPartialApiKey(this.f93913b);
    }

    @Nullable
    /* renamed from: b */
    public final String m22021b() {
        return this.f93913b;
    }

    /* renamed from: c */
    public final String m22020c() {
        return this.f93912a;
    }

    /* renamed from: d */
    public boolean mo21825d() {
        return false;
    }

    /* renamed from: e */
    public String mo21824e() {
        return this.f93912a + "_" + ApiKeyUtils.createPartialApiKey(this.f93913b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C34391a5 c34391a5 = (C34391a5) obj;
        String str = this.f93912a;
        if (str == null ? c34391a5.f93912a != null : !str.equals(c34391a5.f93912a)) {
            return false;
        }
        String str2 = this.f93913b;
        String str3 = c34391a5.f93913b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f93912a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f93913b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return this.f93912a + "_" + this.f93913b;
    }
}
