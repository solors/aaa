package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes4.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    @NonNull
    private final String zza;
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Scope {
    }

    public AppSetIdInfo(@NonNull String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}
