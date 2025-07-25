package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
/* loaded from: classes4.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();
    @SafeParcelable.VersionField(m72311id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getToken", m72314id = 2)
    private final String zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", m72314id = 3)
    private final Long zzc;
    @SafeParcelable.Field(getter = "isCached", m72314id = 4)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "isSnowballed", m72314id = 5)
    private final boolean zze;
    @Nullable
    @SafeParcelable.Field(getter = "getGrantedScopes", m72314id = 6)
    private final List zzf;
    @Nullable
    @SafeParcelable.Field(getter = "getScopeData", m72314id = 7)
    private final String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) String str, @Nullable @SafeParcelable.Param(m72313id = 3) Long l, @SafeParcelable.Param(m72313id = 4) boolean z, @SafeParcelable.Param(m72313id = 5) boolean z2, @Nullable @SafeParcelable.Param(m72313id = 6) List list, @Nullable @SafeParcelable.Param(m72313id = 7) String str2) {
        this.zza = i;
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !Objects.equal(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !Objects.equal(this.zzf, tokenData.zzf) || !Objects.equal(this.zzg, tokenData.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final String zza() {
        return this.zzb;
    }
}
