package io.bidmachine.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface Allocator {

    /* loaded from: classes9.dex */
    public interface AllocationNode {
        Allocation getAllocation();

        @Nullable
        AllocationNode next();
    }

    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(AllocationNode allocationNode);

    void trim();
}
