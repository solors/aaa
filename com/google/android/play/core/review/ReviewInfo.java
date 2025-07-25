package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new zzb();

    public static ReviewInfo zzc(PendingIntent pendingIntent, boolean z) {
        return new zza(pendingIntent, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract PendingIntent mo70121c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo70120d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo70121c(), 0);
        parcel.writeInt(mo70120d() ? 1 : 0);
    }
}
