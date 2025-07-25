package io.bidmachine.media3.exoplayer.source;

import android.util.SparseArray;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Consumer;

/* renamed from: io.bidmachine.media3.exoplayer.source.b0 */
/* loaded from: classes9.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final Consumer<V> removeCallback;
    private final SparseArray<V> spans;

    public SpannedData() {
        this(new Consumer() { // from class: io.bidmachine.media3.exoplayer.source.a0
            @Override // io.bidmachine.media3.common.util.Consumer
            public final void accept(Object obj) {
                SpannedData.m19687a(obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m19687a(Object obj) {
        lambda$new$0(obj);
    }

    public void appendSpan(int i, V v) {
        boolean z;
        boolean z2 = false;
        if (this.memoizedReadIndex == -1) {
            if (this.spans.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkState(z);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            SparseArray<V> sparseArray = this.spans;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            Assertions.checkArgument(z2);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.spans;
                this.removeCallback.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i, v);
    }

    public void clear() {
        for (int i = 0; i < this.spans.size(); i++) {
            this.removeCallback.accept(this.spans.valueAt(i));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public void discardFrom(int i) {
        int i2;
        for (int size = this.spans.size() - 1; size >= 0 && i < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        if (this.spans.size() > 0) {
            i2 = Math.min(this.memoizedReadIndex, this.spans.size() - 1);
        } else {
            i2 = -1;
        }
        this.memoizedReadIndex = i2;
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (i2 < this.spans.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.spans.keyAt(i3)) {
                this.removeCallback.accept(this.spans.valueAt(i2));
                this.spans.removeAt(i2);
                int i4 = this.memoizedReadIndex;
                if (i4 > 0) {
                    this.memoizedReadIndex = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public V get(int i) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i2 = this.memoizedReadIndex;
            if (i2 <= 0 || i >= this.spans.keyAt(i2)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public V getEndValue() {
        SparseArray<V> sparseArray = this.spans;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean isEmpty() {
        if (this.spans.size() == 0) {
            return true;
        }
        return false;
    }

    public SpannedData(Consumer<V> consumer) {
        this.spans = new SparseArray<>();
        this.removeCallback = consumer;
        this.memoizedReadIndex = -1;
    }

    public static /* synthetic */ void lambda$new$0(Object obj) {
    }
}
