package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes5.dex */
public final class zzfos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfos> CREATOR = new zzfot();
    @SafeParcelable.VersionField(m72311id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", m72314id = 2, type = "byte[]")
    private zzasy zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfos(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzasy zzasyVar = this.zzb;
        if (zzasyVar != null || this.zzc == null) {
            if (zzasyVar != null && this.zzc == null) {
                return;
            }
            if (zzasyVar != null && this.zzc != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (zzasyVar == null && this.zzc == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzasy zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzasy.zzd(this.zzc, zzgxb.zza());
                this.zzc = null;
            } catch (zzgyg | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
