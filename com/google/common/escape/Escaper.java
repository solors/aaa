package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Escaper {

    /* renamed from: a */
    private final Function<String, String> f40900a = new Function() { // from class: com.google.common.escape.a
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Escaper.this.escape((String) obj);
        }
    };

    public final Function<String, String> asFunction() {
        return this.f40900a;
    }

    public abstract String escape(String str);
}
