package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbtv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public class QueryInfo {
    private final zzfa zza;

    public QueryInfo(zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, @Nullable final AdRequest adRequest, @Nullable final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzei zza;
        zzbcl.zza(context);
        if (((Boolean) zzbej.zzj.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzei zza2;
                        AdRequest adRequest2 = adRequest;
                        if (adRequest2 == null) {
                            zza2 = null;
                        } else {
                            zza2 = adRequest2.zza();
                        }
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        String str2 = str;
                        new zzbtv(context, adFormat, zza2, str2).zzb(queryInfoGenerationCallback2);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zza = null;
        } else {
            zza = adRequest.zza();
        }
        new zzbtv(context, adFormat, zza, str).zzb(queryInfoGenerationCallback);
    }

    @NonNull
    public String getQuery() {
        return this.zza.zzb();
    }

    @NonNull
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @NonNull
    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull String str, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
