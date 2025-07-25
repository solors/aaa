package com.mobilefuse.sdk.logging;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestTracker.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpRequestEvent {
    @NotNull
    private final Date timeStamp;
    @NotNull
    private final String url;

    public HttpRequestEvent(@NotNull Date timeStamp, @NotNull String url) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(url, "url");
        this.timeStamp = timeStamp;
        this.url = url;
    }

    public static /* synthetic */ HttpRequestEvent copy$default(HttpRequestEvent httpRequestEvent, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = httpRequestEvent.timeStamp;
        }
        if ((i & 2) != 0) {
            str = httpRequestEvent.url;
        }
        return httpRequestEvent.copy(date, str);
    }

    @NotNull
    public final Date component1() {
        return this.timeStamp;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final HttpRequestEvent copy(@NotNull Date timeStamp, @NotNull String url) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpRequestEvent(timeStamp, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof HttpRequestEvent) {
                HttpRequestEvent httpRequestEvent = (HttpRequestEvent) obj;
                if (!Intrinsics.m17075f(this.timeStamp, httpRequestEvent.timeStamp) || !Intrinsics.m17075f(this.url, httpRequestEvent.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        Date date = this.timeStamp;
        int i2 = 0;
        if (date != null) {
            i = date.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.url;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "HttpRequestEvent(timeStamp=" + this.timeStamp + ", url=" + this.url + ")";
    }
}
