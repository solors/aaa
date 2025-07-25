package com.mobilefuse.videoplayer.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.videoplayer.model.EnumWithValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VerificationApiFramework implements EnumWithValue<String> {
    OMID(CampaignEx.KEY_OMID);
    
    @NotNull
    private final String value;

    VerificationApiFramework(String str) {
        this.value = str;
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getStringValue() {
        return EnumWithValue.DefaultImpls.getStringValue(this);
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }
}
