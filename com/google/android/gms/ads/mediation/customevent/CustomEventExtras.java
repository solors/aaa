package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@Deprecated
/* loaded from: classes4.dex */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.zza.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.zza.put(str, obj);
    }
}
