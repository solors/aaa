package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TapGestureDetector.kt */
@Metadata
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements TapGestureDetector, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    @NotNull
    private final Mutex mutex;

    public PressGestureScopeImpl(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.$$delegate_0 = density;
        this.mutex = C38289c.m15158a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // androidx.compose.foundation.gestures.TapGestureDetector
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p804nd.C38508r.m14539b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.f99208a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(kotlin.coroutines.d):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        Mutex.C38282a.m15181c(this.mutex, null, 1, null);
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        Mutex.C38282a.m15181c(this.mutex, null, 1, null);
    }

    public final void reset() {
        Mutex.C38282a.m15182b(this.mutex, null, 1, null);
        this.isReleased = false;
        this.isCanceled = false;
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int mo106207roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo106207roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int mo106208roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo106208roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float mo106209toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo106209toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo106210toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo106210toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long mo106212toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo106212toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float mo106213toPxR2X_6o(long j) {
        return this.$$delegate_0.mo106213toPxR2X_6o(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float mo106214toPx0680j_4(float f) {
        return this.$$delegate_0.mo106214toPx0680j_4(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long mo106215toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo106215toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long mo106216toSp0xMU5do(float f) {
        return this.$$delegate_0.mo106216toSp0xMU5do(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo106217toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo106217toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.compose.foundation.gestures.TapGestureDetector
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            p804nd.C38508r.m14539b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p804nd.C38508r.m14539b(r5)
            boolean r5 = r4.isReleased
            if (r5 != 0) goto L4e
            boolean r5 = r4.isCanceled
            if (r5 != 0) goto L4e
            me.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = me.Mutex.C38282a.m15183a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.isReleased
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.m17100a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo106211toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo106211toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo106218toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo106218toSpkPz2Gy4(i);
    }
}
