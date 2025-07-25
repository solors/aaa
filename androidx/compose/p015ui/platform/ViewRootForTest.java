package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.node.RootForTest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewRootForTest.android.kt */
@Metadata
@VisibleForTesting
/* renamed from: androidx.compose.ui.platform.ViewRootForTest */
/* loaded from: classes.dex */
public interface ViewRootForTest extends RootForTest {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getHasPendingMeasureOrLayout();

    @NotNull
    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* compiled from: ViewRootForTest.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewRootForTest$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @Nullable
        private static Function1<? super ViewRootForTest, Unit> onViewCreatedCallback;

        private Companion() {
        }

        @Nullable
        public final Function1<ViewRootForTest, Unit> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(@Nullable Function1<? super ViewRootForTest, Unit> function1) {
            onViewCreatedCallback = function1;
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }
    }
}
