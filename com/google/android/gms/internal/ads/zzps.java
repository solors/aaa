package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzps {
    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzps() {
        this.zza = null;
    }

    public final zzor zza(zzab zzabVar, zze zzeVar) {
        boolean booleanValue;
        boolean z;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        zzabVar.getClass();
        zzeVar.getClass();
        int i = zzei.zza;
        if (i >= 29 && zzabVar.zzE != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            boolean z2 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.zzb = Boolean.valueOf(z);
                    } else {
                        this.zzb = Boolean.FALSE;
                    }
                } else {
                    this.zzb = Boolean.FALSE;
                }
                booleanValue = this.zzb.booleanValue();
            }
            String str = zzabVar.zzo;
            str.getClass();
            int zza = zzbb.zza(str, zzabVar.zzk);
            if (zza != 0 && i >= zzei.zzh(zza)) {
                int zzi = zzei.zzi(zzabVar.zzD);
                if (zzi == 0) {
                    return zzor.zza;
                }
                try {
                    AudioFormat zzx = zzei.zzx(zzabVar.zzE, zzi, zza);
                    if (i >= 31) {
                        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzx, zzeVar.zza().zza);
                        if (playbackOffloadSupport == 0) {
                            return zzor.zza;
                        }
                        zzop zzopVar = new zzop();
                        if (i > 32 && playbackOffloadSupport == 2) {
                            z2 = true;
                        }
                        zzopVar.zza(true);
                        zzopVar.zzb(z2);
                        zzopVar.zzc(booleanValue);
                        return zzopVar.zzd();
                    }
                    isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(zzx, zzeVar.zza().zza);
                    if (!isOffloadedPlaybackSupported) {
                        return zzor.zza;
                    }
                    zzop zzopVar2 = new zzop();
                    zzopVar2.zza(true);
                    zzopVar2.zzc(booleanValue);
                    return zzopVar2.zzd();
                } catch (IllegalArgumentException unused) {
                    return zzor.zza;
                }
            }
            return zzor.zza;
        }
        return zzor.zza;
    }

    public zzps(@Nullable Context context) {
        this.zza = context;
    }
}
