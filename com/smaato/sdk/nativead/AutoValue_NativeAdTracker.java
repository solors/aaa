package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import com.smaato.sdk.nativead.NativeAdTracker;

/* renamed from: com.smaato.sdk.nativead.e */
/* loaded from: classes7.dex */
final class AutoValue_NativeAdTracker extends NativeAdTracker {

    /* renamed from: a */
    private final NativeAdTracker.Type f72190a;

    /* renamed from: b */
    private final String f72191b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NativeAdTracker(NativeAdTracker.Type type, String str) {
        if (type != null) {
            this.f72190a = type;
            if (str != null) {
                this.f72191b = str;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdTracker)) {
            return false;
        }
        NativeAdTracker nativeAdTracker = (NativeAdTracker) obj;
        if (this.f72190a.equals(nativeAdTracker.type()) && this.f72191b.equals(nativeAdTracker.url())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f72190a.hashCode() ^ 1000003) * 1000003) ^ this.f72191b.hashCode();
    }

    public String toString() {
        return "NativeAdTracker{type=" + this.f72190a + ", url=" + this.f72191b + "}";
    }

    @Override // com.smaato.sdk.nativead.NativeAdTracker
    @NonNull
    public NativeAdTracker.Type type() {
        return this.f72190a;
    }

    @Override // com.smaato.sdk.nativead.NativeAdTracker
    @NonNull
    public String url() {
        return this.f72191b;
    }
}
