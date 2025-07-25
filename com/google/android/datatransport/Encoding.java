package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class Encoding {

    /* renamed from: a */
    private final String f30855a;

    private Encoding(@NonNull String str) {
        if (str != null) {
            this.f30855a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: of */
    public static Encoding m76344of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f30855a.equals(((Encoding) obj).f30855a);
    }

    public String getName() {
        return this.f30855a;
    }

    public int hashCode() {
        return this.f30855a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f30855a + "\"}";
    }
}
