package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Fb */
/* loaded from: classes6.dex */
public final class C18927Fb {

    /* renamed from: a */
    public final byte f47243a;

    /* renamed from: b */
    public HashMap f47244b = new LinkedHashMap();

    public C18927Fb(byte b) {
        this.f47243a = b;
    }

    /* renamed from: a */
    public final Object m61115a(String key, Class classType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(classType, "classType");
        Object obj = this.f47244b.get(key);
        if (classType.isInstance(obj)) {
            return classType.cast(obj);
        }
        return null;
    }
}
