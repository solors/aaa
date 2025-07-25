package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PriorityDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f35872a;

    /* renamed from: b */
    private final PriorityTaskManager f35873b;

    /* renamed from: c */
    private final int f35874c;

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        private final DataSource.Factory f35875a;

        /* renamed from: b */
        private final PriorityTaskManager f35876b;

        /* renamed from: c */
        private final int f35877c;

        public Factory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i) {
            this.f35875a = factory;
            this.f35876b = priorityTaskManager;
            this.f35877c = i;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public PriorityDataSource createDataSource() {
            return new PriorityDataSource(this.f35875a.createDataSource(), this.f35876b, this.f35877c);
        }
    }

    public PriorityDataSource(DataSource dataSource, PriorityTaskManager priorityTaskManager, int i) {
        this.f35872a = (DataSource) Assertions.checkNotNull(dataSource);
        this.f35873b = (PriorityTaskManager) Assertions.checkNotNull(priorityTaskManager);
        this.f35874c = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35872a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f35872a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f35872a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35872a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.f35873b.proceedOrThrow(this.f35874c);
        return this.f35872a.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f35873b.proceedOrThrow(this.f35874c);
        return this.f35872a.read(bArr, i, i2);
    }
}
