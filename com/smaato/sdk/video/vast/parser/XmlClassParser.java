package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface XmlClassParser<Result> {
    @NonNull
    ParseResult<Result> parse(@NonNull RegistryXmlParser registryXmlParser);
}
