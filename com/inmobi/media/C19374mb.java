package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mb */
/* loaded from: classes6.dex */
public final class C19374mb extends AbstractC19532y1 {

    /* renamed from: e */
    public final String f48516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19374mb(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.f48516e = eventSource;
    }

    public final String toString() {
        return this.f48921a + ' ';
    }
}
