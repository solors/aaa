package com.mobilefuse.sdk.telemetry.implementations.sentry;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SentryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SentryEvent {
    @Nullable
    private final SentryDataModel breadcrumbs;
    @Nullable
    private final String culprit;
    @NotNull
    private final String eventId;
    @NotNull
    private final SentryException exception;
    @NotNull
    private final Map<String, String> extra;
    @NotNull
    private final String message;
    @NotNull
    private final Map<String, String> modules;
    @NotNull
    private final String platform;
    @Nullable
    private final String release;
    private final long timestamp;

    public SentryEvent(@NotNull String message, @NotNull SentryException exception, @NotNull Map<String, String> modules, @NotNull Map<String, String> extra, @Nullable String str, @Nullable String str2, @Nullable SentryDataModel sentryDataModel, @NotNull String platform, long j, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.message = message;
        this.exception = exception;
        this.modules = modules;
        this.extra = extra;
        this.release = str;
        this.culprit = str2;
        this.breadcrumbs = sentryDataModel;
        this.platform = platform;
        this.timestamp = j;
        this.eventId = eventId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SentryEvent copy$default(SentryEvent sentryEvent, String str, SentryException sentryException, Map map, Map map2, String str2, String str3, SentryDataModel sentryDataModel, String str4, long j, String str5, int i, Object obj) {
        String str6;
        SentryException sentryException2;
        Map<String, String> map3;
        Map<String, String> map4;
        String str7;
        String str8;
        SentryDataModel sentryDataModel2;
        String str9;
        long j2;
        String str10;
        if ((i & 1) != 0) {
            str6 = sentryEvent.message;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            sentryException2 = sentryEvent.exception;
        } else {
            sentryException2 = sentryException;
        }
        if ((i & 4) != 0) {
            map3 = sentryEvent.modules;
        } else {
            map3 = map;
        }
        if ((i & 8) != 0) {
            map4 = sentryEvent.extra;
        } else {
            map4 = map2;
        }
        if ((i & 16) != 0) {
            str7 = sentryEvent.release;
        } else {
            str7 = str2;
        }
        if ((i & 32) != 0) {
            str8 = sentryEvent.culprit;
        } else {
            str8 = str3;
        }
        if ((i & 64) != 0) {
            sentryDataModel2 = sentryEvent.breadcrumbs;
        } else {
            sentryDataModel2 = sentryDataModel;
        }
        if ((i & 128) != 0) {
            str9 = sentryEvent.platform;
        } else {
            str9 = str4;
        }
        if ((i & 256) != 0) {
            j2 = sentryEvent.timestamp;
        } else {
            j2 = j;
        }
        if ((i & 512) != 0) {
            str10 = sentryEvent.eventId;
        } else {
            str10 = str5;
        }
        return sentryEvent.copy(str6, sentryException2, map3, map4, str7, str8, sentryDataModel2, str9, j2, str10);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final String component10() {
        return this.eventId;
    }

    @NotNull
    public final SentryException component2() {
        return this.exception;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.modules;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.extra;
    }

    @Nullable
    public final String component5() {
        return this.release;
    }

    @Nullable
    public final String component6() {
        return this.culprit;
    }

    @Nullable
    public final SentryDataModel component7() {
        return this.breadcrumbs;
    }

    @NotNull
    public final String component8() {
        return this.platform;
    }

    public final long component9() {
        return this.timestamp;
    }

    @NotNull
    public final SentryEvent copy(@NotNull String message, @NotNull SentryException exception, @NotNull Map<String, String> modules, @NotNull Map<String, String> extra, @Nullable String str, @Nullable String str2, @Nullable SentryDataModel sentryDataModel, @NotNull String platform, long j, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new SentryEvent(message, exception, modules, extra, str, str2, sentryDataModel, platform, j, eventId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SentryEvent) {
                SentryEvent sentryEvent = (SentryEvent) obj;
                if (!Intrinsics.m17075f(this.message, sentryEvent.message) || !Intrinsics.m17075f(this.exception, sentryEvent.exception) || !Intrinsics.m17075f(this.modules, sentryEvent.modules) || !Intrinsics.m17075f(this.extra, sentryEvent.extra) || !Intrinsics.m17075f(this.release, sentryEvent.release) || !Intrinsics.m17075f(this.culprit, sentryEvent.culprit) || !Intrinsics.m17075f(this.breadcrumbs, sentryEvent.breadcrumbs) || !Intrinsics.m17075f(this.platform, sentryEvent.platform) || this.timestamp != sentryEvent.timestamp || !Intrinsics.m17075f(this.eventId, sentryEvent.eventId)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final SentryDataModel getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @Nullable
    public final String getCulprit() {
        return this.culprit;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final SentryException getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> getModules() {
        return this.modules;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getRelease() {
        return this.release;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.message;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        SentryException sentryException = this.exception;
        if (sentryException != null) {
            i2 = sentryException.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        Map<String, String> map = this.modules;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Map<String, String> map2 = this.extra;
        if (map2 != null) {
            i4 = map2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str2 = this.release;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str3 = this.culprit;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        SentryDataModel sentryDataModel = this.breadcrumbs;
        if (sentryDataModel != null) {
            i7 = sentryDataModel.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        String str4 = this.platform;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode = (((i16 + i8) * 31) + Long.hashCode(this.timestamp)) * 31;
        String str5 = this.eventId;
        if (str5 != null) {
            i9 = str5.hashCode();
        }
        return hashCode + i9;
    }

    @NotNull
    public String toString() {
        return "SentryEvent(message=" + this.message + ", exception=" + this.exception + ", modules=" + this.modules + ", extra=" + this.extra + ", release=" + this.release + ", culprit=" + this.culprit + ", breadcrumbs=" + this.breadcrumbs + ", platform=" + this.platform + ", timestamp=" + this.timestamp + ", eventId=" + this.eventId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SentryEvent(java.lang.String r15, com.mobilefuse.sdk.telemetry.implementations.sentry.SentryException r16, java.util.Map r17, java.util.Map r18, java.lang.String r19, java.lang.String r20, com.mobilefuse.sdk.telemetry.implementations.sentry.SentryDataModel r21, java.lang.String r22, long r23, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto Lc
            java.util.Map r1 = kotlin.collections.C37554o0.m17366j()
            r5 = r1
            goto Le
        Lc:
            r5 = r17
        Le:
            r1 = r0 & 8
            if (r1 == 0) goto L18
            java.util.Map r1 = kotlin.collections.C37554o0.m17366j()
            r6 = r1
            goto L1a
        L18:
            r6 = r18
        L1a:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L21
            r7 = r2
            goto L23
        L21:
            r7 = r19
        L23:
            r1 = r0 & 32
            if (r1 == 0) goto L29
            r8 = r2
            goto L2b
        L29:
            r8 = r20
        L2b:
            r1 = r0 & 64
            if (r1 == 0) goto L31
            r9 = r2
            goto L33
        L31:
            r9 = r21
        L33:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3b
            java.lang.String r1 = "java"
            r10 = r1
            goto L3d
        L3b:
            r10 = r22
        L3d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4b
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 / r3
            r11 = r1
            goto L4d
        L4b:
            r11 = r23
        L4d:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L77
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r13 = 0
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r13
            java.lang.String r0 = kotlin.text.C37686h.m16718I(r17, r18, r19, r20, r21, r22)
            r13 = r0
            goto L79
        L77:
            r13 = r25
        L79:
            r2 = r14
            r3 = r15
            r4 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.telemetry.implementations.sentry.SentryEvent.<init>(java.lang.String, com.mobilefuse.sdk.telemetry.implementations.sentry.SentryException, java.util.Map, java.util.Map, java.lang.String, java.lang.String, com.mobilefuse.sdk.telemetry.implementations.sentry.SentryBreadcrumbs, java.lang.String, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
