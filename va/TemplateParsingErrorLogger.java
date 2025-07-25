package va;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656eb.ParsingErrorLogger;

@Metadata
/* renamed from: va.t */
/* loaded from: classes8.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {
    @NotNull

    /* renamed from: c */
    private final ParsingErrorLogger f116921c;
    @NotNull

    /* renamed from: d */
    private final String f116922d;

    public TemplateParsingErrorLogger(@NotNull ParsingErrorLogger logger, @NotNull String templateId) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f116921c = logger;
        this.f116922d = templateId;
    }

    @Override // p656eb.ParsingErrorLogger
    /* renamed from: b */
    public void mo2528b(@NotNull Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f116921c.m25395d(e, this.f116922d);
    }
}
