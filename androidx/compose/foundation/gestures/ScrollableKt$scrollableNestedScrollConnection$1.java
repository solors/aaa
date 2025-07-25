package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollModifier {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$scrollableNestedScrollConnection$1(boolean z, State<ScrollingLogic> state) {
        this.$enabled = z;
        this.$scrollLogic = state;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo106219onPostFlingRZ2iAVY(long r3, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = sd.C42683b.m6964e()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.J$0
            p804nd.C38508r.m14539b(r4)
            goto L4d
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            p804nd.C38508r.m14539b(r4)
            boolean r4 = r2.$enabled
            if (r4 == 0) goto L58
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.m106222doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.p015ui.unit.Velocity) r4
            long r3 = r4.m109968unboximpl()
            long r3 = androidx.compose.p015ui.unit.Velocity.m109962minusAH228Gc(r5, r3)
            goto L5e
        L58:
            androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.p015ui.unit.Velocity.Companion
            long r3 = r3.m109970getZero9UxMQ8M()
        L5e:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.p015ui.unit.Velocity.m109950boximpl(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.mo106219onPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long mo106220onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.$enabled) {
            return this.$scrollLogic.getValue().m106223performRawScrollMKHz9U(j2);
        }
        return Offset.Companion.m107307getZeroF1C5BW0();
    }
}
