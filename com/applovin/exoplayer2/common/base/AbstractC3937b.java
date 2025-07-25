package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.exoplayer2.common.base.b */
/* loaded from: classes2.dex */
abstract class AbstractC3937b implements Iterator {

    /* renamed from: a */
    private EnumC3939b f4233a = EnumC3939b.NOT_READY;

    /* renamed from: b */
    private Object f4234b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.exoplayer2.common.base.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3938a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4235a;

        static {
            int[] iArr = new int[EnumC3939b.values().length];
            f4235a = iArr;
            try {
                iArr[EnumC3939b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4235a[EnumC3939b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.b$b */
    /* loaded from: classes2.dex */
    public enum EnumC3939b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: c */
    private boolean m101264c() {
        this.f4233a = EnumC3939b.FAILED;
        this.f4234b = mo101266a();
        if (this.f4233a != EnumC3939b.DONE) {
            this.f4233a = EnumC3939b.READY;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract Object mo101266a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Object m101265b() {
        this.f4233a = EnumC3939b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f4233a != EnumC3939b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = C3938a.f4235a[this.f4233a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return m101264c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f4233a = EnumC3939b.NOT_READY;
            Object obj = this.f4234b;
            this.f4234b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
