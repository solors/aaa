package com.five_corp.p372ad.internal.movie.exoplayer;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.TransferListener;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.movie.exoplayer.e */
/* loaded from: classes4.dex */
public final class C13863e implements DataSource {

    /* renamed from: b */
    public final int f25902b;

    /* renamed from: f */
    public long f25906f;

    /* renamed from: a */
    public final DefaultHttpDataSource.Factory f25901a = new DefaultHttpDataSource.Factory();

    /* renamed from: c */
    public final ArrayList f25903c = new ArrayList();

    /* renamed from: d */
    public DefaultHttpDataSource f25904d = null;

    /* renamed from: e */
    public DataSpec f25905e = null;

    public C13863e(int i) {
        this.f25902b = i;
    }

    /* renamed from: a */
    public final DefaultHttpDataSource m78235a() {
        long j;
        if (this.f25905e != null) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.setUri(this.f25905e.uri);
            builder.setPosition(this.f25906f);
            DataSpec dataSpec = this.f25905e;
            long j2 = dataSpec.length;
            if (j2 != -1) {
                j = Math.min(this.f25902b, (j2 + dataSpec.position) - this.f25906f);
            } else {
                j = this.f25902b;
            }
            builder.setLength(j);
            DefaultHttpDataSource createDataSource = this.f25901a.createDataSource();
            createDataSource.open(builder.build());
            return createDataSource;
        }
        throw new C13862d("DataSpec unavailable, maybe not yet called open method.");
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        this.f25903c.add(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        if (this.f25904d != null) {
            if (this.f25905e != null) {
                Iterator it = this.f25903c.iterator();
                while (it.hasNext()) {
                    ((TransferListener) it.next()).onTransferEnd(this, this.f25905e, true);
                }
            }
            this.f25904d.close();
        }
        this.f25904d = null;
        this.f25905e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f25905e;
        if (dataSpec == null) {
            return null;
        }
        return dataSpec.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        this.f25906f = dataSpec.position;
        this.f25905e = dataSpec;
        Iterator it = this.f25903c.iterator();
        while (it.hasNext()) {
            ((TransferListener) it.next()).onTransferInitializing(this, this.f25905e, true);
        }
        this.f25904d = m78235a();
        if (this.f25905e != null) {
            Iterator it2 = this.f25903c.iterator();
            while (it2.hasNext()) {
                ((TransferListener) it2.next()).onTransferStart(this, this.f25905e, true);
            }
        }
        if (dataSpec.length == -1) {
            return -1L;
        }
        return this.f25905e.length;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        DefaultHttpDataSource defaultHttpDataSource;
        if (this.f25905e != null && (defaultHttpDataSource = this.f25904d) != null) {
            int read = defaultHttpDataSource.read(bArr, i, i2);
            if (read != -1) {
                if (this.f25905e != null) {
                    Iterator it = this.f25903c.iterator();
                    while (it.hasNext()) {
                        ((TransferListener) it.next()).onBytesTransferred(this, this.f25905e, true, read);
                    }
                }
                this.f25906f += read;
                return read;
            }
            DataSpec dataSpec = this.f25905e;
            long j = dataSpec.length;
            if (j != -1 && this.f25906f >= dataSpec.position + j) {
                return -1;
            }
            this.f25904d.close();
            DefaultHttpDataSource m78235a = m78235a();
            this.f25904d = m78235a;
            int read2 = m78235a.read(bArr, i, i2);
            if (read2 == -1) {
                return -1;
            }
            if (this.f25905e != null) {
                Iterator it2 = this.f25903c.iterator();
                while (it2.hasNext()) {
                    ((TransferListener) it2.next()).onBytesTransferred(this, this.f25905e, true, read2);
                }
            }
            this.f25906f += read2;
            return read2;
        }
        throw new C13862d("DataSource unavailable, maybe not yet called open method.");
    }
}
