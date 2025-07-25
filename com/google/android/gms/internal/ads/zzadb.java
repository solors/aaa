package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadb {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = zzei.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        if (this.zza != -1 && this.zzb != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzb(zzay zzayVar) {
        for (int i = 0; i < zzayVar.zza(); i++) {
            zzax zzb = zzayVar.zzb(i);
            if (zzb instanceof zzagb) {
                zzagb zzagbVar = (zzagb) zzb;
                if ("iTunSMPB".equals(zzagbVar.zzb) && zzc(zzagbVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzagk) {
                zzagk zzagkVar = (zzagk) zzb;
                if ("com.apple.iTunes".equals(zzagkVar.zza) && "iTunSMPB".equals(zzagkVar.zzb) && zzc(zzagkVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
