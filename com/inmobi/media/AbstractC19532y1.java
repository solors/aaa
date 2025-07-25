package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y1 */
/* loaded from: classes6.dex */
public abstract class AbstractC19532y1 {

    /* renamed from: a */
    public String f48921a;

    /* renamed from: b */
    public long f48922b;

    /* renamed from: c */
    public int f48923c;

    /* renamed from: d */
    public String f48924d;

    public AbstractC19532y1(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f48921a = eventType;
        this.f48924d = str;
        this.f48922b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String m59562a() {
        String str = this.f48924d;
        if (str == null) {
            return "";
        }
        return str;
    }
}
