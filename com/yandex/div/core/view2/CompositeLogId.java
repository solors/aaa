package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: com.yandex.div.core.view2.f */
/* loaded from: classes8.dex */
public final class CompositeLogId {
    @NotNull

    /* renamed from: a */
    private final String f75742a;
    @NotNull

    /* renamed from: b */
    private final String f75743b;
    @NotNull

    /* renamed from: c */
    private final String f75744c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC38501j f75745d;

    /* compiled from: CompositeLogId.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.f$a */
    /* loaded from: classes8.dex */
    static final class C29708a extends Lambda implements Functions<String> {
        C29708a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final String invoke() {
            return CompositeLogId.this.m36884b();
        }
    }

    public CompositeLogId(@NotNull String dataTag, @NotNull String scopeLogId, @NotNull String actionLogId) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(dataTag, "dataTag");
        Intrinsics.checkNotNullParameter(scopeLogId, "scopeLogId");
        Intrinsics.checkNotNullParameter(actionLogId, "actionLogId");
        this.f75742a = dataTag;
        this.f75743b = scopeLogId;
        this.f75744c = actionLogId;
        m14554a = LazyJVM.m14554a(new C29708a());
        this.f75745d = m14554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final String m36884b() {
        boolean z;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f75742a);
        if (this.f75743b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = '#' + this.f75743b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f75744c);
        return sb2.toString();
    }

    /* renamed from: c */
    private final String m36883c() {
        return (String) this.f75745d.getValue();
    }

    @NotNull
    /* renamed from: d */
    public final String m36882d() {
        return this.f75742a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        if (Intrinsics.m17075f(this.f75742a, compositeLogId.f75742a) && Intrinsics.m17075f(this.f75743b, compositeLogId.f75743b) && Intrinsics.m17075f(this.f75744c, compositeLogId.f75744c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f75742a.hashCode() * 31) + this.f75743b.hashCode()) * 31) + this.f75744c.hashCode();
    }

    @NotNull
    public String toString() {
        return m36883c();
    }
}
