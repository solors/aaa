package com.mobilefuse.sdk.logging;

import com.mobilefuse.sdk.Debugging;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpRequestTracker.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpRequestTracker {
    private static boolean enabled;
    @NotNull
    public static final HttpRequestTracker INSTANCE = new HttpRequestTracker();
    private static final List<HttpRequestEvent> logs = new ArrayList();

    private HttpRequestTracker() {
    }

    public static final void clearLogs() {
        logs.clear();
    }

    public static final boolean getEnabled() {
        return enabled;
    }

    @NotNull
    public static final List<HttpRequestEvent> getLogs() {
        List<HttpRequestEvent> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(logs);
        return m17553Z0;
    }

    public static final void logHttpRequest(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!enabled) {
            return;
        }
        logs.add(new HttpRequestEvent(new Date(), url));
        String format = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
        HttpRequestTracker httpRequestTracker = INSTANCE;
        Debugging.logDebug(httpRequestTracker, "TimeStamp: " + format + " URL: " + url, "[HttpRequestTracker]");
    }

    public static final void setEnabled(boolean z) {
        enabled = z;
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    private static /* synthetic */ void getLogs$annotations() {
    }
}
