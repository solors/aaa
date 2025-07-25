package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntervalList.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface IntervalList<T> {

    /* compiled from: IntervalList.kt */
    @StabilityInferred(parameters = 1)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i, int i2, T t) {
            boolean z;
            this.startIndex = i;
            this.size = i2;
            this.value = t;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 > 0) {
                    return;
                }
                throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    static /* synthetic */ void forEach$default(IntervalList intervalList, int i, int i2, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = intervalList.getSize() - 1;
            }
            intervalList.forEach(i, i2, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
    }

    void forEach(int i, int i2, @NotNull Function1<? super Interval<T>, Unit> function1);

    @NotNull
    Interval<T> get(int i);

    int getSize();
}
