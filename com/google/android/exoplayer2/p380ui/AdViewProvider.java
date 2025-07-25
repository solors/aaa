package com.google.android.exoplayer2.p380ui;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.AdViewProvider */
/* loaded from: classes4.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.m69424of();
    }

    @Nullable
    ViewGroup getAdViewGroup();
}
