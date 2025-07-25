package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BaseDataSource implements DataSource {

    /* renamed from: a */
    private final boolean f35733a;

    /* renamed from: b */
    private final ArrayList<TransferListener> f35734b = new ArrayList<>(1);

    /* renamed from: c */
    private int f35735c;
    @Nullable

    /* renamed from: d */
    private DataSpec f35736d;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseDataSource(boolean z) {
        this.f35733a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        if (!this.f35734b.contains(transferListener)) {
            this.f35734b.add(transferListener);
            this.f35735c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m72806b(int i) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.f35736d);
        for (int i2 = 0; i2 < this.f35735c; i2++) {
            this.f35734b.get(i2).onBytesTransferred(this, dataSpec, this.f35733a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m72805c() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.f35736d);
        for (int i = 0; i < this.f35735c; i++) {
            this.f35734b.get(i).onTransferEnd(this, dataSpec, this.f35733a);
        }
        this.f35736d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m72804d(DataSpec dataSpec) {
        for (int i = 0; i < this.f35735c; i++) {
            this.f35734b.get(i).onTransferInitializing(this, dataSpec, this.f35733a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m72803e(DataSpec dataSpec) {
        this.f35736d = dataSpec;
        for (int i = 0; i < this.f35735c; i++) {
            this.f35734b.get(i).onTransferStart(this, dataSpec, this.f35733a);
        }
    }
}
