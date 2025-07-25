package com.smaato.sdk.core.p569di;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.smaato.sdk.core.di.b */
/* loaded from: classes7.dex */
final class DiKey {
    @Nullable

    /* renamed from: a */
    private String f71475a;
    @NonNull

    /* renamed from: b */
    private Class f71476b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DiKey(@Nullable String str, @NonNull Class cls) {
        this.f71475a = str;
        this.f71476b = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DiKey.class != obj.getClass()) {
            return false;
        }
        DiKey diKey = (DiKey) obj;
        String str = this.f71475a;
        if (str == null ? diKey.f71475a != null : !str.equals(diKey.f71475a)) {
            return false;
        }
        return this.f71476b.equals(diKey.f71476b);
    }

    public int hashCode() {
        int i;
        String str = this.f71475a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f71476b.hashCode();
    }

    public String toString() {
        return "DiKey{name='" + this.f71475a + "', clazz=" + this.f71476b + '}';
    }
}
