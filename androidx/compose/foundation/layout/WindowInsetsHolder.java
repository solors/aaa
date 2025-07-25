package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p015ui.C0825R;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ironsource.mediationsdk.C20348d;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    @NotNull
    private final AndroidWindowInsets captionBar;
    @NotNull
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    @NotNull
    private final AndroidWindowInsets displayCutout;
    @NotNull
    private final AndroidWindowInsets ime;
    @NotNull
    private final InsetsListener insetsListener;
    @NotNull
    private final AndroidWindowInsets mandatorySystemGestures;
    @NotNull
    private final AndroidWindowInsets navigationBars;
    @NotNull
    private final ValueInsets navigationBarsIgnoringVisibility;
    @NotNull
    private final WindowInsets safeContent;
    @NotNull
    private final WindowInsets safeDrawing;
    @NotNull
    private final WindowInsets safeGestures;
    @NotNull
    private final AndroidWindowInsets statusBars;
    @NotNull
    private final ValueInsets statusBarsIgnoringVisibility;
    @NotNull
    private final AndroidWindowInsets systemBars;
    @NotNull
    private final ValueInsets systemBarsIgnoringVisibility;
    @NotNull
    private final AndroidWindowInsets systemGestures;
    @NotNull
    private final AndroidWindowInsets tappableElement;
    @NotNull
    private final ValueInsets tappableElementIgnoringVisibility;
    @NotNull
    private final ValueInsets waterfall;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    /* compiled from: WindowInsets.android.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder(null, view, null);
                    weakHashMap.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i)) == null) {
                insets = Insets.NONE;
            }
            Intrinsics.checkNotNullExpressionValue(insets, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @Composable
        @NotNull
        public final WindowInsetsHolder current(@Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect(orCreateFor, new WindowInsetsHolder$Companion$current$1(orCreateFor, view), composer, 8);
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.testInsets = z;
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void decrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @NotNull
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    @NotNull
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    @NotNull
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    @NotNull
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    @NotNull
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    @NotNull
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @NotNull
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    @NotNull
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    @NotNull
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    @NotNull
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    @NotNull
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    @NotNull
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    @NotNull
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @NotNull
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            if (Build.VERSION.SDK_INT >= 30) {
                ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
            }
        }
        this.accessCount++;
    }

    public final void update(@NotNull WindowInsetsCompat windowInsets, int i) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (testInsets) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            Intrinsics.m17074g(windowInsets2);
            windowInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.update$foundation_layout_release(windowInsets, i);
        this.ime.update$foundation_layout_release(windowInsets, i);
        this.displayCutout.update$foundation_layout_release(windowInsets, i);
        this.navigationBars.update$foundation_layout_release(windowInsets, i);
        this.statusBars.update$foundation_layout_release(windowInsets, i);
        this.systemBars.update$foundation_layout_release(windowInsets, i);
        this.systemGestures.update$foundation_layout_release(windowInsets, i);
        this.tappableElement.update$foundation_layout_release(windowInsets, i);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsets, i);
        if (i == 0) {
            ValueInsets valueInsets = this.captionBarIgnoringVisibility;
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility));
            ValueInsets valueInsets2 = this.navigationBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            valueInsets2.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility2));
            ValueInsets valueInsets3 = this.statusBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility3 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            valueInsets3.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility3));
            ValueInsets valueInsets4 = this.systemBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility4 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            valueInsets4.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility4));
            ValueInsets valueInsets5 = this.tappableElementIgnoringVisibility;
            Insets insetsIgnoringVisibility5 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            valueInsets5.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                Intrinsics.checkNotNullExpressionValue(waterfallInsets, "cutout.waterfallInsets");
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        Insets insets = (windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (insets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : insets;
        Intrinsics.checkNotNullExpressionValue(insets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets(insets, C20348d.f51321g);
        this.waterfall = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C0825R.C0827id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }
}
