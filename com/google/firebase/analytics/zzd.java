package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzdq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
final class zzd implements Callable<Long> {

    /* renamed from: b */
    private final /* synthetic */ FirebaseAnalytics f42076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(FirebaseAnalytics firebaseAnalytics) {
        this.f42076b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* synthetic */ Long call() throws Exception {
        zzdq zzdqVar;
        zzdqVar = this.f42076b.zzb;
        return zzdqVar.zzc();
    }
}
