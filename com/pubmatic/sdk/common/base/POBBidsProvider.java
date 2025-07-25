package com.pubmatic.sdk.common.base;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes7.dex */
public interface POBBidsProvider {
    @Nullable
    Integer getNbrCode();

    @Nullable
    Map<String, String> getTargetingInfo();
}
