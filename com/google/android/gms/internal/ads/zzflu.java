package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflu {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflu zza = new zzflu();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzflu zza() {
        return zza;
    }

    public final void zzc() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        zzd(this.zzc, isDeviceLocked);
        this.zzd = isDeviceLocked;
    }

    public final void zzd(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (!z2 && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!this.zzd && !this.zzc) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 != z4) {
            for (zzfkt zzfktVar : zzflk.zza().zzc()) {
                zzfma zzg = zzfktVar.zzg();
                if (!z2 && !z) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                zzg.zzm(z5);
            }
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzflt(this), intentFilter);
    }
}
