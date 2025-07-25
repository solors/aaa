package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaki implements zzadt {
    private final zzadt zza;
    private final zzakd zzb;
    @Nullable
    private zzakf zzg;
    private zzab zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzei.zzf;
    private final zzdy zzc = new zzdy();

    public zzaki(zzadt zzadtVar, zzakd zzakdVar) {
        this.zza = zzadtVar;
        this.zzb = zzakdVar;
    }

    private final void zzb(int i) {
        byte[] bArr;
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr2 = this.zzf;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.zzd, bArr, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(long j, int i, zzajx zzajxVar) {
        boolean z;
        zzcw.zzb(this.zzh);
        zzfxn<zzco> zzfxnVar = zzajxVar.zza;
        long j2 = zzajxVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfxnVar.size());
        for (zzco zzcoVar : zzfxnVar) {
            arrayList.add(zzcoVar.zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzdy zzdyVar = this.zzc;
        int length = marshall.length;
        zzdyVar.zzJ(marshall, length);
        this.zza.zzr(this.zzc, length);
        long j3 = zzajxVar.zzb;
        if (j3 == -9223372036854775807L) {
            if (this.zzh.zzt == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            zzcw.zzf(z);
        } else {
            long j4 = this.zzh.zzt;
            if (j4 == Long.MAX_VALUE) {
                j += j3;
            } else {
                j = j3 + j4;
            }
        }
        this.zza.zzt(j, i, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ int zzf(zzl zzlVar, int i, boolean z) {
        return zzadr.zza(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzg(zzl zzlVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i, z, 0);
        }
        zzb(i);
        int zza = zzlVar.zza(this.zzf, this.zze, i);
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.zze += zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzm(zzab zzabVar) {
        boolean z;
        zzakf zzakfVar;
        String str = zzabVar.zzo;
        str.getClass();
        if (zzbb.zzb(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        if (!zzabVar.equals(this.zzh)) {
            this.zzh = zzabVar;
            if (this.zzb.zzc(zzabVar)) {
                zzakfVar = this.zzb.zzb(zzabVar);
            } else {
                zzakfVar = null;
            }
            this.zzg = zzakfVar;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzabVar);
            return;
        }
        zzadt zzadtVar = this.zza;
        zzz zzb = zzabVar.zzb();
        zzb.zzaa(MimeTypes.APPLICATION_MEDIA3_CUES);
        zzb.zzA(zzabVar.zzo);
        zzb.zzae(Long.MAX_VALUE);
        zzb.zzE(this.zzb.zza(zzabVar));
        zzadtVar.zzm(zzb.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzr(zzdy zzdyVar, int i) {
        zzadr.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzs(zzdy zzdyVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzs(zzdyVar, i, i2);
            return;
        }
        zzb(i);
        zzdyVar.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzt(final long j, final int i, int i2, int i3, @Nullable zzads zzadsVar) {
        boolean z;
        if (this.zzg == null) {
            this.zza.zzt(j, i, i2, i3, zzadsVar);
            return;
        }
        if (zzadsVar == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zze(z, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        this.zzg.zza(this.zzf, i4, i2, zzake.zza(), new zzdb() { // from class: com.google.android.gms.internal.ads.zzakh
            {
                zzaki.this = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                zzaki.this.zza(j, i, (zzajx) obj);
            }
        });
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzl(long j) {
    }
}
