package io.bidmachine.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes9.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.m69424of();
    }

    @Nullable
    ViewGroup getAdViewGroup();
}
