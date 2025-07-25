package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzayz {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazo zze;
    private final zzazw zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzayz(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = new zzazo(i4);
        this.zzf = new zzazw(i5, i6, i7);
    }

    private final void zzm(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() >= this.zzc) {
                synchronized (this.zzg) {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z) {
                        this.zzi.add(str);
                        this.zzj.add(new zzazk(f, f2, f3, f4, this.zzi.size() - 1));
                    }
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb2.append((String) arrayList.get(i2));
            sb2.append(' ');
            i2++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzayz)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzayz) obj).zzo;
        if (str == null || !str.equals(this.zzo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i2 = this.zzn;
        int i3 = this.zzk;
        String zzn = zzn(arrayList, 100);
        String zzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + zzn + "\n viewableText" + zzn2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }

    @VisibleForTesting
    final int zza(int i, int i2) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i * this.zza) + (i2 * this.zzb);
    }

    @VisibleForTesting
    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i) {
        this.zzl = i;
    }

    public final void zzh(String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
    }

    public final void zzi(String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("ActivityContent: negative number of WebViews.");
            }
            zzj();
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
