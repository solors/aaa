package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaqs implements zzaqh {
    final /* synthetic */ Context zza;
    private File zzb = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqs(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
