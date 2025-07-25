package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.sk */
/* loaded from: classes9.dex */
public final class C34890sk {
    @NotNull

    /* renamed from: a */
    public static final C34890sk f95336a = new C34890sk();

    private C34890sk() {
    }

    @NotNull
    /* renamed from: a */
    public static final List<C34730mk> m20971a(@NotNull Context context) {
        List<C34730mk> m17166m;
        int m17154x;
        Integer valueOf;
        Integer valueOf2;
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.jp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                List m20970a;
                m20970a = C34890sk.m20970a((SubscriptionManager) obj);
                return m20970a;
            }
        });
        if (list != null) {
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (SubscriptionInfo subscriptionInfo : list) {
                if (AndroidUtils.isApiAchieved(29)) {
                    valueOf = C34916tk.m20939a(subscriptionInfo);
                } else {
                    valueOf = Integer.valueOf(subscriptionInfo.getMcc());
                }
                if (AndroidUtils.isApiAchieved(29)) {
                    valueOf2 = C34916tk.m20938b(subscriptionInfo);
                } else {
                    valueOf2 = Integer.valueOf(subscriptionInfo.getMnc());
                }
                boolean z = subscriptionInfo.getDataRoaming() == 1;
                CharSequence carrierName = subscriptionInfo.getCarrierName();
                arrayList.add(new C34730mk(valueOf, valueOf2, z, carrierName != null ? carrierName.toString() : null));
            }
            return arrayList;
        }
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    /* renamed from: a */
    public static final List m20970a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
