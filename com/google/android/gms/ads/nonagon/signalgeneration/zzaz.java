package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbyy;
import com.ironsource.mediationsdk.C20410l;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzaz {
    private final String zza;
    @Nullable
    private final String zzb;
    @Nullable
    private final zzbyy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        String str;
        String str2;
        zzbyy zzbyyVar;
        str = zzaxVar.zza;
        this.zza = str;
        str2 = zzaxVar.zzb;
        this.zzb = str2;
        zzbyyVar = zzaxVar.zzc;
        this.zzc = zzbyyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbbq.zza.EnumC45351zza zza() {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(C20410l.f51629a)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return zzbbq.zza.EnumC45351zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbbq.zza.EnumC45351zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbbq.zza.EnumC45351zza.AD_LOADER;
            }
            return zzbbq.zza.EnumC45351zza.INTERSTITIAL;
        }
        return zzbbq.zza.EnumC45351zza.BANNER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzbyy zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
