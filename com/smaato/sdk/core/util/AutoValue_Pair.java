package com.smaato.sdk.core.util;

import androidx.annotation.Nullable;

/* renamed from: com.smaato.sdk.core.util.a */
/* loaded from: classes7.dex */
final class AutoValue_Pair<F, S> extends Pair<F, S> {

    /* renamed from: a */
    private final F f71934a;

    /* renamed from: b */
    private final S f71935b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Pair(@Nullable F f, @Nullable S s) {
        this.f71934a = f;
        this.f71935b = s;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f = this.f71934a;
        if (f != null ? f.equals(pair.first()) : pair.first() == null) {
            S s = this.f71935b;
            if (s == null) {
                if (pair.second() == null) {
                    return true;
                }
            } else if (s.equals(pair.second())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.smaato.sdk.core.util.Pair
    @Nullable
    public F first() {
        return this.f71934a;
    }

    public int hashCode() {
        int hashCode;
        F f = this.f71934a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        S s = this.f71935b;
        if (s != null) {
            i = s.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.smaato.sdk.core.util.Pair
    @Nullable
    public S second() {
        return this.f71935b;
    }

    public String toString() {
        return "Pair{first=" + this.f71934a + ", second=" + this.f71935b + "}";
    }
}
