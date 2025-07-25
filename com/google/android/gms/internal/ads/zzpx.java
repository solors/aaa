package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(23)
/* loaded from: classes5.dex */
final class zzpx {
    public static void zza(AudioTrack audioTrack, @Nullable zzoo zzooVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzooVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzooVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
