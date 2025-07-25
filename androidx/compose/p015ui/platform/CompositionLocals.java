package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.autofill.Autofill;
import androidx.compose.p015ui.autofill.AutofillTree;
import androidx.compose.p015ui.focus.FocusManager;
import androidx.compose.p015ui.hapticfeedback.HapticFeedback;
import androidx.compose.p015ui.input.InputModeManager;
import androidx.compose.p015ui.input.pointer.PointerIconService;
import androidx.compose.p015ui.node.Owner;
import androidx.compose.p015ui.text.font.Font;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.input.TextInputService;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
/* loaded from: classes.dex */
public final class CompositionLocals {
    @NotNull
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);
    @NotNull
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideCommonCompositionLocals(@NotNull Owner owner, @NotNull UriHandler uriHandler, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(owner)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(uriHandler)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(content)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusManager()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, content, startRestartGroup, ((i2 >> 3) & 112) | 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, content, i));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    @NotNull
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    @NotNull
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    @NotNull
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    @NotNull
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    @NotNull
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }
}
