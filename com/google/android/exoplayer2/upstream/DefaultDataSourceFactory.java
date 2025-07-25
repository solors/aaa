package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;

@Deprecated
/* loaded from: classes4.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {

    /* renamed from: a */
    private final Context f35816a;
    @Nullable

    /* renamed from: b */
    private final TransferListener f35817b;

    /* renamed from: c */
    private final DataSource.Factory f35818c;

    public DefaultDataSourceFactory(Context context) {
        this(context, (String) null, (TransferListener) null);
    }

    public DefaultDataSourceFactory(Context context, @Nullable String str) {
        this(context, str, (TransferListener) null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DefaultDataSource createDataSource() {
        DefaultDataSource defaultDataSource = new DefaultDataSource(this.f35816a, this.f35818c.createDataSource());
        TransferListener transferListener = this.f35817b;
        if (transferListener != null) {
            defaultDataSource.addTransferListener(transferListener);
        }
        return defaultDataSource;
    }

    public DefaultDataSourceFactory(Context context, @Nullable String str, @Nullable TransferListener transferListener) {
        this(context, transferListener, new DefaultHttpDataSource.Factory().setUserAgent(str));
    }

    public DefaultDataSourceFactory(Context context, DataSource.Factory factory) {
        this(context, (TransferListener) null, factory);
    }

    public DefaultDataSourceFactory(Context context, @Nullable TransferListener transferListener, DataSource.Factory factory) {
        this.f35816a = context.getApplicationContext();
        this.f35817b = transferListener;
        this.f35818c = factory;
    }
}
