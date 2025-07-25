package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.R4 */
/* loaded from: classes6.dex */
public class C19082R4 extends AbstractC19532y1 {

    /* renamed from: e */
    public final String f47658e;

    /* renamed from: f */
    public final String f47659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19082R4(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f47658e = eventId;
        this.f47659f = componentType;
    }

    public final String toString() {
        return this.f48921a + '@' + this.f47659f + ' ';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19082R4(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19082R4.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
