package com.mobilefuse.sdk.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class NativeEventTracker {
    @NotNull
    private final NativeEventTrackerType event;
    private final int method;
    @NotNull
    private final String url;

    public NativeEventTracker(@NotNull NativeEventTrackerType event, int i, @NotNull String url) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        this.event = event;
        this.method = i;
        this.url = url;
    }

    public static /* synthetic */ NativeEventTracker copy$default(NativeEventTracker nativeEventTracker, NativeEventTrackerType nativeEventTrackerType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nativeEventTrackerType = nativeEventTracker.event;
        }
        if ((i2 & 2) != 0) {
            i = nativeEventTracker.method;
        }
        if ((i2 & 4) != 0) {
            str = nativeEventTracker.url;
        }
        return nativeEventTracker.copy(nativeEventTrackerType, i, str);
    }

    @NotNull
    public final NativeEventTrackerType component1() {
        return this.event;
    }

    public final int component2() {
        return this.method;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final NativeEventTracker copy(@NotNull NativeEventTrackerType event, int i, @NotNull String url) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        return new NativeEventTracker(event, i, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NativeEventTracker) {
                NativeEventTracker nativeEventTracker = (NativeEventTracker) obj;
                if (!Intrinsics.m17075f(this.event, nativeEventTracker.event) || this.method != nativeEventTracker.method || !Intrinsics.m17075f(this.url, nativeEventTracker.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final NativeEventTrackerType getEvent() {
        return this.event;
    }

    public final int getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        NativeEventTrackerType nativeEventTrackerType = this.event;
        int i2 = 0;
        if (nativeEventTrackerType != null) {
            i = nativeEventTrackerType.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + Integer.hashCode(this.method)) * 31;
        String str = this.url;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public String toString() {
        return "NativeEventTracker(event=" + this.event + ", method=" + this.method + ", url=" + this.url + ")";
    }
}
