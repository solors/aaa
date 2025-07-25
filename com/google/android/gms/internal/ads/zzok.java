package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzok extends ContentObserver {
    final /* synthetic */ zzon zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzok(zzon zzonVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzonVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        zze zzeVar;
        zzoo zzooVar;
        zzon zzonVar = this.zza;
        context = zzonVar.zza;
        zzeVar = zzonVar.zzh;
        zzooVar = zzonVar.zzg;
        this.zza.zzj(zzoi.zzc(context, zzeVar, zzooVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
