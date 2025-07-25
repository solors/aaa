package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public final class FlagSet {

    /* renamed from: a */
    private final SparseBooleanArray f36078a;

    public boolean contains(int i) {
        return this.f36078a.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.SDK_INT < 24) {
            if (size() != flagSet.size()) {
                return false;
            }
            for (int i = 0; i < size(); i++) {
                if (get(i) != flagSet.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f36078a.equals(flagSet.f36078a);
    }

    public int get(int i) {
        Assertions.checkIndex(i, 0, size());
        return this.f36078a.keyAt(i);
    }

    public int hashCode() {
        if (Util.SDK_INT < 24) {
            int size = size();
            for (int i = 0; i < size(); i++) {
                size = (size * 31) + get(i);
            }
            return size;
        }
        return this.f36078a.hashCode();
    }

    public int size() {
        return this.f36078a.size();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private final SparseBooleanArray f36079a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f36080b;

        @CanIgnoreReturnValue
        public Builder add(int i) {
            Assertions.checkState(!this.f36080b);
            this.f36079a.append(i, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addIf(int i, boolean z) {
            if (z) {
                return add(i);
            }
            return this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.f36080b);
            this.f36080b = true;
            return new FlagSet(this.f36079a);
        }

        @CanIgnoreReturnValue
        public Builder remove(int i) {
            Assertions.checkState(!this.f36080b);
            this.f36079a.delete(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeIf(int i, boolean z) {
            if (z) {
                return remove(i);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }
    }

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.f36078a = sparseBooleanArray;
    }
}
