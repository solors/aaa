package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "SafeBrowsingConfigParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzbxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxr> CREATOR = new zzbxs();
    @SafeParcelable.Field(m72314id = 2)
    public final String zza;
    @SafeParcelable.Field(m72314id = 3)
    public final String zzb;
    @SafeParcelable.Field(m72314id = 4)
    public final boolean zzc;
    @SafeParcelable.Field(m72314id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(m72314id = 6)
    public final List zze;
    @SafeParcelable.Field(m72314id = 7)
    public final boolean zzf;
    @SafeParcelable.Field(m72314id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(m72314id = 9)
    public final List zzh;

    @SafeParcelable.Constructor
    public zzbxr(@SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) String str2, @SafeParcelable.Param(m72313id = 4) boolean z, @SafeParcelable.Param(m72313id = 5) boolean z2, @SafeParcelable.Param(m72313id = 6) List list, @SafeParcelable.Param(m72313id = 7) boolean z3, @SafeParcelable.Param(m72313id = 8) boolean z4, @SafeParcelable.Param(m72313id = 9) List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = list;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    @Nullable
    public static zzbxr zza(JSONObject jSONObject) throws JSONException {
        return new zzbxr(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeStringList(parcel, 6, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
