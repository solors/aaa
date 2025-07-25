package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbcj implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    volatile boolean zza = false;
    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcg
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbcc zzbccVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbccVar.zzk();
            }
        }
        if (zzbccVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbccVar.zzk();
            }
            return zzbccVar.zzb(bundle);
        } else if (zzbccVar.zze() == 1 && this.zzh.has(zzbccVar.zzl())) {
            return zzbccVar.zza(this.zzh);
        } else {
            return zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbch
                {
                    zzbcj.this = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return zzbcj.this.zzc(zzbccVar);
                }
            });
        }
    }

    public final Object zzb(zzbcc zzbccVar) {
        if (!this.zzd && !this.zza) {
            return zzbccVar.zzk();
        }
        return zza(zzbccVar);
    }

    public final /* synthetic */ Object zzc(zzbcc zzbccVar) {
        return zzbccVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0113, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzbcf())).optBoolean("local_flags_enabled") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0119 A[Catch: all -> 0x0159, TRY_ENTER, TryCatch #2 {, blocks: (B:95:0x0008, B:97:0x000c, B:99:0x000e, B:101:0x0013, B:102:0x0015, B:104:0x0027, B:105:0x002b, B:106:0x002d, B:126:0x0097, B:127:0x009e, B:136:0x00cd, B:137:0x00d4, B:151:0x0119, B:152:0x0120, B:160:0x0147, B:161:0x014e, B:108:0x0042, B:111:0x004c, B:115:0x0055, B:118:0x0060, B:119:0x0068, B:121:0x006e, B:123:0x007e, B:125:0x0093, B:129:0x00a0, B:131:0x00a4, B:133:0x00b4, B:135:0x00c9, B:139:0x00d6, B:149:0x0115, B:154:0x0122, B:156:0x0139, B:158:0x013d, B:159:0x0140, B:142:0x00e7, B:144:0x00f5, B:146:0x00fd, B:147:0x0108), top: B:173:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0122 A[Catch: all -> 0x0150, TRY_ENTER, TryCatch #2 {, blocks: (B:95:0x0008, B:97:0x000c, B:99:0x000e, B:101:0x0013, B:102:0x0015, B:104:0x0027, B:105:0x002b, B:106:0x002d, B:126:0x0097, B:127:0x009e, B:136:0x00cd, B:137:0x00d4, B:151:0x0119, B:152:0x0120, B:160:0x0147, B:161:0x014e, B:108:0x0042, B:111:0x004c, B:115:0x0055, B:118:0x0060, B:119:0x0068, B:121:0x006e, B:123:0x007e, B:125:0x0093, B:129:0x00a0, B:131:0x00a4, B:133:0x00b4, B:135:0x00c9, B:139:0x00d6, B:149:0x0115, B:154:0x0122, B:156:0x0139, B:158:0x013d, B:159:0x0140, B:142:0x00e7, B:144:0x00f5, B:146:0x00fd, B:147:0x0108), top: B:173:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcj.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
