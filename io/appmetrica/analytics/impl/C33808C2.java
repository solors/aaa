package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
@TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.C2 */
/* loaded from: classes9.dex */
public final class C33808C2 {
    @NotNull

    /* renamed from: a */
    public static final C33808C2 f92665a = new C33808C2();

    private C33808C2() {
    }

    @NotNull
    /* renamed from: a */
    public static final C33883F2 m22744a(@NotNull Context context, @NotNull final C34496e2 c34496e2) {
        return new C33883F2((EnumC33858E2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.co
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C33808C2.m22742b(C34496e2.this, (UsageStatsManager) obj);
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.do
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C33808C2.m22741c((ActivityManager) obj);
            }
        }));
    }

    /* renamed from: b */
    public static /* synthetic */ EnumC33858E2 m22742b(C34496e2 c34496e2, UsageStatsManager usageStatsManager) {
        return m22743a(c34496e2, usageStatsManager);
    }

    /* renamed from: c */
    public static /* synthetic */ Boolean m22741c(ActivityManager activityManager) {
        return m22745a(activityManager);
    }

    /* renamed from: a */
    public static final EnumC33858E2 m22743a(C34496e2 c34496e2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c34496e2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC33858E2.RESTRICTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC33858E2.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return EnumC33858E2.WORKING_SET;
            }
            if (appStandbyBucket == 30) {
                return EnumC33858E2.FREQUENT;
            }
            if (appStandbyBucket == 40) {
                return EnumC33858E2.RARE;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final Boolean m22745a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
