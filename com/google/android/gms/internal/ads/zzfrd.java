package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
class zzfrd {
    static final String zza = new UUID(0, 0).toString();
    final zzfrc zzb;
    final zzfrb zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrd(Context context, String str, String str2, String str3) {
        this.zzb = zzfrc.zzb(context);
        this.zzc = zzfrb.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str5 = this.zzh;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str6 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        sb2.append(str4);
        sb2.append(", hashKey is ");
        if (str3 != null) {
            str6 = "not null";
        }
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final long zza(boolean z) {
        String str;
        if (z) {
            str = this.zzg;
        } else {
            str = this.zzf;
        }
        return this.zzb.zza(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfra zzb(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        String str3;
        boolean z2 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfra();
        }
        if (str == null) {
            z2 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z2);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfrc zzfrcVar = this.zzb;
                    if (z2) {
                        str3 = this.zzg;
                    } else {
                        str3 = this.zzf;
                    }
                    zzfrcVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z2);
            if (zze2 == null && !z) {
                return zzc(str, str2);
            }
            return new zzfra(zze2, zza(z2));
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final zzfra zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    final zzfra zzd(String str, boolean z) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfrc zzfrcVar = this.zzb;
            if (z) {
                str2 = this.zzg;
            } else {
                str2 = this.zzf;
            }
            zzfrcVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfrc zzfrcVar2 = this.zzb;
            if (z) {
                str3 = this.zze;
            } else {
                str3 = this.zzd;
            }
            zzfrcVar2.zzd(str3, str);
            return new zzfra(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final String zze(boolean z) {
        String str;
        if (z) {
            str = this.zze;
        } else {
            str = this.zzd;
        }
        return this.zzb.zzc(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(boolean z) throws IOException {
        String str;
        String str2;
        if (z) {
            str = this.zzg;
        } else {
            str = this.zzf;
        }
        this.zzb.zze(str);
        zzfrc zzfrcVar = this.zzb;
        if (z) {
            str2 = this.zze;
        } else {
            str2 = this.zzd;
        }
        zzfrcVar.zze(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
