package p743ja;

import gb.CachingTemplateProvider;
import gb.InMemoryTemplateProvider;
import gb.TemplateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p656eb.ParsingEnvironment;
import p656eb.ParsingErrorLogger;
import p656eb.TemplateParsingEnvironment;
import sb.DivTemplate;

@Metadata
/* renamed from: ja.b */
/* loaded from: classes8.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<DivTemplate> {
    @NotNull

    /* renamed from: d */
    private final CachingTemplateProvider<DivTemplate> f98469d;
    @NotNull

    /* renamed from: e */
    private final TemplateParsingEnvironment.InterfaceC32966a<DivTemplate> f98470e;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.f90841a.m24217a()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final DivTemplate m18503i(ParsingEnvironment env, boolean z, JSONObject json) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        return DivTemplate.f105744a.m10932b(env, z, json);
    }

    @Override // p656eb.TemplateParsingEnvironment
    @NotNull
    /* renamed from: c */
    public TemplateParsingEnvironment.InterfaceC32966a<DivTemplate> mo18506c() {
        return this.f98470e;
    }

    @Override // p656eb.ParsingEnvironment
    @NotNull
    /* renamed from: h */
    public CachingTemplateProvider<DivTemplate> mo2530a() {
        return this.f98469d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivParsingEnvironment(@NotNull ParsingErrorLogger logger, @NotNull CachingTemplateProvider<DivTemplate> templateProvider) {
        super(logger, templateProvider);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(templateProvider, "templateProvider");
        this.f98469d = templateProvider;
        this.f98470e = new TemplateParsingEnvironment.InterfaceC32966a() { // from class: ja.a
            @Override // p656eb.TemplateParsingEnvironment.InterfaceC32966a
            /* renamed from: a */
            public final Object mo18507a(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
                DivTemplate m18503i;
                m18503i = DivParsingEnvironment.m18503i(parsingEnvironment, z, jSONObject);
                return m18503i;
            }
        };
    }
}
