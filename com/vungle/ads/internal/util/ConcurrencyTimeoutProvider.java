package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.util.e */
/* loaded from: classes7.dex */
public final class ConcurrencyTimeoutProvider {
    @NotNull
    public static final C29510a Companion = new C29510a(null);
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    /* compiled from: ConcurrencyTimeoutProvider.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.e$a */
    /* loaded from: classes7.dex */
    public static final class C29510a {
        private C29510a() {
        }

        public /* synthetic */ C29510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getTimeout() {
        if (ThreadUtil.INSTANCE.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
