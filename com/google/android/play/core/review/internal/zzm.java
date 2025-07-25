package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzm extends zzj {

    /* renamed from: c */
    final /* synthetic */ zzj f39234c;

    /* renamed from: d */
    final /* synthetic */ zzt f39235d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzt zztVar, TaskCompletionSource taskCompletionSource, zzj zzjVar) {
        super(taskCompletionSource);
        this.f39235d = zztVar;
        this.f39234c = zzjVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        zzt.m70127j(this.f39235d, this.f39234c);
    }
}
