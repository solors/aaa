package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C16262R;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzhd {
    private final Resources zza;
    private final String zzb;

    public zzhd(Context context, @Nullable String str) {
        Preconditions.checkNotNull(context);
        this.zza = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.zzb = str;
        } else {
            this.zzb = zza(context);
        }
    }

    @Nullable
    public final String zza(String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.zza.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String zza(Context context) {
        try {
            return context.getResources().getResourcePackageName(C16262R.C16263string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
