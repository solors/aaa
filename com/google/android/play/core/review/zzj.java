package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzj {

    /* renamed from: a */
    private static final Set f39275a = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: b */
    private static final Map f39276b = new HashMap();

    /* renamed from: c */
    private static final com.google.android.play.core.review.internal.zzi f39277c = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");

    public static Bundle zza() {
        Bundle bundle = new Bundle();
        Map zzb = zzb();
        bundle.putInt("playcore_version_code", ((Integer) zzb.get("java")).intValue());
        if (zzb.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) zzb.get("native")).intValue());
        }
        if (zzb.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) zzb.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map zzb() {
        Map map;
        synchronized (zzj.class) {
            map = f39276b;
            map.put("java", 11004);
        }
        return map;
    }
}
