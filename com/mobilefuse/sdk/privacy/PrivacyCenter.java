package com.mobilefuse.sdk.privacy;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.bidding.Partner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: PrivacyCenter.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PrivacyCenter {
    public static final boolean VENDOR_DEFAULT_ENABLEMENT_VALUE = true;
    @NotNull
    public static final PrivacyCenter INSTANCE = new PrivacyCenter();
    private static final Map<String, Boolean> vendorsEnableMap = new LinkedHashMap();

    private PrivacyCenter() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isDntLimitsUserData$mobilefuse_sdk_core_release$default(PrivacyCenter privacyCenter, Functions functions, int i, Object obj) {
        if ((i & 1) != 0) {
            functions = new PrivacyCenter$isDntLimitsUserData$1(privacyCenter);
        }
        return privacyCenter.isDntLimitsUserData$mobilefuse_sdk_core_release(functions);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isSdkLimitedToSendUserData(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Functions<java.lang.Boolean> r4) {
        /*
            java.lang.String r0 = "dntFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.mobilefuse.sdk.exception.ExceptionHandlingStrategy r0 = com.mobilefuse.sdk.exception.ExceptionHandlingStrategy.LogAndIgnore
            r1 = 1
            com.mobilefuse.sdk.privacy.PrivacyCenter r2 = com.mobilefuse.sdk.privacy.PrivacyCenter.INSTANCE     // Catch: java.lang.Throwable -> L24
            boolean r3 = r2.isIfaLmtLimitsUserData$mobilefuse_sdk_core_release()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L12
        L10:
            r4 = r1
            goto L1a
        L12:
            boolean r4 = r2.isDntLimitsUserData$mobilefuse_sdk_core_release(r4)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L19
            goto L10
        L19:
            r4 = 0
        L1a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            com.mobilefuse.sdk.exception.SuccessResult r2 = new com.mobilefuse.sdk.exception.SuccessResult     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            goto L3a
        L24:
            r4 = move-exception
            int[] r2 = com.mobilefuse.sdk.privacy.C23654x5c540169.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L30
            goto L35
        L30:
            java.lang.String r0 = "[Automatically caught]"
            com.mobilefuse.sdk.StabilityHelper.logException(r0, r4)
        L35:
            com.mobilefuse.sdk.exception.ErrorResult r2 = new com.mobilefuse.sdk.exception.ErrorResult
            r2.<init>(r4)
        L3a:
            boolean r4 = r2 instanceof com.mobilefuse.sdk.exception.ErrorResult
            if (r4 == 0) goto L49
            com.mobilefuse.sdk.exception.ErrorResult r2 = (com.mobilefuse.sdk.exception.ErrorResult) r2
            java.lang.Object r4 = r2.getValue()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L53
        L49:
            boolean r4 = r2 instanceof com.mobilefuse.sdk.exception.SuccessResult
            if (r4 == 0) goto L5a
            com.mobilefuse.sdk.exception.SuccessResult r2 = (com.mobilefuse.sdk.exception.SuccessResult) r2
            java.lang.Object r4 = r2.getValue()
        L53:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L5a:
            nd.o r4 = new nd.o
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.privacy.PrivacyCenter.isSdkLimitedToSendUserData(kotlin.jvm.functions.Function0):boolean");
    }

    public static /* synthetic */ boolean isSdkLimitedToSendUserData$default(Functions functions, int i, Object obj) {
        if ((i & 1) != 0) {
            functions = new PrivacyCenter$isSdkLimitedToSendUserData$1(INSTANCE);
        }
        return isSdkLimitedToSendUserData(functions);
    }

    public static final boolean isSdkLimitedToSendUserDataJavaLegacy() {
        return isSdkLimitedToSendUserData$default(null, 1, null);
    }

    public final void clearVendorsEnableMap$mobilefuse_sdk_core_release() {
        vendorsEnableMap.clear();
    }

    public final boolean isDntLimitsUserData$mobilefuse_sdk_core_release(@NotNull Functions<Boolean> factory) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(factory, "factory");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(Boolean.valueOf(factory.invoke().booleanValue()));
        } catch (Throwable th) {
            if (C23652x74460ec.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = Boolean.TRUE;
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean isIfaLmtLimitsUserData$mobilefuse_sdk_core_release() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(Boolean.valueOf(PrivacyCenterKt.ifaLmtFactory(INSTANCE)));
        } catch (Throwable th) {
            if (C23653xf5e764a5.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = Boolean.TRUE;
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean isVendorEnabled(@NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        return isVendorEnabled(partner.getVendorName());
    }

    public final void setVendorEnabled(@NotNull Partner partner, boolean z) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        setVendorEnabled(partner.getVendorName(), z);
    }

    public final boolean isVendorEnabled(@NotNull String vendor) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Boolean bool = vendorsEnableMap.get(vendor);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void setVendorEnabled(@NotNull String vendor, boolean z) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        vendorsEnableMap.put(vendor, Boolean.valueOf(z));
    }
}
