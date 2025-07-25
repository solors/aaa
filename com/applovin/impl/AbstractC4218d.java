package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4218d extends AbstractC5139pp {

    /* renamed from: a */
    private EnumC4220b f5423a = EnumC4220b.NOT_READY;

    /* renamed from: b */
    private Object f5424b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4219a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5425a;

        static {
            int[] iArr = new int[EnumC4220b.values().length];
            f5425a = iArr;
            try {
                iArr[EnumC4220b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5425a[EnumC4220b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.d$b */
    /* loaded from: classes2.dex */
    public enum EnumC4220b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: c */
    private boolean m100047c() {
        this.f5423a = EnumC4220b.FAILED;
        this.f5424b = mo95829a();
        if (this.f5423a != EnumC4220b.DONE) {
            this.f5423a = EnumC4220b.READY;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract Object mo95829a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Object m100048b() {
        this.f5423a = EnumC4220b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f5423a != EnumC4220b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = C4219a.f5425a[this.f5423a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m100047c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f5423a = EnumC4220b.NOT_READY;
            Object obj = this.f5424b;
            this.f5424b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
