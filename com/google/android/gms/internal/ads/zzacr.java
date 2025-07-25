package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzacr {
    public static int zza(zzaco zzacoVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzacoVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    public static void zzb(boolean z, @Nullable String str) throws zzbc {
        if (z) {
            return;
        }
        throw zzbc.zza(str, null);
    }

    public static boolean zzc(zzaco zzacoVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzacoVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzaco zzacoVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            zzacoVar.zzi(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaco zzacoVar, int i) throws IOException {
        try {
            zzacoVar.zzk(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
