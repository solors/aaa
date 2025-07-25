package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C16236R;
import com.maticoo.sdk.mraid.Consts;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbrz extends zzbsi {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrz(zzcex zzcexVar, Map map) {
        super(zzcexVar, Consts.CommandCreateCalendarEvent);
        this.zza = map;
        this.zzb = zzcexVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        if (TextUtils.isEmpty((CharSequence) this.zza.get(str))) {
            return "";
        }
        return (String) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra(MRAIDNativeFeatureProvider.EVENT_LOCATION, this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbbt(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze != null) {
            str = zze.getString(C16236R.C16240string.f36511s5);
        } else {
            str = "Create calendar event";
        }
        zzL.setTitle(str);
        if (zze != null) {
            str2 = zze.getString(C16236R.C16240string.f36512s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzL.setMessage(str2);
        if (zze != null) {
            str3 = zze.getString(C16236R.C16240string.f36509s3);
        } else {
            str3 = "Accept";
        }
        zzL.setPositiveButton(str3, new zzbrx(this));
        if (zze != null) {
            str4 = zze.getString(C16236R.C16240string.f36510s4);
        } else {
            str4 = "Decline";
        }
        zzL.setNegativeButton(str4, new zzbry(this));
        zzL.create().show();
    }
}
