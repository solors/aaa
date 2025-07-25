package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.MultiReader */
/* loaded from: classes4.dex */
class MultiReader extends Reader {

    /* renamed from: b */
    private final Iterator<? extends CharSource> f41317b;

    /* renamed from: c */
    private Reader f41318c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiReader(Iterator<? extends CharSource> it) throws IOException {
        this.f41317b = it;
        m68210a();
    }

    /* renamed from: a */
    private void m68210a() throws IOException {
        close();
        if (this.f41317b.hasNext()) {
            this.f41318c = this.f41317b.next().openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f41318c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f41318c = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.f41318c;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read == -1) {
            m68210a();
            return read(cArr, i, i2);
        }
        return read;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f41318c;
        if (reader != null && reader.ready()) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "n is negative");
        if (i > 0) {
            while (true) {
                Reader reader = this.f41318c;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                m68210a();
            }
        }
        return 0L;
    }
}
