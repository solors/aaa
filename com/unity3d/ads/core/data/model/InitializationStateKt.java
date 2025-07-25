package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: InitializationState.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializationStateKt {

    /* compiled from: InitializationState.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final InitializationState toBold(@NotNull SdkProperties.InitializationState initializationState) {
        Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return InitializationState.FAILED;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return InitializationState.INITIALIZED;
            }
            return InitializationState.INITIALIZING;
        }
        return InitializationState.NOT_INITIALIZED;
    }

    @NotNull
    public static final SdkProperties.InitializationState toLegacy(@NotNull InitializationState initializationState) {
        Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return SdkProperties.InitializationState.INITIALIZED_FAILED;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
            }
            return SdkProperties.InitializationState.INITIALIZING;
        }
        return SdkProperties.InitializationState.NOT_INITIALIZED;
    }
}
