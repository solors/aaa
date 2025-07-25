package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class BaseDataSource implements DataSource {
    @Nullable
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners = new ArrayList<>(1);

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseDataSource(boolean z) {
        this.isNetwork = z;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        if (!this.listeners.contains(transferListener)) {
            this.listeners.add(transferListener);
            this.listenerCount++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bytesTransferred(int i) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onBytesTransferred(this, dataSpec, this.isNetwork, i);
        }
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public abstract /* synthetic */ void close() throws IOException;

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public abstract /* synthetic */ Uri getUri();

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public abstract /* synthetic */ long open(DataSpec dataSpec) throws IOException;

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public abstract /* synthetic */ int read(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void transferEnded() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void transferInitializing(DataSpec dataSpec) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void transferStarted(DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }
}
