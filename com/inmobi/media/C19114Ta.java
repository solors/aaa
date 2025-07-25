package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.inmobi.media.Ta */
/* loaded from: classes6.dex */
public final class C19114Ta extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ C19127Ua f47815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19114Ta(C19127Ua c19127Ua, int i) {
        super(i);
        this.f47815a = c19127Ua;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i;
        i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f47815a.f47843b.name());
    }
}
