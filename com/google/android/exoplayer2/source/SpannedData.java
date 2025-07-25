package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: classes4.dex */
final class SpannedData<V> {

    /* renamed from: a */
    private int f34478a;

    /* renamed from: b */
    private final SparseArray<V> f34479b;

    /* renamed from: c */
    private final Consumer<V> f34480c;

    public SpannedData() {
        this(new Consumer() { // from class: com.google.android.exoplayer2.source.w
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                SpannedData.m73699a(obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m73699a(Object obj) {
        m73698b(obj);
    }

    public void appendSpan(int i, V v) {
        boolean z;
        boolean z2 = false;
        if (this.f34478a == -1) {
            if (this.f34479b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkState(z);
            this.f34478a = 0;
        }
        if (this.f34479b.size() > 0) {
            SparseArray<V> sparseArray = this.f34479b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            Assertions.checkArgument(z2);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f34479b;
                this.f34480c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f34479b.append(i, v);
    }

    public void clear() {
        for (int i = 0; i < this.f34479b.size(); i++) {
            this.f34480c.accept(this.f34479b.valueAt(i));
        }
        this.f34478a = -1;
        this.f34479b.clear();
    }

    public void discardFrom(int i) {
        int i2;
        for (int size = this.f34479b.size() - 1; size >= 0 && i < this.f34479b.keyAt(size); size--) {
            this.f34480c.accept(this.f34479b.valueAt(size));
            this.f34479b.removeAt(size);
        }
        if (this.f34479b.size() > 0) {
            i2 = Math.min(this.f34478a, this.f34479b.size() - 1);
        } else {
            i2 = -1;
        }
        this.f34478a = i2;
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (i2 < this.f34479b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f34479b.keyAt(i3)) {
                this.f34480c.accept(this.f34479b.valueAt(i2));
                this.f34479b.removeAt(i2);
                int i4 = this.f34478a;
                if (i4 > 0) {
                    this.f34478a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public V get(int i) {
        if (this.f34478a == -1) {
            this.f34478a = 0;
        }
        while (true) {
            int i2 = this.f34478a;
            if (i2 <= 0 || i >= this.f34479b.keyAt(i2)) {
                break;
            }
            this.f34478a--;
        }
        while (this.f34478a < this.f34479b.size() - 1 && i >= this.f34479b.keyAt(this.f34478a + 1)) {
            this.f34478a++;
        }
        return this.f34479b.valueAt(this.f34478a);
    }

    public V getEndValue() {
        SparseArray<V> sparseArray = this.f34479b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean isEmpty() {
        if (this.f34479b.size() == 0) {
            return true;
        }
        return false;
    }

    public SpannedData(Consumer<V> consumer) {
        this.f34479b = new SparseArray<>();
        this.f34480c = consumer;
        this.f34478a = -1;
    }

    /* renamed from: b */
    public static /* synthetic */ void m73698b(Object obj) {
    }
}
