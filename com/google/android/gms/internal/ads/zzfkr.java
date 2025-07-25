package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfkr {
    private final zzflc zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    @Nullable
    private final String zze;
    @Nullable
    private final String zzf;
    private final zzfks zzg;

    private zzfkr(zzflc zzflcVar, WebView webView, String str, List list, @Nullable String str2, @Nullable String str3, zzfks zzfksVar) {
        this.zza = zzflcVar;
        this.zzb = webView;
        this.zzg = zzfksVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfkr zzb(zzflc zzflcVar, WebView webView, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzfmk.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfkr(zzflcVar, webView, null, null, str, str2, zzfks.HTML);
    }

    public static zzfkr zzc(zzflc zzflcVar, WebView webView, @Nullable String str, @Nullable String str2) {
        zzfmk.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfkr(zzflcVar, webView, null, null, str, "", zzfks.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfks zzd() {
        return this.zzg;
    }

    public final zzflc zze() {
        return this.zza;
    }

    @Nullable
    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
