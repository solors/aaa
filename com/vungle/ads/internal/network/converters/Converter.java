package com.vungle.ads.internal.network.converters;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.network.converters.a */
/* loaded from: classes7.dex */
public interface Converter<In, Out> {
    @Nullable
    Out convert(In in) throws IOException;
}
