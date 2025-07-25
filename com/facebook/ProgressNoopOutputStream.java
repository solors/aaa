package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressNoopOutputStream.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {
    @Nullable
    private final Handler callbackHandler;
    @Nullable
    private GraphRequest currentRequest;
    @Nullable
    private RequestProgress currentRequestProgress;
    private int maxProgress;
    @NotNull
    private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();

    public ProgressNoopOutputStream(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    public final void addProgress(long j) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            RequestProgress requestProgress = new RequestProgress(this.callbackHandler, graphRequest);
            this.currentRequestProgress = requestProgress;
            this.progressMap.put(graphRequest, requestProgress);
        }
        RequestProgress requestProgress2 = this.currentRequestProgress;
        if (requestProgress2 != null) {
            requestProgress2.addToMax(j);
        }
        this.maxProgress += (int) j;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final Map<GraphRequest, RequestProgress> getProgressMap() {
        return this.progressMap;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(@Nullable GraphRequest graphRequest) {
        RequestProgress requestProgress;
        this.currentRequest = graphRequest;
        if (graphRequest != null) {
            requestProgress = this.progressMap.get(graphRequest);
        } else {
            requestProgress = null;
        }
        this.currentRequestProgress = requestProgress;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        addProgress(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        addProgress(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        addProgress(1L);
    }
}
