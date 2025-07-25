package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.oa */
/* loaded from: classes6.dex */
public abstract class AbstractC19401oa {

    /* renamed from: a */
    public Constructor f48561a;

    public AbstractC19401oa(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.f48561a = constructor;
    }

    @NotNull
    /* renamed from: a */
    public final Constructor<Object> m59983a() {
        return this.f48561a;
    }

    /* renamed from: a */
    public final void m59982a(@NotNull Constructor<Object> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "<set-?>");
        this.f48561a = constructor;
    }
}
