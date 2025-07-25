package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "SignRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes4.dex */
public class SignRequestParams extends RequestParams {
    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    @SafeParcelable.Field(getter = "getRequestId", m72314id = 2)
    private final Integer zza;
    @Nullable
    @SafeParcelable.Field(getter = "getTimeoutSeconds", m72314id = 3)
    private final Double zzb;
    @SafeParcelable.Field(getter = "getAppId", m72314id = 4)
    private final Uri zzc;
    @SafeParcelable.Field(getter = "getDefaultSignChallenge", m72314id = 5)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getRegisteredKeys", m72314id = 6)
    private final List zze;
    @SafeParcelable.Field(getter = "getChannelIdValue", m72314id = 7)
    private final ChannelIdValue zzf;
    @SafeParcelable.Field(getter = "getDisplayHint", m72314id = 8)
    private final String zzg;
    private final Set zzh;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        Integer zza;
        @Nullable
        Double zzb;
        Uri zzc;
        byte[] zzd;
        List zze;
        ChannelIdValue zzf;
        String zzg;

        @NonNull
        public SignRequestParams build() {
            return new SignRequestParams(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        @NonNull
        public Builder setAppId(@NonNull Uri uri) {
            this.zzc = uri;
            return this;
        }

        @NonNull
        public Builder setChannelIdValue(@NonNull ChannelIdValue channelIdValue) {
            this.zzf = channelIdValue;
            return this;
        }

        @NonNull
        public Builder setDefaultSignChallenge(@NonNull byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        @NonNull
        public Builder setDisplayHint(@NonNull String str) {
            this.zzg = str;
            return this;
        }

        @NonNull
        public Builder setRegisteredKeys(@NonNull List<RegisteredKey> list) {
            this.zze = list;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull Integer num) {
            this.zza = num;
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(@Nullable Double d) {
            this.zzb = d;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public SignRequestParams(@SafeParcelable.Param(m72313id = 2) Integer num, @Nullable @SafeParcelable.Param(m72313id = 3) Double d, @SafeParcelable.Param(m72313id = 4) Uri uri, @SafeParcelable.Param(m72313id = 5) byte[] bArr, @SafeParcelable.Param(m72313id = 6) List list, @SafeParcelable.Param(m72313id = 7) ChannelIdValue channelIdValue, @SafeParcelable.Param(m72313id = 8) String str) {
        boolean z;
        boolean z2;
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        this.zzd = bArr;
        boolean z3 = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "registeredKeys must not be null or empty");
        this.zze = list;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            if (registeredKey.getAppId() == null && uri == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "registered key has null appId and no request appId is provided");
            registeredKey.getChallengeValue();
            Preconditions.checkArgument(true, "register request has null challenge and no default challenge isprovided");
            if (registeredKey.getAppId() != null) {
                hashSet.add(Uri.parse(registeredKey.getAppId()));
            }
        }
        this.zzh = hashSet;
        Preconditions.checkArgument((str == null || str.length() <= 80) ? true : z3, "Display Hint cannot be longer than 80 characters");
        this.zzg = str;
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (Objects.equal(this.zza, signRequestParams.zza) && Objects.equal(this.zzb, signRequestParams.zzb) && Objects.equal(this.zzc, signRequestParams.zzc) && Arrays.equals(this.zzd, signRequestParams.zzd) && this.zze.containsAll(signRequestParams.zze) && signRequestParams.zze.containsAll(this.zze) && Objects.equal(this.zzf, signRequestParams.zzf) && Objects.equal(this.zzg, signRequestParams.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Set<Uri> getAllAppIds() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Uri getAppId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public ChannelIdValue getChannelIdValue() {
        return this.zzf;
    }

    @NonNull
    public byte[] getDefaultSignChallenge() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public String getDisplayHint() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public List<RegisteredKey> getRegisteredKeys() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Integer getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @Nullable
    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzc, this.zzb, this.zze, this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getRequestId(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getAppId(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getDefaultSignChallenge(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getRegisteredKeys(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getChannelIdValue(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getDisplayHint(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
