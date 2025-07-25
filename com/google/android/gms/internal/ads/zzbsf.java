package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C16236R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbsf extends zzbsi {
    private final Map zza;
    private final Context zzb;

    public zzbsf(zzcex zzcexVar, Map map) {
        super(zzcexVar, "storePicture");
        this.zza = map;
        this.zzb = zzcexVar.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbbt(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzh("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.zzv.zzq();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
                com.google.android.gms.ads.internal.zzv.zzq();
                AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
                if (zze != null) {
                    str = zze.getString(C16236R.C16240string.f36507s1);
                } else {
                    str = "Save image";
                }
                zzL.setTitle(str);
                if (zze != null) {
                    str2 = zze.getString(C16236R.C16240string.f36508s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzL.setMessage(str2);
                if (zze != null) {
                    str3 = zze.getString(C16236R.C16240string.f36509s3);
                } else {
                    str3 = "Accept";
                }
                zzL.setPositiveButton(str3, new zzbsd(this, str5, lastPathSegment));
                if (zze != null) {
                    str4 = zze.getString(C16236R.C16240string.f36510s4);
                } else {
                    str4 = "Decline";
                }
                zzL.setNegativeButton(str4, new zzbse(this));
                zzL.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzh("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
