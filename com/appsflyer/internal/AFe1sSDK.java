package com.appsflyer.internal;

import androidx.webkit.internal.AssetHelper;
import com.maticoo.sdk.utils.request.network.Headers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum AFe1sSDK {
    TEXT(AssetHelper.DEFAULT_MIME_TYPE),
    JSON("application/json"),
    OCTET_STREAM(Headers.VALUE_APPLICATION_STREAM),
    XML(Headers.VALUE_APPLICATION_XML),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");
    
    @NotNull
    public final String values;

    AFe1sSDK(String str) {
        this.values = str;
    }
}
