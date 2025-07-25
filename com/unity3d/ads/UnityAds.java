package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnityAds.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UnityAds {
    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    /* compiled from: UnityAds.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* compiled from: UnityAds.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* compiled from: UnityAds.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* compiled from: UnityAds.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    public static final void initialize(@Nullable Context context, @Nullable String str) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, null);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final void load(@Nullable String str) {
        load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(@NotNull String placementId) {
                Intrinsics.checkNotNullParameter(placementId, "placementId");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(@NotNull String placementId, @NotNull UnityAds.UnityAdsLoadError error, @NotNull String message) {
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(message, "message");
            }
        });
    }

    public static final void setDebugMode(boolean z) {
        UnityAdsImplementation.getInstance().setDebugMode(z);
    }

    public static final void show(@Nullable Activity activity, @Nullable String str) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
    }

    public static final void getToken(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, @Nullable IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static final void load(@Nullable String str, @Nullable IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, null);
    }

    public static final void load(@Nullable String str, @Nullable UnityAdsLoadOptions unityAdsLoadOptions, @Nullable IUnityAdsLoadListener iUnityAdsLoadListener) {
        IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new UnityAdsLoadOptions();
        }
        unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z, @Nullable IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, iUnityAdsInitializationListener);
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @Nullable IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
