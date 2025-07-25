package com.mobilefuse.sdk.device;

import kotlin.Metadata;

@Metadata
/* renamed from: com.mobilefuse.sdk.device.GetLastKnownLocationDataKt */
/* loaded from: classes7.dex */
public final class GetLastKnownLocationData {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0003, B:6:0x000a, B:8:0x0018, B:11:0x001f, B:13:0x002a, B:17:0x003b, B:16:0x0036), top: B:35:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.mobilefuse.sdk.device.LocationData getLastKnownLocationData() {
        /*
            com.mobilefuse.sdk.exception.ExceptionHandlingStrategy r0 = com.mobilefuse.sdk.exception.ExceptionHandlingStrategy.LogAndIgnore
            r1 = 0
            android.location.Location r2 = com.mobilefuse.sdk.LocationService.getLastKnownLocation()     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto La
            return r1
        La:
            java.lang.String r3 = "LocationService.getLastK…Location() ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L68
            float r3 = r2.getAccuracy()     // Catch: java.lang.Throwable -> L68
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L29
            boolean r4 = java.lang.Float.isNaN(r3)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L1f
            goto L29
        L1f:
            int r3 = be.C3396a.m103797d(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L68
            r9 = r3
            goto L2a
        L29:
            r9 = r1
        L2a:
            double r3 = r2.getAltitude()     // Catch: java.lang.Throwable -> L68
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L36
            r8 = r1
            goto L3b
        L36:
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> L68
            r8 = r3
        L3b:
            com.mobilefuse.sdk.device.LocationData r11 = new com.mobilefuse.sdk.device.LocationData     // Catch: java.lang.Throwable -> L68
            double r4 = r2.getLatitude()     // Catch: java.lang.Throwable -> L68
            double r6 = r2.getLongitude()     // Catch: java.lang.Throwable -> L68
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L68
            long r2 = r2.getElapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L68
            r10 = 1000000(0xf4240, float:1.401298E-39)
            long r14 = (long) r10     // Catch: java.lang.Throwable -> L68
            long r2 = r2 / r14
            long r12 = r12 - r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L68
            long r12 = r12 / r2
            r2 = 0
            long r2 = java.lang.Math.max(r2, r12)     // Catch: java.lang.Throwable -> L68
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L68
            r3 = r11
            r3.<init>(r4, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L68
            com.mobilefuse.sdk.exception.SuccessResult r2 = new com.mobilefuse.sdk.exception.SuccessResult     // Catch: java.lang.Throwable -> L68
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L68
            goto L80
        L68:
            r2 = move-exception
            int[] r3 = com.mobilefuse.sdk.exception.TryKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L75
            goto L7a
        L75:
            java.lang.String r0 = "[Automatically caught]"
            com.mobilefuse.sdk.StabilityHelper.logException(r0, r2)
        L7a:
            com.mobilefuse.sdk.exception.ErrorResult r0 = new com.mobilefuse.sdk.exception.ErrorResult
            r0.<init>(r2)
            r2 = r0
        L80:
            boolean r0 = r2 instanceof com.mobilefuse.sdk.exception.ErrorResult
            if (r0 == 0) goto L8e
            com.mobilefuse.sdk.exception.ErrorResult r2 = (com.mobilefuse.sdk.exception.ErrorResult) r2
            java.lang.Object r0 = r2.getValue()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L98
        L8e:
            boolean r0 = r2 instanceof com.mobilefuse.sdk.exception.SuccessResult
            if (r0 == 0) goto L9b
            com.mobilefuse.sdk.exception.SuccessResult r2 = (com.mobilefuse.sdk.exception.SuccessResult) r2
            java.lang.Object r1 = r2.getValue()
        L98:
            com.mobilefuse.sdk.device.LocationData r1 = (com.mobilefuse.sdk.device.LocationData) r1
            return r1
        L9b:
            nd.o r0 = new nd.o
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.device.GetLastKnownLocationData.getLastKnownLocationData():com.mobilefuse.sdk.device.LocationData");
    }
}
