package com.smaato.sdk.richmedia.mraid.bridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.util.DeviceUtils;

/* renamed from: com.smaato.sdk.richmedia.mraid.bridge.t */
/* loaded from: classes7.dex */
final class PropertiesUtils {

    /* compiled from: PropertiesUtils.java */
    /* renamed from: com.smaato.sdk.richmedia.mraid.bridge.t$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27533a {

        /* renamed from: a */
        static final /* synthetic */ int[] f72287a;

        /* renamed from: b */
        static final /* synthetic */ int[] f72288b;

        /* renamed from: c */
        static final /* synthetic */ int[] f72289c;

        static {
            int[] iArr = new int[MraidStateMachineFactory.State.values().length];
            f72289c = iArr;
            try {
                iArr[MraidStateMachineFactory.State.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72289c[MraidStateMachineFactory.State.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72289c[MraidStateMachineFactory.State.RESIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72289c[MraidStateMachineFactory.State.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72289c[MraidStateMachineFactory.State.LOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[DeviceUtils.ScreenOrientation.values().length];
            f72288b = iArr2;
            try {
                iArr2[DeviceUtils.ScreenOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72288b[DeviceUtils.ScreenOrientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72288b[DeviceUtils.ScreenOrientation.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[PlacementType.values().length];
            f72287a = iArr3;
            try {
                iArr3[PlacementType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f72287a[PlacementType.INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static String m39092a(@NonNull PlacementType placementType) {
        int i = C27533a.f72287a[placementType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "inline";
            }
            throw new IllegalArgumentException("Unknown placement type: " + placementType);
        }
        return "interstitial";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public static String m39091b(@NonNull DeviceUtils.ScreenOrientation screenOrientation) {
        int i = C27533a.f72288b[screenOrientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public static String m39090c(@NonNull MraidStateMachineFactory.State state) {
        int i = C27533a.f72289c[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "loading";
                        }
                        throw new IllegalArgumentException("Unknown state: " + state);
                    }
                    return "default";
                }
                return "resized";
            }
            return "expanded";
        }
        return "hidden";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public static DeviceUtils.ScreenOrientation m39089d(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return DeviceUtils.ScreenOrientation.UNKNOWN;
        }
        str.hashCode();
        if (!str.equals("portrait")) {
            if (!str.equals("landscape")) {
                return DeviceUtils.ScreenOrientation.UNKNOWN;
            }
            return DeviceUtils.ScreenOrientation.LANDSCAPE;
        }
        return DeviceUtils.ScreenOrientation.PORTRAIT;
    }
}
