package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: Applier.kt */
@Metadata
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    @NotNull
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(@NotNull Applier<N> applier, int i) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.applier = applier;
        this.offset = i;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new ExceptionsH();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.nesting++;
        this.applier.down(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, N n) {
        int i2;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i2 = this.offset;
        } else {
            i2 = 0;
        }
        applier.insertBottomUp(i + i2, n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, N n) {
        int i2;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i2 = this.offset;
        } else {
            i2 = 0;
        }
        applier.insertTopDown(i + i2, n);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        int i4;
        if (this.nesting == 0) {
            i4 = this.offset;
        } else {
            i4 = 0;
        }
        this.applier.move(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        int i3;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i3 = this.offset;
        } else {
            i3 = 0;
        }
        applier.remove(i + i3, i2);
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo105431up() {
        boolean z;
        int i = this.nesting;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.nesting = i - 1;
            this.applier.mo105431up();
            return;
        }
        ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
        throw new ExceptionsH();
    }
}
