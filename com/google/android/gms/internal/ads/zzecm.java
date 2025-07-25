package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzecm {
    @Nullable
    zzecr zza(String str, WebView webView, String str2, String str3, @Nullable String str4, zzeco zzecoVar, zzecn zzecnVar, @Nullable String str5);

    @Nullable
    zzecr zzb(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzeco zzecoVar, zzecn zzecnVar, @Nullable String str6);

    @Nullable
    zzfla zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    @Nullable
    String zzf(Context context);

    void zzg(zzfkp zzfkpVar, View view);

    void zzh(zzfla zzflaVar, View view);

    void zzi(zzfkp zzfkpVar);

    void zzj(zzfkp zzfkpVar, View view);

    void zzk(zzfkp zzfkpVar);

    boolean zzl(Context context);

    void zzm(zzfla zzflaVar, zzcfo zzcfoVar);
}
