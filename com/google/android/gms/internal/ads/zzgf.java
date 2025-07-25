package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgf implements zzfy {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfy zzc;
    @Nullable
    private zzfy zzd;
    @Nullable
    private zzfy zze;
    @Nullable
    private zzfy zzf;
    @Nullable
    private zzfy zzg;
    @Nullable
    private zzfy zzh;
    @Nullable
    private zzfy zzi;
    @Nullable
    private zzfy zzj;
    @Nullable
    private zzfy zzk;

    public zzgf(Context context, zzfy zzfyVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfyVar;
    }

    private final zzfy zzg() {
        if (this.zze == null) {
            zzfq zzfqVar = new zzfq(this.zza);
            this.zze = zzfqVar;
            zzh(zzfqVar);
        }
        return this.zze;
    }

    private final void zzh(zzfy zzfyVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfyVar.zzf((zzgy) this.zzb.get(i));
        }
    }

    private static final void zzi(@Nullable zzfy zzfyVar, zzgy zzgyVar) {
        if (zzfyVar != null) {
            zzfyVar.zzf(zzgyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzfy zzfyVar = this.zzk;
        zzfyVar.getClass();
        return zzfyVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        boolean z;
        zzfy zzfyVar;
        if (this.zzk == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        String scheme = zzgdVar.zza.getScheme();
        Uri uri = zzgdVar.zza;
        int i = zzei.zza;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.zzk = zzg();
            } else if ("content".equals(scheme)) {
                if (this.zzf == null) {
                    zzfv zzfvVar = new zzfv(this.zza);
                    this.zzf = zzfvVar;
                    zzh(zzfvVar);
                }
                this.zzk = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzfy zzfyVar2 = (zzfy) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.zzg = zzfyVar2;
                        zzh(zzfyVar2);
                    } catch (ClassNotFoundException unused) {
                        zzdo.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzha zzhaVar = new zzha(2000);
                    this.zzh = zzhaVar;
                    zzh(zzhaVar);
                }
                this.zzk = this.zzh;
            } else if ("data".equals(scheme)) {
                if (this.zzi == null) {
                    zzfw zzfwVar = new zzfw();
                    this.zzi = zzfwVar;
                    zzh(zzfwVar);
                }
                this.zzk = this.zzi;
            } else {
                if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    zzfyVar = this.zzc;
                } else {
                    if (this.zzj == null) {
                        zzgw zzgwVar = new zzgw(this.zza);
                        this.zzj = zzgwVar;
                        zzh(zzgwVar);
                    }
                    zzfyVar = this.zzj;
                }
                this.zzk = zzfyVar;
            }
        } else {
            String path = zzgdVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzgn zzgnVar = new zzgn();
                    this.zzd = zzgnVar;
                    zzh(zzgnVar);
                }
                this.zzk = this.zzd;
            }
        }
        return this.zzk.zzb(zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        zzfy zzfyVar = this.zzk;
        if (zzfyVar == null) {
            return null;
        }
        return zzfyVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        zzfy zzfyVar = this.zzk;
        if (zzfyVar != null) {
            try {
                zzfyVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        zzfy zzfyVar = this.zzk;
        if (zzfyVar == null) {
            return Collections.emptyMap();
        }
        return zzfyVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zzc.zzf(zzgyVar);
        this.zzb.add(zzgyVar);
        zzi(this.zzd, zzgyVar);
        zzi(this.zze, zzgyVar);
        zzi(this.zzf, zzgyVar);
        zzi(this.zzg, zzgyVar);
        zzi(this.zzh, zzgyVar);
        zzi(this.zzi, zzgyVar);
        zzi(this.zzj, zzgyVar);
    }
}
