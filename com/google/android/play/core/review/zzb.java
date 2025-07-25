package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader());
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new zza(pendingIntent, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReviewInfo[i];
    }
}
