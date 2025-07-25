package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;

/* renamed from: com.smaato.sdk.iahb.d */
/* loaded from: classes7.dex */
final class AutoValue_InAppBid extends InAppBid {

    /* renamed from: a */
    private final String f72050a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InAppBid(String str) {
        if (str != null) {
            this.f72050a = str;
            return;
        }
        throw new NullPointerException("Null json");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InAppBid) {
            return this.f72050a.equals(((InAppBid) obj).getJson());
        }
        return false;
    }

    @Override // com.smaato.sdk.iahb.InAppBid
    @NonNull
    String getJson() {
        return this.f72050a;
    }

    public int hashCode() {
        return this.f72050a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "InAppBid{json=" + this.f72050a + "}";
    }
}
