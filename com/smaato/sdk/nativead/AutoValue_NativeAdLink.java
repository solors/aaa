package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: com.smaato.sdk.nativead.c */
/* loaded from: classes7.dex */
final class AutoValue_NativeAdLink extends NativeAdLink {

    /* renamed from: a */
    private final String f72174a;

    /* renamed from: b */
    private final List<String> f72175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NativeAdLink(String str, List<String> list) {
        if (str != null) {
            this.f72174a = str;
            if (list != null) {
                this.f72175b = list;
                return;
            }
            throw new NullPointerException("Null trackers");
        }
        throw new NullPointerException("Null url");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdLink)) {
            return false;
        }
        NativeAdLink nativeAdLink = (NativeAdLink) obj;
        if (this.f72174a.equals(nativeAdLink.url()) && this.f72175b.equals(nativeAdLink.trackers())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f72174a.hashCode() ^ 1000003) * 1000003) ^ this.f72175b.hashCode();
    }

    public String toString() {
        return "NativeAdLink{url=" + this.f72174a + ", trackers=" + this.f72175b + "}";
    }

    @Override // com.smaato.sdk.nativead.NativeAdLink
    @NonNull
    public List<String> trackers() {
        return this.f72175b;
    }

    @Override // com.smaato.sdk.nativead.NativeAdLink
    @NonNull
    public String url() {
        return this.f72174a;
    }
}
