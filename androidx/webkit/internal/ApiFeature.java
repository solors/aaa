package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {
    private static final Set<ApiFeature> sValues = new HashSet();
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class LAZY_HOLDER {
        static final Set<String> WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));

        private LAZY_HOLDER() {
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$M */
    /* loaded from: classes2.dex */
    public static class C3172M extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3172M(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$N */
    /* loaded from: classes2.dex */
    public static class C3173N extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3173N(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class NoFramework extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public NoFramework(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$O */
    /* loaded from: classes2.dex */
    public static class C3174O extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3174O(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT >= 26) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class O_MR1 extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public O_MR1(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT >= 27) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$P */
    /* loaded from: classes2.dex */
    public static class C3175P extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3175P(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$Q */
    /* loaded from: classes2.dex */
    public static class C3176Q extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3176Q(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.ApiFeature$T */
    /* loaded from: classes2.dex */
    public static class C3177T extends ApiFeature {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3177T(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT >= 33) {
                return true;
            }
            return false;
        }
    }

    ApiFeature(@NonNull String str, @NonNull String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    @NonNull
    @VisibleForTesting
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }

    @NonNull
    public static Set<ApiFeature> values() {
        return Collections.unmodifiableSet(sValues);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    @NonNull
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        if (!isSupportedByFramework() && !isSupportedByWebView()) {
            return false;
        }
        return true;
    }

    public abstract boolean isSupportedByFramework();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean isSupportedByWebView() {
        return BoundaryInterfaceReflectionUtil.m13147b(LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }
}
