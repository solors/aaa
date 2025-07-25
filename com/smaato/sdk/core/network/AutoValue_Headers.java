package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.network.a */
/* loaded from: classes7.dex */
final class AutoValue_Headers extends Headers {

    /* renamed from: b */
    private final Map<String, List<String>> f71777b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Headers(Map<String, List<String>> map) {
        if (map != null) {
            this.f71777b = map;
            return;
        }
        throw new NullPointerException("Null headers");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Headers) {
            return this.f71777b.equals(((Headers) obj).headers());
        }
        return false;
    }

    public int hashCode() {
        return this.f71777b.hashCode() ^ 1000003;
    }

    @Override // com.smaato.sdk.core.network.Headers
    @NonNull
    public Map<String, List<String>> headers() {
        return this.f71777b;
    }

    public String toString() {
        return "Headers{headers=" + this.f71777b + "}";
    }
}
