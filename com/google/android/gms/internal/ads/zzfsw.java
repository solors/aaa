package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public final class zzfsw {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfto zzc = new zzfto("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    @VisibleForTesting
    final zzftn zza;
    private final String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfss] */
    public zzfsw(Context context) {
        if (zzftq.zza(context)) {
            this.zza = new zzftn(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzfss
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ boolean zzh(String str) {
        if (!zzk(str)) {
            return true;
        }
        return false;
    }

    private static void zzi(String str, Consumer consumer) {
        if (!zzk(str)) {
            str.getClass();
            consumer.accept(str.trim());
        }
    }

    private static boolean zzj(zzftb zzftbVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfst
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzfsw.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfsz zzc2 = zzfta.zzc();
        zzc2.zzb(8160);
        zzftbVar.zza(zzc2.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfve.zzc(str).trim().isEmpty();
    }

    public final void zza() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    public final void zzb(final zzfsd zzfsdVar, final zzftb zzftbVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (!zzj(zzftbVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfsdVar.zzb(), zzfsdVar.zza()))) {
        } else {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsm
                @Override // java.lang.Runnable
                public final void run() {
                    zzfsw.this.zzc(zzfsdVar, zzftbVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(zzfsd zzfsdVar, zzftb zzftbVar) {
        try {
            zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            zzfrn zzfrnVar = (zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfsdVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsp
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfsdVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfrnVar.zze(bundle, new zzfsv(this, zzftbVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzd(zzfsy zzfsyVar, zzftb zzftbVar) {
        try {
            zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            zzfrn zzfrnVar = (zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfsyVar.zzf());
            zzi(zzfsyVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfsyVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfsyVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfsyVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsi
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfsyVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsk
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfsw.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfrnVar.zzf(str, bundle, new zzfsv(this, zzftbVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zze(zzftd zzftdVar, int i, zzftb zzftbVar) {
        try {
            zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            zzfrn zzfrnVar = (zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzftdVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsh
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfsw.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzftdVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfsw.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfrnVar.zzg(bundle, new zzfsv(this, zzftbVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }

    public final void zzf(final zzfsy zzfsyVar, final zzftb zzftbVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (!zzj(zzftbVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzfsyVar.zzh()))) {
        } else {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfsw.this.zzd(zzfsyVar, zzftbVar);
                }
            });
        }
    }

    public final void zzg(final zzftd zzftdVar, final zzftb zzftbVar, final int i) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (!zzj(zzftbVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzftdVar.zzb(), zzftdVar.zza()))) {
        } else {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfso
                @Override // java.lang.Runnable
                public final void run() {
                    zzfsw.this.zze(zzftdVar, i, zzftbVar);
                }
            });
        }
    }
}
