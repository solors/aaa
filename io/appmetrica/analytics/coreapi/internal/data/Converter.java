package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public interface Converter<S, P> {
    P fromModel(S s);

    S toModel(P p);
}
