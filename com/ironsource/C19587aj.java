package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.aj */
/* loaded from: classes6.dex */
public final class C19587aj {
    @NotNull

    /* renamed from: a */
    public static final C19587aj f49172a = new C19587aj();

    private C19587aj() {
    }

    /* renamed from: a */
    public static final <T> T m59442a(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: a */
    public static final boolean m59443a(@Nullable Object obj) {
        return m59439a(obj, null, false, 6, null);
    }

    /* renamed from: a */
    public static final boolean m59441a(@Nullable Object obj, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return m59439a(obj, errorMessage, false, 4, null);
    }

    /* renamed from: a */
    public static final boolean m59440a(@Nullable Object obj, @NotNull String errorMessage, boolean z) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new NullPointerException(errorMessage);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m59439a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m59440a(obj, str, z);
    }
}
