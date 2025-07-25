package com.yandex.div.core.view2.errors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.DivDataTag;
import sb.DivData;

@Metadata
/* renamed from: com.yandex.div.core.view2.errors.e */
/* loaded from: classes8.dex */
public class ErrorCollectors {
    @NotNull

    /* renamed from: a */
    private final Map<String, ErrorCollector> f75706a = new LinkedHashMap();

    @NotNull
    /* renamed from: a */
    public ErrorCollector m36935a(@NotNull DivDataTag tag, @Nullable DivData divData) {
        ErrorCollector errorCollector;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.f75706a) {
            Map<String, ErrorCollector> map = this.f75706a;
            String m676a = tag.m676a();
            Intrinsics.checkNotNullExpressionValue(m676a, "tag.id");
            ErrorCollector errorCollector2 = map.get(m676a);
            if (errorCollector2 == null) {
                errorCollector2 = new ErrorCollector();
                map.put(m676a, errorCollector2);
            }
            errorCollector2.m36944b(divData);
            errorCollector = errorCollector2;
        }
        return errorCollector;
    }

    @Nullable
    /* renamed from: b */
    public ErrorCollector m36934b(@NotNull DivDataTag tag, @Nullable DivData divData) {
        ErrorCollector errorCollector;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.f75706a) {
            errorCollector = this.f75706a.get(tag.m676a());
            if (errorCollector != null) {
                errorCollector.m36944b(divData);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }

    /* renamed from: c */
    public void m36933c(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.f75706a.clear();
            return;
        }
        for (DivDataTag divDataTag : tags) {
            this.f75706a.remove(divDataTag.m676a());
        }
    }
}
