package p670fa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p985ta.DivItemBuilderResult;
import sb.Div;

@Metadata
/* renamed from: fa.g */
/* loaded from: classes8.dex */
public abstract class Token {
    @NotNull

    /* renamed from: a */
    private final DivItemBuilderResult f90380a;

    /* renamed from: b */
    private final int f90381b;

    /* renamed from: c */
    private final int f90382c;
    @NotNull

    /* renamed from: d */
    private final Div f90383d;

    public Token(@NotNull DivItemBuilderResult item, int i) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f90380a = item;
        this.f90381b = i;
        this.f90382c = item.m3148c().mo7723l();
        this.f90383d = item.m3148c();
    }

    /* renamed from: a */
    public final int m24856a() {
        return this.f90381b;
    }

    @NotNull
    /* renamed from: b */
    public final Div m24855b() {
        return this.f90383d;
    }

    /* renamed from: c */
    public final int m24854c() {
        return this.f90382c;
    }

    @NotNull
    /* renamed from: d */
    public final DivItemBuilderResult m24853d() {
        return this.f90380a;
    }
}
