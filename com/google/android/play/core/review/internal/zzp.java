package com.google.android.play.core.review.internal;

import android.os.IBinder;
import java.util.List;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
final class zzp extends zzj {

    /* renamed from: c */
    final /* synthetic */ IBinder f39237c;

    /* renamed from: d */
    final /* synthetic */ zzs f39238d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzs zzsVar, IBinder iBinder) {
        this.f39238d = zzsVar;
        this.f39237c = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.f39238d.f39240b.f39254m = zze.zzb(this.f39237c);
        zzt.m70126k(this.f39238d.f39240b);
        this.f39238d.f39240b.f39248g = false;
        list = this.f39238d.f39240b.f39245d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f39238d.f39240b.f39245d;
        list2.clear();
    }
}
