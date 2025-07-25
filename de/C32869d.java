package de;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;

/* compiled from: ProgressionIterators.kt */
@Metadata
/* renamed from: de.d */
/* loaded from: classes7.dex */
public final class C32869d extends PrimitiveIterators {

    /* renamed from: b */
    private final int f89592b;

    /* renamed from: c */
    private final int f89593c;

    /* renamed from: d */
    private boolean f89594d;

    /* renamed from: f */
    private int f89595f;

    public C32869d(int i, int i2, int i3) {
        this.f89592b = i3;
        this.f89593c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f89594d = z;
        this.f89595f = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89594d;
    }

    @Override // kotlin.collections.PrimitiveIterators
    public int nextInt() {
        int i = this.f89595f;
        if (i == this.f89593c) {
            if (this.f89594d) {
                this.f89594d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f89595f = this.f89592b + i;
        }
        return i;
    }
}
