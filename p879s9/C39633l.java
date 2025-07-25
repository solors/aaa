package p879s9;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata
/* renamed from: s9.l */
/* loaded from: classes8.dex */
public final class C39633l {
    @Nullable

    /* renamed from: a */
    private Functions<Unit> f104116a;

    public C39633l(@NotNull View view, @Nullable Functions<Unit> functions) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f104116a = functions;
        if (view.isAttachedToWindow()) {
            m12025b();
        }
    }

    /* renamed from: a */
    public final void m12026a() {
        this.f104116a = null;
    }

    /* renamed from: b */
    public final void m12025b() {
        Functions<Unit> functions = this.f104116a;
        if (functions != null) {
            functions.invoke();
        }
        this.f104116a = null;
    }
}
