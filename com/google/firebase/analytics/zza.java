package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzdq;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zza implements Callable<String> {

    /* renamed from: b */
    private final /* synthetic */ FirebaseAnalytics f42074b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(FirebaseAnalytics firebaseAnalytics) {
        this.f42074b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* synthetic */ String call() throws Exception {
        zzdq zzdqVar;
        zzdqVar = this.f42074b.zzb;
        return zzdqVar.zze();
    }
}
