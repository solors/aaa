package com.google.android.play.core.review;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
final class zza extends ReviewInfo {

    /* renamed from: b */
    private final PendingIntent f39261b;

    /* renamed from: c */
    private final boolean f39262c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.f39261b = pendingIntent;
            this.f39262c = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: c */
    final PendingIntent mo70121c() {
        return this.f39261b;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: d */
    final boolean mo70120d() {
        return this.f39262c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f39261b.equals(reviewInfo.mo70121c()) && this.f39262c == reviewInfo.mo70120d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f39261b.hashCode() ^ 1000003) * 1000003;
        if (true != this.f39262c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f39261b.toString();
        boolean z = this.f39262c;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z + "}";
    }
}
