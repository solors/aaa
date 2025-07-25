package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata
@TargetApi(29)
/* renamed from: io.appmetrica.analytics.impl.tk */
/* loaded from: classes9.dex */
public final class C34916tk {
    @NotNull

    /* renamed from: a */
    public static final C34916tk f95418a = new C34916tk();

    private C34916tk() {
    }

    @Nullable
    /* renamed from: a */
    public static final Integer m20939a(@NotNull SubscriptionInfo subscriptionInfo) {
        String mccString;
        mccString = subscriptionInfo.getMccString();
        return ParseUtils.intValueOf(mccString);
    }

    @Nullable
    /* renamed from: b */
    public static final Integer m20938b(@NotNull SubscriptionInfo subscriptionInfo) {
        String mncString;
        mncString = subscriptionInfo.getMncString();
        return ParseUtils.intValueOf(mncString);
    }
}
