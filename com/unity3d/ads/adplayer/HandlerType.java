package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HandlerType.kt */
@Metadata
/* loaded from: classes7.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");
    
    @NotNull
    private final String jsPath;

    HandlerType(String str) {
        this.jsPath = str;
    }

    @NotNull
    public final String getJsPath() {
        return this.jsPath;
    }
}
