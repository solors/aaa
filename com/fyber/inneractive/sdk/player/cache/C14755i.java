package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.fyber.inneractive.sdk.player.cache.i */
/* loaded from: classes4.dex */
public final class C14755i extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ C14756j f27967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14755i(C14756j c14756j, int i) {
        super(i);
        this.f27967a = c14756j;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f27967a.f27969b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
