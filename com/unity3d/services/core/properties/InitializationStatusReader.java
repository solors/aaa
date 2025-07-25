package com.unity3d.services.core.properties;

import com.unity3d.services.core.properties.SdkProperties;

/* loaded from: classes7.dex */
public class InitializationStatusReader {
    private static final String STATE_INITIALIZED_FAILED = "initialized_failed";
    private static final String STATE_INITIALIZED_SUCCESSFULLY = "initialized_successfully";
    private static final String STATE_INITIALIZING = "initializing";
    private static final String STATE_NOT_INITIALIZED = "not_initialized";

    /* renamed from: com.unity3d.services.core.properties.InitializationStatusReader$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C290451 {

        /* renamed from: $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState */
        static final /* synthetic */ int[] f74988xe3e1bbe9;

        static {
            int[] iArr = new int[SdkProperties.InitializationState.values().length];
            f74988xe3e1bbe9 = iArr;
            try {
                iArr[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74988xe3e1bbe9[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74988xe3e1bbe9[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74988xe3e1bbe9[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String getInitializationStateString(SdkProperties.InitializationState initializationState) {
        int i = C290451.f74988xe3e1bbe9[initializationState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return STATE_INITIALIZED_FAILED;
                }
                return STATE_INITIALIZED_SUCCESSFULLY;
            }
            return STATE_INITIALIZING;
        }
        return "not_initialized";
    }
}
