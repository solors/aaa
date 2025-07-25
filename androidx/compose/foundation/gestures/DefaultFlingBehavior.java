package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    @NotNull
    private final DecayAnimationSpec<Float> flingDecay;

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> flingDecay) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        this.flingDecay = flingDecay;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object performFling(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.ScrollScope r18, float r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            if (r2 == 0) goto L17
            r2 = r1
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = (androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            r2.<init>(r0, r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.result
            java.lang.Object r2 = sd.C42683b.m6964e()
            int r3 = r7.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.k0 r2 = (kotlin.jvm.internal.C37605k0) r2
            p804nd.C38508r.m14539b(r1)
            goto L82
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            p804nd.C38508r.m14539b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L85
            kotlin.jvm.internal.k0 r1 = new kotlin.jvm.internal.k0
            r1.<init>()
            r3 = r19
            r1.f99323b = r3
            kotlin.jvm.internal.k0 r5 = new kotlin.jvm.internal.k0
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r6 = r0.flingDecay
            r8 = 0
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 r9 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.L$0 = r1
            r7.label = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimation.animateDecay$default(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L81
            return r2
        L81:
            r2 = r1
        L82:
            float r1 = r2.f99323b
            goto L88
        L85:
            r3 = r19
            r1 = r3
        L88:
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.boxing.m17098c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.d):java.lang.Object");
    }
}
