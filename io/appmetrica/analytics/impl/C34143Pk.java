package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Pk */
/* loaded from: classes9.dex */
public final class C34143Pk extends HashMap {
    public C34143Pk() {
        put(EnumC34095Nk.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC34095Nk.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC34095Nk.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
