package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
/* loaded from: classes4.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m72314id = 1)
    private final boolean zza;
    @Nullable
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", m72314id = 2, type = "android.os.IBinder")
    private final zzcm zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m72314id = 3)
    private final IBinder zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(m72313id = 1) boolean z, @Nullable @SafeParcelable.Param(m72313id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(m72313id = 3) IBinder iBinder2) {
        zzcm zzcmVar;
        this.zza = z;
        if (iBinder != null) {
            zzcmVar = zzcl.zzd(iBinder);
        } else {
            zzcmVar = null;
        }
        this.zzb = zzcmVar;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        zzcm zzcmVar = this.zzb;
        if (zzcmVar == null) {
            asBinder = null;
        } else {
            asBinder = zzcmVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzcm zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbhn zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return zzbhm.zzb(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @Deprecated
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NonNull
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }
}
