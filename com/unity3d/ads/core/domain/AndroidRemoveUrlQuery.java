package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidRemoveUrlQuery.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    @NotNull
    public String invoke(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(url).buildUpon().c…uery().build().toString()");
        return uri;
    }
}
