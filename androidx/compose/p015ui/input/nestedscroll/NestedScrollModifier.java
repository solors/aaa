package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection */
/* loaded from: classes.dex */
public interface NestedScrollModifier {

    /* compiled from: NestedScrollModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
        public static Object m108778onPostFlingRZ2iAVY(@NotNull NestedScrollModifier nestedScrollModifier, long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            return NestedScrollModifier.super.mo106219onPostFlingRZ2iAVY(j, j2, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
        public static long m108779onPostScrollDzOQY0M(@NotNull NestedScrollModifier nestedScrollModifier, long j, long j2, int i) {
            return NestedScrollModifier.super.mo106220onPostScrollDzOQY0M(j, j2, i);
        }

        @Deprecated
        @Nullable
        /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
        public static Object m108780onPreFlingQWom1Mo(@NotNull NestedScrollModifier nestedScrollModifier, long j, @NotNull Continuation<? super Velocity> continuation) {
            return NestedScrollModifier.super.mo106381onPreFlingQWom1Mo(j, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
        public static long m108781onPreScrollOzD1aCk(@NotNull NestedScrollModifier nestedScrollModifier, long j, int i) {
            return NestedScrollModifier.super.mo106382onPreScrollOzD1aCk(j, i);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl  reason: not valid java name */
    static /* synthetic */ Object m108776onPostFlingRZ2iAVY$suspendImpl(NestedScrollModifier nestedScrollModifier, long j, long j2, Continuation continuation) {
        return Velocity.m109950boximpl(Velocity.Companion.m109970getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl  reason: not valid java name */
    static /* synthetic */ Object m108777onPreFlingQWom1Mo$suspendImpl(NestedScrollModifier nestedScrollModifier, long j, Continuation continuation) {
        return Velocity.m109950boximpl(Velocity.Companion.m109970getZero9UxMQ8M());
    }

    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo106219onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        return m108776onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo106220onPostScrollDzOQY0M(long j, long j2, int i) {
        return Offset.Companion.m107307getZeroF1C5BW0();
    }

    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    default Object mo106381onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        return m108777onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo106382onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m107307getZeroF1C5BW0();
    }
}
