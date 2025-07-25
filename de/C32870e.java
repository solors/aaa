package de;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC37552l0;

/* compiled from: ProgressionIterators.kt */
@Metadata
/* renamed from: de.e */
/* loaded from: classes7.dex */
public final class C32870e extends AbstractC37552l0 {

    /* renamed from: b */
    private final long f89596b;

    /* renamed from: c */
    private final long f89597c;

    /* renamed from: d */
    private boolean f89598d;

    /* renamed from: f */
    private long f89599f;

    public C32870e(long j, long j2, long j3) {
        this.f89596b = j3;
        this.f89597c = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f89598d = z;
        this.f89599f = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89598d;
    }

    @Override // kotlin.collections.AbstractC37552l0
    public long nextLong() {
        long j = this.f89599f;
        if (j == this.f89597c) {
            if (this.f89598d) {
                this.f89598d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f89599f = this.f89596b + j;
        }
        return j;
    }
}
