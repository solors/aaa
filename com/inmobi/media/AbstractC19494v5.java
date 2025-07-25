package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v5 */
/* loaded from: classes6.dex */
public abstract class AbstractC19494v5 {
    /* renamed from: a */
    public static C19508w5 m59823a(Context context, String fileKey) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        String str = "com.im.keyValueStore." + fileKey;
        concurrentHashMap = C19508w5.f48819b;
        C19508w5 c19508w5 = (C19508w5) concurrentHashMap.get(str);
        if (c19508w5 == null) {
            C19508w5 c19508w52 = new C19508w5(context, str);
            concurrentHashMap2 = C19508w5.f48819b;
            C19508w5 c19508w53 = (C19508w5) concurrentHashMap2.putIfAbsent(str, c19508w52);
            if (c19508w53 != null) {
                return c19508w53;
            }
            return c19508w52;
        }
        return c19508w5;
    }
}
