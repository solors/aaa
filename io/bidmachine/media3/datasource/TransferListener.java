package io.bidmachine.media3.datasource;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z);
}
