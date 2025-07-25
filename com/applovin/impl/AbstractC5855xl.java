package com.applovin.impl;

/* renamed from: com.applovin.impl.xl */
/* loaded from: classes2.dex */
abstract class AbstractC5855xl {

    /* renamed from: a */
    protected final InterfaceC5209qo f12126a;

    /* renamed from: com.applovin.impl.xl$a */
    /* loaded from: classes2.dex */
    public static final class C5856a extends C4187ch {
        public C5856a(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5855xl(InterfaceC5209qo interfaceC5209qo) {
        this.f12126a = interfaceC5209qo;
    }

    /* renamed from: a */
    protected abstract boolean mo92617a(C4066ah c4066ah);

    /* renamed from: a */
    public final boolean m93080a(C4066ah c4066ah, long j) {
        if (mo92617a(c4066ah) && mo92616b(c4066ah, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    protected abstract boolean mo92616b(C4066ah c4066ah, long j);
}
