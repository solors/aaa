package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public class MediationConfiguration {
    @NonNull
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(@NonNull AdFormat adFormat, @NonNull Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    @NonNull
    public AdFormat getFormat() {
        return this.zza;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.zzb;
    }
}
