package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public final class zzan implements zzd {
    private final Application zza;
    private final zzap zzb;
    private final Executor zzc;

    public zzan(Application application, zzap zzapVar, Executor executor) {
        this.zza = application;
        this.zzb = zzapVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(UserMetadata.KEYDATA_FILENAME);
            if (optJSONArray != null && optJSONArray.length() != 0) {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                    } else {
                        hashSet.add(optString);
                    }
                }
                zzco.zzb(this.zza, hashSet);
            } else {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            }
            return true;
        }
        zzcn zzcnVar = new zzcn(this.zza);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            if (zzcnVar.zzc(next, opt)) {
                this.zzb.zzd().add(next);
            } else {
                Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
            }
        }
        this.zzb.zzf();
        zzcnVar.zzb();
        return true;
    }
}
