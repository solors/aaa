package p743ja;

import gb.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656eb.JsonTemplate;
import p656eb.ParsingEnvironment;
import p656eb.ParsingErrorLogger;

@Metadata
/* renamed from: ja.d */
/* loaded from: classes8.dex */
public final class ErrorsCollectorEnvironment implements ParsingEnvironment {
    @NotNull

    /* renamed from: a */
    private final ParsingErrorLogger f98472a;
    @NotNull

    /* renamed from: b */
    private final List<Exception> f98473b;
    @NotNull

    /* renamed from: c */
    private final TemplateProvider<JsonTemplate<?>> f98474c;
    @NotNull

    /* renamed from: d */
    private final ParsingErrorLogger f98475d;

    public ErrorsCollectorEnvironment(@NotNull ParsingEnvironment origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f98472a = origin.mo2529b();
        this.f98473b = new ArrayList();
        this.f98474c = origin.mo2530a();
        this.f98475d = new ParsingErrorLogger() { // from class: ja.c
            @Override // p656eb.ParsingErrorLogger
            /* renamed from: b */
            public final void mo2528b(Exception exc) {
                ErrorsCollectorEnvironment.m18502c(ErrorsCollectorEnvironment.this, exc);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m18502c(ErrorsCollectorEnvironment errorsCollectorEnvironment, Exception exc) {
        m18500e(errorsCollectorEnvironment, exc);
    }

    /* renamed from: e */
    public static final void m18500e(ErrorsCollectorEnvironment this$0, Exception e) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "e");
        this$0.f98473b.add(e);
        this$0.f98472a.mo2528b(e);
    }

    @Override // p656eb.ParsingEnvironment
    @NotNull
    /* renamed from: a */
    public TemplateProvider<JsonTemplate<?>> mo2530a() {
        return this.f98474c;
    }

    @Override // p656eb.ParsingEnvironment
    @NotNull
    /* renamed from: b */
    public ParsingErrorLogger mo2529b() {
        return this.f98475d;
    }

    @NotNull
    /* renamed from: d */
    public final List<Exception> m18501d() {
        List<Exception> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(this.f98473b);
        return m17553Z0;
    }
}
