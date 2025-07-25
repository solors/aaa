package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.M5 */
/* loaded from: classes6.dex */
public final class C19019M5 extends AbstractC19401oa {

    /* renamed from: b */
    public final Class f47469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19019M5(@NotNull Constructor<List<Object>> constructor, @NotNull Class<Object> valueClass) {
        super(constructor);
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(valueClass, "valueClass");
        this.f47469b = valueClass;
    }

    @NotNull
    /* renamed from: b */
    public final List<Object> m60903b() {
        return (List) m59983a().construct();
    }

    @NotNull
    /* renamed from: c */
    public final Class<Object> m60902c() {
        return this.f47469b;
    }
}
