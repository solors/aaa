package p1073z9;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sb.Div;

/* compiled from: DivTabsAdapter.kt */
@Metadata
/* renamed from: z9.n */
/* loaded from: classes8.dex */
final class C45226n {

    /* renamed from: a */
    private final int f118889a;
    @NotNull

    /* renamed from: b */
    private final Div f118890b;
    @NotNull

    /* renamed from: c */
    private final View f118891c;

    public C45226n(int i, @NotNull Div div, @NotNull View view) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f118889a = i;
        this.f118890b = div;
        this.f118891c = view;
    }

    @NotNull
    /* renamed from: a */
    public final Div m605a() {
        return this.f118890b;
    }

    @NotNull
    /* renamed from: b */
    public final View m604b() {
        return this.f118891c;
    }
}
