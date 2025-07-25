package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.PriorityTaskManager;

@Deprecated
/* loaded from: classes4.dex */
public final class PriorityDataSourceFactory implements DataSource.Factory {

    /* renamed from: a */
    private final DataSource.Factory f35878a;

    /* renamed from: b */
    private final PriorityTaskManager f35879b;

    /* renamed from: c */
    private final int f35880c;

    public PriorityDataSourceFactory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i) {
        this.f35878a = factory;
        this.f35879b = priorityTaskManager;
        this.f35880c = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public PriorityDataSource createDataSource() {
        return new PriorityDataSource(this.f35878a.createDataSource(), this.f35879b, this.f35880c);
    }
}
