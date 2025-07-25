package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DefaultDataSource implements DataSource {

    /* renamed from: a */
    private final Context f35802a;

    /* renamed from: b */
    private final List<TransferListener> f35803b;

    /* renamed from: c */
    private final DataSource f35804c;
    @Nullable

    /* renamed from: d */
    private DataSource f35805d;
    @Nullable

    /* renamed from: e */
    private DataSource f35806e;
    @Nullable

    /* renamed from: f */
    private DataSource f35807f;
    @Nullable

    /* renamed from: g */
    private DataSource f35808g;
    @Nullable

    /* renamed from: h */
    private DataSource f35809h;
    @Nullable

    /* renamed from: i */
    private DataSource f35810i;
    @Nullable

    /* renamed from: j */
    private DataSource f35811j;
    @Nullable

    /* renamed from: k */
    private DataSource f35812k;

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        private final Context f35813a;

        /* renamed from: b */
        private final DataSource.Factory f35814b;
        @Nullable

        /* renamed from: c */
        private TransferListener f35815c;

        public Factory(Context context) {
            this(context, new DefaultHttpDataSource.Factory());
        }

        @CanIgnoreReturnValue
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.f35815c = transferListener;
            return this;
        }

        public Factory(Context context, DataSource.Factory factory) {
            this.f35813a = context.getApplicationContext();
            this.f35814b = factory;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public DefaultDataSource createDataSource() {
            DefaultDataSource defaultDataSource = new DefaultDataSource(this.f35813a, this.f35814b.createDataSource());
            TransferListener transferListener = this.f35815c;
            if (transferListener != null) {
                defaultDataSource.addTransferListener(transferListener);
            }
            return defaultDataSource;
        }
    }

    public DefaultDataSource(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    /* renamed from: b */
    private void m72791b(DataSource dataSource) {
        for (int i = 0; i < this.f35803b.size(); i++) {
            dataSource.addTransferListener(this.f35803b.get(i));
        }
    }

    /* renamed from: c */
    private DataSource m72790c() {
        if (this.f35806e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f35802a);
            this.f35806e = assetDataSource;
            m72791b(assetDataSource);
        }
        return this.f35806e;
    }

    /* renamed from: d */
    private DataSource m72789d() {
        if (this.f35807f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f35802a);
            this.f35807f = contentDataSource;
            m72791b(contentDataSource);
        }
        return this.f35807f;
    }

    /* renamed from: e */
    private DataSource m72788e() {
        if (this.f35810i == null) {
            DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
            this.f35810i = dataSchemeDataSource;
            m72791b(dataSchemeDataSource);
        }
        return this.f35810i;
    }

    /* renamed from: f */
    private DataSource m72787f() {
        if (this.f35805d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f35805d = fileDataSource;
            m72791b(fileDataSource);
        }
        return this.f35805d;
    }

    /* renamed from: g */
    private DataSource m72786g() {
        if (this.f35811j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f35802a);
            this.f35811j = rawResourceDataSource;
            m72791b(rawResourceDataSource);
        }
        return this.f35811j;
    }

    /* renamed from: h */
    private DataSource m72785h() {
        if (this.f35808g == null) {
            try {
                DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f35808g = dataSource;
                m72791b(dataSource);
            } catch (ClassNotFoundException unused) {
                Log.m72602w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f35808g == null) {
                this.f35808g = this.f35804c;
            }
        }
        return this.f35808g;
    }

    /* renamed from: i */
    private DataSource m72784i() {
        if (this.f35809h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f35809h = udpDataSource;
            m72791b(udpDataSource);
        }
        return this.f35809h;
    }

    /* renamed from: j */
    private void m72783j(@Nullable DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35804c.addTransferListener(transferListener);
        this.f35803b.add(transferListener);
        m72783j(this.f35805d, transferListener);
        m72783j(this.f35806e, transferListener);
        m72783j(this.f35807f, transferListener);
        m72783j(this.f35808g, transferListener);
        m72783j(this.f35809h, transferListener);
        m72783j(this.f35810i, transferListener);
        m72783j(this.f35811j, transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource = this.f35812k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f35812k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        DataSource dataSource = this.f35812k;
        if (dataSource == null) {
            return Collections.emptyMap();
        }
        return dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSource dataSource = this.f35812k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        boolean z;
        if (this.f35812k == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            String path = dataSpec.uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f35812k = m72790c();
            } else {
                this.f35812k = m72787f();
            }
        } else if ("asset".equals(scheme)) {
            this.f35812k = m72790c();
        } else if ("content".equals(scheme)) {
            this.f35812k = m72789d();
        } else if ("rtmp".equals(scheme)) {
            this.f35812k = m72785h();
        } else if ("udp".equals(scheme)) {
            this.f35812k = m72784i();
        } else if ("data".equals(scheme)) {
            this.f35812k = m72788e();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f35812k = this.f35804c;
        } else {
            this.f35812k = m72786g();
        }
        return this.f35812k.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((DataSource) Assertions.checkNotNull(this.f35812k)).read(bArr, i, i2);
    }

    public DefaultDataSource(Context context, @Nullable String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public DefaultDataSource(Context context, @Nullable String str, int i, int i2, boolean z) {
        this(context, new DefaultHttpDataSource.Factory().setUserAgent(str).setConnectTimeoutMs(i).setReadTimeoutMs(i2).setAllowCrossProtocolRedirects(z).createDataSource());
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.f35802a = context.getApplicationContext();
        this.f35804c = (DataSource) Assertions.checkNotNull(dataSource);
        this.f35803b = new ArrayList();
    }
}
