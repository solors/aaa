package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hc0 {
    @NotNull

    /* renamed from: a */
    private final ak1 f80031a;
    @NotNull

    /* renamed from: b */
    private final C29928ac f80032b;
    @NotNull

    /* renamed from: c */
    private final Context f80033c;

    public /* synthetic */ hc0(Context context) {
        this(context, new ak1(), new C29928ac());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x0012
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    public final com.yandex.mobile.ads.impl.C31967zb m33578a() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            com.yandex.mobile.ads.impl.ak1 r2 = r7.f80031a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            r2.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)     // Catch: java.lang.Throwable -> L57
            r2 = 1
            java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
            goto L1a
        L12:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            r4[r0] = r3     // Catch: java.lang.Throwable -> L57
            com.yandex.mobile.ads.impl.um0.m28726c(r4)     // Catch: java.lang.Throwable -> L57
            r3 = r1
        L1a:
            if (r3 == 0) goto L5c
            com.yandex.mobile.ads.impl.ak1 r4 = r7.f80031a     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "getAdvertisingIdInfo"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            android.content.Context r6 = r7.f80033c     // Catch: java.lang.Throwable -> L57
            r2[r0] = r6     // Catch: java.lang.Throwable -> L57
            r4.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = com.yandex.mobile.ads.impl.ak1.m35842a(r3, r5, r2)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L5c
            java.lang.String r3 = "getId"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = com.yandex.mobile.ads.impl.ak1.C29944a.m35839a(r2, r3, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "isLimitAdTrackingEnabled"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = com.yandex.mobile.ads.impl.ak1.C29944a.m35839a(r2, r4, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L57
            com.yandex.mobile.ads.impl.ac r4 = r7.f80032b     // Catch: java.lang.Throwable -> L57
            r4.getClass()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L5c
            if (r3 == 0) goto L5c
            com.yandex.mobile.ads.impl.zb r4 = new com.yandex.mobile.ads.impl.zb     // Catch: java.lang.Throwable -> L57
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L57
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L57
            r1 = r4
            goto L5c
        L57:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.yandex.mobile.ads.impl.um0.m28726c(r0)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hc0.m33578a():com.yandex.mobile.ads.impl.zb");
    }

    public hc0(@NotNull Context context, @NotNull ak1 reflectHelper, @NotNull C29928ac advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f80031a = reflectHelper;
        this.f80032b = advertisingInfoCreator;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f80033c = applicationContext;
    }
}
