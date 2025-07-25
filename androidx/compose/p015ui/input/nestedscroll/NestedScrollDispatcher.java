package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher */
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    @NotNull
    private Functions<? extends CoroutineScope> calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    @Nullable
    private CoroutineScope originNestedScrollScope;
    @Nullable
    private NestedScrollModifier parent;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m108782dispatchPostFlingRZ2iAVY(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = sd.C42683b.m6964e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p804nd.C38508r.m14539b(r12)
            goto L44
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            p804nd.C38508r.m14539b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.parent
            if (r1 == 0) goto L4b
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo106219onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L44
            return r0
        L44:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p015ui.unit.Velocity) r12
            long r8 = r12.m109968unboximpl()
            goto L51
        L4b:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p015ui.unit.Velocity.Companion
            long r8 = r8.m109970getZero9UxMQ8M()
        L51:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.p015ui.unit.Velocity.m109950boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher.m108782dispatchPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M  reason: not valid java name */
    public final long m108783dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollModifier nestedScrollModifier = this.parent;
        if (nestedScrollModifier != null) {
            return nestedScrollModifier.mo106220onPostScrollDzOQY0M(j, j2, i);
        }
        return Offset.Companion.m107307getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPreFling-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m108784dispatchPreFlingQWom1Mo(long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p804nd.C38508r.m14539b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.parent
            if (r7 == 0) goto L48
            r0.label = r3
            java.lang.Object r7 = r7.mo106381onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.p015ui.unit.Velocity) r7
            long r5 = r7.m109968unboximpl()
            goto L4e
        L48:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.p015ui.unit.Velocity.Companion
            long r5 = r5.m109970getZero9UxMQ8M()
        L4e:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p015ui.unit.Velocity.m109950boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher.m108784dispatchPreFlingQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk  reason: not valid java name */
    public final long m108785dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollModifier nestedScrollModifier = this.parent;
        if (nestedScrollModifier != null) {
            return nestedScrollModifier.mo106382onPreScrollOzD1aCk(j, i);
        }
        return Offset.Companion.m107307getZeroF1C5BW0();
    }

    @NotNull
    public final Functions<CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        CoroutineScope invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    public final CoroutineScope getOriginNestedScrollScope$ui_release() {
        return this.originNestedScrollScope;
    }

    @Nullable
    public final NestedScrollModifier getParent$ui_release() {
        return this.parent;
    }

    public final void setCalculateNestedScrollScope$ui_release(@NotNull Functions<? extends CoroutineScope> functions) {
        Intrinsics.checkNotNullParameter(functions, "<set-?>");
        this.calculateNestedScrollScope = functions;
    }

    public final void setOriginNestedScrollScope$ui_release(@Nullable CoroutineScope coroutineScope) {
        this.originNestedScrollScope = coroutineScope;
    }

    public final void setParent$ui_release(@Nullable NestedScrollModifier nestedScrollModifier) {
        this.parent = nestedScrollModifier;
    }
}
