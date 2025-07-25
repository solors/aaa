package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter */
/* loaded from: classes.dex */
public final class MutableCounter {
    private int count;

    public MutableCounter() {
        this(0, 1, null);
    }

    public static /* synthetic */ MutableCounter copy$default(MutableCounter mutableCounter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableCounter.count;
        }
        return mutableCounter.copy(i);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final MutableCounter copy(int i) {
        return new MutableCounter(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MutableCounter) && this.count == ((MutableCounter) obj).count) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i) {
        this.count += i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    @NotNull
    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public MutableCounter(int i) {
        this.count = i;
    }

    public /* synthetic */ MutableCounter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
