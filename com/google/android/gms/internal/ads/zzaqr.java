package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C15633C;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzaqr extends zzapm {
    private final Object zza;
    @Nullable
    @GuardedBy("mLock")
    private final zzapr zzb;

    public zzaqr(int i, String str, zzapr zzaprVar, @Nullable zzapq zzapqVar) {
        super(i, str, zzapqVar);
        this.zza = new Object();
        this.zzb = zzaprVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final zzaps zzh(zzapi zzapiVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapiVar.zzb;
            Map map = zzapiVar.zzc;
            String str3 = C15633C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals(C20517nb.f52166M)) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapiVar.zzb);
        }
        return zzaps.zzb(str, zzaqj.zzb(zzapiVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzapm
    /* renamed from: zzz */
    public void zzo(String str) {
        zzapr zzaprVar;
        synchronized (this.zza) {
            zzaprVar = this.zzb;
        }
        zzaprVar.zza(str);
    }
}
