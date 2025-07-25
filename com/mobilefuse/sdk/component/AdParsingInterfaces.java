package com.mobilefuse.sdk.component;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.Flow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.component.AdmParser */
/* loaded from: classes7.dex */
public interface AdParsingInterfaces {
    @NotNull
    ParsingAbility getParsingAbility(@NotNull String str);

    @NotNull
    Flow<Either<ParsingError, ParsedAdMarkup>> parse(@NotNull String str);
}
