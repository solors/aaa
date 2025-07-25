package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Count implements Serializable {

    /* renamed from: b */
    private int f39893b;

    public void add(int i) {
        this.f39893b += i;
    }

    public int addAndGet(int i) {
        int i2 = this.f39893b + i;
        this.f39893b = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Count) && ((Count) obj).f39893b == this.f39893b) {
            return true;
        }
        return false;
    }

    public int get() {
        return this.f39893b;
    }

    public int getAndSet(int i) {
        int i2 = this.f39893b;
        this.f39893b = i;
        return i2;
    }

    public int hashCode() {
        return this.f39893b;
    }

    public void set(int i) {
        this.f39893b = i;
    }

    public String toString() {
        return Integer.toString(this.f39893b);
    }
}
