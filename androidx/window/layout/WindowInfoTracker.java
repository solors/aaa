package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInfoTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public interface WindowInfoTracker {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInfoTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @Nullable
        private static final String TAG = Reflection.m17042b(WindowInfoTracker.class).getSimpleName();
        @NotNull
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        @NotNull
        public final WindowBackend windowBackend$window_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            if (extensionWindowLayoutInfoBackend == null) {
                return SidecarWindowBackend.Companion.getInstance(context);
            }
            return extensionWindowLayoutInfoBackend;
        }
    }

    @NotNull
    static WindowInfoTracker getOrCreate(@NotNull Context context) {
        return Companion.getOrCreate(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void overrideDecorator(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void reset() {
        Companion.reset();
    }

    @NotNull
    InterfaceC33327h<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity);
}
