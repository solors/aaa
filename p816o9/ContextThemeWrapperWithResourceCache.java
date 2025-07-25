package p816o9;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: o9.a */
/* loaded from: classes8.dex */
public final class ContextThemeWrapperWithResourceCache extends ContextThemeWrapper {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f102739a;

    /* compiled from: ContextThemeWrapperWithResourceCache.kt */
    @Metadata
    /* renamed from: o9.a$a */
    /* loaded from: classes8.dex */
    static final class C39116a extends Lambda implements Functions<PrimitiveResourceCache> {
        C39116a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final PrimitiveResourceCache invoke() {
            Resources resources = ContextThemeWrapperWithResourceCache.super.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "super.getResources()");
            return new PrimitiveResourceCache(resources);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextThemeWrapperWithResourceCache(@NotNull Context baseContext, @StyleRes int i) {
        super(baseContext, i);
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        m14554a = LazyJVM.m14554a(new C39116a());
        this.f102739a = m14554a;
    }

    /* renamed from: b */
    private final Resources m13915b() {
        return (Resources) this.f102739a.getValue();
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return m13915b();
    }
}
