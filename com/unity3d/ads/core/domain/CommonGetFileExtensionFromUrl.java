package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetFileExtensionFromUrl.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    @NotNull
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(@NotNull RemoveUrlQuery removeUrlQuery) {
        Intrinsics.checkNotNullParameter(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    @NotNull
    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    @Nullable
    public String invoke(@NotNull String url) {
        String m16593Q0;
        boolean m16594Q;
        String m16593Q02;
        Intrinsics.checkNotNullParameter(url, "url");
        String invoke = this.removeUrlQuery.invoke(url);
        if (invoke != null) {
            m16593Q0 = C37690r.m16593Q0(invoke, '/', null, 2, null);
            boolean z = false;
            m16594Q = C37690r.m16594Q(m16593Q0, '.', false, 2, null);
            if (m16594Q) {
                m16593Q02 = C37690r.m16593Q0(m16593Q0, '.', null, 2, null);
                if (m16593Q02.length() == 0) {
                    z = true;
                }
                if (z) {
                    return null;
                }
                return m16593Q02;
            }
            return null;
        }
        return null;
    }
}
