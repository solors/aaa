package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzalb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxs zze = zzfxs.zzp("auto", "none");
    private static final zzfxs zzf = zzfxs.zzq("dot", "sesame", "circle");
    private static final zzfxs zzg = zzfxs.zzp("filled", "open");
    private static final zzfxs zzh = zzfxs.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Nullable
    public static zzalb zza(@Nullable String str) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        if (str != null) {
            String zza = zzftt.zza(str.trim());
            if (!zza.isEmpty()) {
                zzfxs zzm = zzfxs.zzm(TextUtils.split(zza, zzd));
                String str2 = (String) zzfxt.zza(zzfzp.zzb(zzh, zzm), "outside");
                int hashCode = str2.hashCode();
                int i3 = -1;
                int i4 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals("after")) {
                        z = false;
                    }
                    z = true;
                } else {
                    if (str2.equals("outside")) {
                        z = true;
                    }
                    z = true;
                }
                if (z) {
                    if (!z) {
                        i = 1;
                    } else {
                        i = -2;
                    }
                } else {
                    i = 2;
                }
                zzfzn zzb = zzfzp.zzb(zze, zzm);
                if (!zzb.isEmpty()) {
                    String str3 = (String) zzb.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals("none")) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        i3 = 0;
                    }
                } else {
                    zzfzn zzb2 = zzfzp.zzb(zzg, zzm);
                    zzfzn zzb3 = zzfzp.zzb(zzf, zzm);
                    if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                        String str4 = (String) zzfxt.zza(zzb2, "filled");
                        if (str4.hashCode() == 3417674 && str4.equals("open")) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        String str5 = (String) zzfxt.zza(zzb3, "circle");
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals("dot")) {
                                i3 = 0;
                            }
                        } else if (str5.equals("sesame")) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            if (i3 != 1) {
                                i4 = i2;
                                i3 = 1;
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 2;
                        }
                        i4 = i2;
                    }
                }
                return new zzalb(i3, i4, i);
            }
            return null;
        }
        return null;
    }
}
