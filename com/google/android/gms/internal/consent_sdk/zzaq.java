package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public final class zzaq implements zzdn {
    private final zzds zza;

    public zzaq(zzds zzdsVar) {
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzap((Application) this.zza.zza());
    }
}
