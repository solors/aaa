package com.applovin.impl;

import com.applovin.impl.AbstractC5915yg;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.ek */
/* loaded from: classes2.dex */
public abstract class AbstractC4336ek extends AbstractC4132bk implements InterfaceC5075ol {

    /* renamed from: n */
    private final String f5941n;

    public AbstractC4336ek(String str) {
        super(new C5278rl[2], new AbstractC5519sl[2]);
        this.f5941n = str;
        m100380a(1024);
    }

    /* renamed from: a */
    protected abstract InterfaceC5019nl mo92614a(byte[] bArr, int i, boolean z);

    @Override // com.applovin.impl.InterfaceC5075ol
    /* renamed from: a */
    public void mo92591a(long j) {
    }

    @Override // com.applovin.impl.AbstractC4132bk
    /* renamed from: b */
    public final C5128pl mo99487a(Throwable th) {
        return new C5128pl("Unexpected decode error", th);
    }

    @Override // com.applovin.impl.AbstractC4132bk
    /* renamed from: o */
    public final AbstractC5519sl mo99484g() {
        return new C4399fk(new AbstractC5915yg.InterfaceC5916a() { // from class: com.applovin.impl.av
            {
                AbstractC4336ek.this = this;
            }

            @Override // com.applovin.impl.AbstractC5915yg.InterfaceC5916a
            /* renamed from: a */
            public final void mo92743a(AbstractC5915yg abstractC5915yg) {
                AbstractC4336ek.this.m100377a((AbstractC5915yg) ((AbstractC5519sl) abstractC5915yg));
            }
        });
    }

    @Override // com.applovin.impl.AbstractC4132bk
    /* renamed from: n */
    public final C5278rl mo99485f() {
        return new C5278rl();
    }

    @Override // com.applovin.impl.AbstractC4132bk
    /* renamed from: a */
    public final C5128pl mo99489a(C5278rl c5278rl, AbstractC5519sl abstractC5519sl, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC4100b1.m100583a(c5278rl.f8725c);
            abstractC5519sl.m94599a(c5278rl.f8727f, mo92614a(byteBuffer.array(), byteBuffer.limit(), z), c5278rl.f9482j);
            abstractC5519sl.m97869c(Integer.MIN_VALUE);
            return null;
        } catch (C5128pl e) {
            return e;
        }
    }
}
