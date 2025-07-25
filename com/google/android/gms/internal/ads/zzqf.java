package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(24)
/* loaded from: classes5.dex */
public final class zzqf {
    private final AudioTrack zza;
    private final zzon zzb;
    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqe
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqf.zza(zzqf.this, audioRouting);
        }
    };

    public zzqf(AudioTrack audioTrack, zzon zzonVar) {
        this.zza = audioTrack;
        this.zzb = zzonVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzqf zzqfVar, AudioRouting audioRouting) {
        if (zzqfVar.zzc != null && audioRouting.getRoutedDevice() != null) {
            zzqfVar.zzb.zzh(audioRouting.getRoutedDevice());
        }
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
