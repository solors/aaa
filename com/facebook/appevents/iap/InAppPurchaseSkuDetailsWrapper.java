package com.facebook.appevents.iap;

import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class InAppPurchaseSkuDetailsWrapper {
    @NotNull
    private static final String CLASSNAME_SKU_DETAILS_PARAMS = "com.android.billingclient.api.SkuDetailsParams";
    @NotNull
    private static final String CLASSNAME_SKU_DETAILS_PARAMS_BUILDER = "com.android.billingclient.api.SkuDetailsParams$Builder";
    @NotNull
    private static final String METHOD_BUILD = "build";
    @NotNull
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    @NotNull
    private static final String METHOD_SET_SKU_LIST = "setSkusList";
    @NotNull
    private static final String METHOD_SET_TYPE = "setType";
    @Nullable
    private static InAppPurchaseSkuDetailsWrapper instance;
    @NotNull
    private final Method buildMethod;
    @NotNull
    private final Class<?> builderClazz;
    @NotNull
    private final Method newBuilderMethod;
    @NotNull
    private final Method setSkusListMethod;
    @NotNull
    private final Method setTypeMethod;
    @NotNull
    private final Class<?> skuDetailsParamsClazz;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void createInstance() {
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS_BUILDER);
            if (cls != null && cls2 != null) {
                Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseSkuDetailsWrapper.METHOD_NEW_BUILDER, new Class[0]);
                Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_TYPE, String.class);
                Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_SKU_LIST, List.class);
                Method method4 = InAppPurchaseUtils.getMethod(cls2, "build", new Class[0]);
                if (method != null && method2 != null && method3 != null && method4 != null) {
                    InAppPurchaseSkuDetailsWrapper.access$setInstance$cp(new InAppPurchaseSkuDetailsWrapper(cls, cls2, method, method2, method3, method4));
                }
            }
        }

        @Nullable
        public final InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            if (InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().get()) {
                return InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
            }
            createInstance();
            InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().set(true);
            return InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
        }
    }

    public InAppPurchaseSkuDetailsWrapper(@NotNull Class<?> skuDetailsParamsClazz, @NotNull Class<?> builderClazz, @NotNull Method newBuilderMethod, @NotNull Method setTypeMethod, @NotNull Method setSkusListMethod, @NotNull Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.skuDetailsParamsClazz = skuDetailsParamsClazz;
        this.builderClazz = builderClazz;
        this.newBuilderMethod = newBuilderMethod;
        this.setTypeMethod = setTypeMethod;
        this.setSkusListMethod = setSkusListMethod;
        this.buildMethod = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean access$getInitialized$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseSkuDetailsWrapper access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return;
        }
        try {
            instance = inAppPurchaseSkuDetailsWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
        }
    }

    @Nullable
    public static final InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return Companion.getOrCreateInstance();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    @Nullable
    public final Object getSkuDetailsParams(@Nullable String str, @Nullable List<String> list) {
        Object invokeMethod;
        Object invokeMethod2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
            if (invokeMethod3 != null && (invokeMethod = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod3, str)) != null && (invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod, list)) != null) {
                return InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod2, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @NotNull
    public final Class<?> getSkuDetailsParamsClazz() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
