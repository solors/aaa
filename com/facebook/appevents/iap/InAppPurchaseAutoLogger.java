package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InAppPurchaseAutoLogger.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class InAppPurchaseAutoLogger {
    @NotNull
    private static final String BILLING_CLIENT_PURCHASE_NAME = "com.android.billingclient.api.Purchase";
    @NotNull
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InAppPurchaseLoggerManager inAppPurchaseLoggerManager = InAppPurchaseLoggerManager.INSTANCE;
            InAppPurchaseBillingClientWrapper.Companion companion = InAppPurchaseBillingClientWrapper.Companion;
            InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getPurchaseDetailsMap(), companion.getSkuDetailsMap());
            companion.getPurchaseDetailsMap().clear();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void startIapLogging(@NotNull Context context) {
        InAppPurchaseBillingClientWrapper.Companion companion;
        InAppPurchaseBillingClientWrapper orCreateInstance;
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (InAppPurchaseUtils.getClass(BILLING_CLIENT_PURCHASE_NAME) != null && (orCreateInstance = (companion = InAppPurchaseBillingClientWrapper.Companion).getOrCreateInstance(context)) != null && companion.isServiceConnected().get()) {
                if (InAppPurchaseLoggerManager.eligibleQueryPurchaseHistory()) {
                    orCreateInstance.queryPurchaseHistory("inapp", new Runnable() { // from class: com.facebook.appevents.iap.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            InAppPurchaseAutoLogger.m110084startIapLogging$lambda0();
                        }
                    });
                } else {
                    orCreateInstance.queryPurchase("inapp", new Runnable() { // from class: com.facebook.appevents.iap.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            InAppPurchaseAutoLogger.m110085startIapLogging$lambda1();
                        }
                    });
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* renamed from: startIapLogging$lambda-0 */
    public static final void m110084startIapLogging$lambda0() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            INSTANCE.logPurchase();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* renamed from: startIapLogging$lambda-1 */
    public static final void m110085startIapLogging$lambda1() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            INSTANCE.logPurchase();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }
}
