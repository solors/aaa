package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzent implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzent(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzens
            {
                zzent.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzent.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzenu zzc() throws Exception {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float zza = com.google.android.gms.ads.internal.zzv.zzs().zza();
        boolean zze = com.google.android.gms.ads.internal.zzv.zzs().zze();
        if (audioManager == null) {
            return new zzenu(-1, false, false, -1, -1, -1, -1, -1, zza, zze, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkQ)).booleanValue()) {
            int zzj = com.google.android.gms.ads.internal.zzv.zzr().zzj(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
            i = zzj;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzenu(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zza, zze, false);
    }
}
