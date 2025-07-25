package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class qw0 {
    @NotNull

    /* renamed from: a */
    private final Context f84567a;

    /* renamed from: com.yandex.mobile.ads.impl.qw0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C31242a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84568a;

        static {
            int[] iArr = new int[pw0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84568a = iArr;
        }
    }

    public qw0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84567a = context;
    }

    @Nullable
    /* renamed from: a */
    public final String m30203a(@Nullable pw0 pw0Var) {
        int i;
        if (pw0Var == null) {
            i = -1;
        } else {
            i = C31242a.f84568a[pw0Var.ordinal()];
        }
        if (i != -1) {
            if (i == 1) {
                return this.f84567a.getString(C29880R.C29886string.invalid_mediation_adapter_version);
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
