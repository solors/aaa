package va;

import gb.TemplateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656eb.JsonTemplate;
import p656eb.ParsingEnvironment;
import p656eb.ParsingErrorLogger;

@Metadata
/* renamed from: va.s */
/* loaded from: classes8.dex */
public final class ParsingEnvironmentImpl implements ParsingEnvironment {
    @NotNull

    /* renamed from: a */
    private final TemplateProvider<JsonTemplate<?>> f116919a;
    @NotNull

    /* renamed from: b */
    private final ParsingErrorLogger f116920b;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(@NotNull TemplateProvider<? extends JsonTemplate<?>> templates, @NotNull ParsingErrorLogger logger) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f116919a = templates;
        this.f116920b = logger;
    }

    @Override // p656eb.ParsingEnvironment
    @NotNull
    /* renamed from: a */
    public TemplateProvider<JsonTemplate<?>> mo2530a() {
        return this.f116919a;
    }

    @Override // p656eb.ParsingEnvironment
    @NotNull
    /* renamed from: b */
    public ParsingErrorLogger mo2529b() {
        return this.f116920b;
    }
}
