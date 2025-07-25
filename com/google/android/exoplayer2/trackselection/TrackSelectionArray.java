package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TrackSelectionArray {

    /* renamed from: a */
    private final TrackSelection[] f35156a;

    /* renamed from: b */
    private int f35157b;
    public final int length;

    public TrackSelectionArray(TrackSelection... trackSelectionArr) {
        this.f35156a = trackSelectionArr;
        this.length = trackSelectionArr.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionArray.class == obj.getClass()) {
            return Arrays.equals(this.f35156a, ((TrackSelectionArray) obj).f35156a);
        }
        return false;
    }

    @Nullable
    public TrackSelection get(int i) {
        return this.f35156a[i];
    }

    public TrackSelection[] getAll() {
        return (TrackSelection[]) this.f35156a.clone();
    }

    public int hashCode() {
        if (this.f35157b == 0) {
            this.f35157b = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f35156a);
        }
        return this.f35157b;
    }
}
