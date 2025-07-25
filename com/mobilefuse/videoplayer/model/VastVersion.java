package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.EnumWithValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastVersion implements EnumWithValue<Integer> {
    VAST1(1),
    VAST2(2),
    VAST3(3),
    VAST1_WRAPPER(4),
    VAST2_WRAPPER(5),
    VAST3_WRAPPER(6),
    VAST4(7),
    VAST4_WRAPPER(8),
    DAAST1(9),
    DAAST1_WRAPPER(10),
    VAST4_1(11),
    VAST4_1_WRAPPER(12),
    VAST4_2(13),
    VAST4_2_WRAPPER(14);
    
    private final int value;

    VastVersion(int i) {
        this.value = i;
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getStringValue() {
        return EnumWithValue.DefaultImpls.getStringValue(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }
}
