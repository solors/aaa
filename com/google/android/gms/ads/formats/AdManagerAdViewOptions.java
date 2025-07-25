package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes4.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m72314id = 1)
    private final boolean zza;
    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m72314id = 2)
    private final IBinder zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean zza = false;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzbhn zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbhm.zzb(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(m72313id = 1) boolean z, @Nullable @SafeParcelable.Param(m72313id = 2) IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }
}
