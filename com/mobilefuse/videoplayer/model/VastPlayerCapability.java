package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.EnumWithValue;
import kotlin.Metadata;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.jetbrains.annotations.NotNull;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastPlayerCapability implements EnumWithValue<String> {
    SKIP(EventConstants.SKIP),
    MUTE("mute"),
    AUTOPLAY("autoplay"),
    MUTED_AUTOPLAY("mautoplay"),
    FULLSCREEN("fullscreen"),
    ICON("icon");
    
    @NotNull
    private final String value;

    VastPlayerCapability(String str) {
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
