package androidx.compose.p015ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p015ui.platform.AndroidComposeView;
import androidx.compose.p015ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    @NotNull
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.neverEqualPolicy(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(C0941x7efe3756.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(@NotNull AndroidComposeView owner, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1396852028);
        Context context = owner.getContext();
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(context.getResources().getConfiguration(), SnapshotStateKt.neverEqualPolicy());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        SnapshotState snapshotState = (SnapshotState) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(snapshotState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new C0942x68d8e1f6(snapshotState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        owner.setConfigurationChangeObserver((Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rememberedValue3 = new AndroidUriHandler(context);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) rememberedValue3;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners != null) {
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(owner, viewTreeOwners.getSavedStateRegistryOwner());
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue4;
            EffectsKt.DisposableEffect(Unit.f99208a, new C0943x611323aa(disposableSaveableStateRegistry), startRestartGroup, 0);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            ImageVectorCache obtainImageVectorCache = obtainImageVectorCache(context, m109212ProvideAndroidCompositionLocals$lambda1(snapshotState), startRestartGroup, 72);
            ProvidableCompositionLocal<Configuration> providableCompositionLocal = LocalConfiguration;
            Configuration configuration = m109212ProvideAndroidCompositionLocals$lambda1(snapshotState);
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(configuration), LocalContext.provides(context), LocalLifecycleOwner.provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(owner.getView()), LocalImageVectorCache.provides(obtainImageVectorCache)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1471621628, true, new C0944x611323ab(owner, androidUriHandler, content, i)), startRestartGroup, 56);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0945x611323ac(owner, content, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: ProvideAndroidCompositionLocals$lambda-1  reason: not valid java name */
    private static final Configuration m109212ProvideAndroidCompositionLocals$lambda1(SnapshotState<Configuration> snapshotState) {
        return snapshotState.getValue();
    }

    @NotNull
    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    @NotNull
    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Stable
    @Composable
    private static final ImageVectorCache obtainImageVectorCache(Context context, Configuration configuration, Composer composer, int i) {
        T t;
        composer.startReplaceableGroup(-485908294);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ImageVectorCache imageVectorCache = (ImageVectorCache) rememberedValue;
        final C37609n0 c37609n0 = new C37609n0();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            composer.updateRememberedValue(configuration);
            t = configuration;
        } else {
            t = rememberedValue2;
        }
        composer.endReplaceableGroup();
        c37609n0.f99327b = t;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@NotNull Configuration configuration2) {
                    int i2;
                    Intrinsics.checkNotNullParameter(configuration2, "configuration");
                    Configuration configuration3 = c37609n0.f99327b;
                    if (configuration3 != null) {
                        i2 = configuration3.updateFrom(configuration2);
                    } else {
                        i2 = -1;
                    }
                    imageVectorCache.prune(i2);
                    c37609n0.f99327b = configuration2;
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(imageVectorCache, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (ComponentCallbacks2C0946x477bcb35) rememberedValue3), composer, 8);
        composer.endReplaceableGroup();
        return imageVectorCache;
    }
}
