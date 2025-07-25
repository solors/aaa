package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Applier.kt */
@Metadata
/* loaded from: classes.dex */
public interface Applier<N> {

    /* compiled from: Applier.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void onBeginChanges(@NotNull Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(@NotNull Applier<N> applier) {
            Applier.super.onEndChanges();
        }
    }

    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i, N n);

    void insertTopDown(int i, N n);

    void move(int i, int i2, int i3);

    void remove(int i, int i2);

    /* renamed from: up */
    void mo105431up();

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }
}
