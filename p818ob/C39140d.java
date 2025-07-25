package p818ob;

import gb.CachingTemplateProvider;
import gb.InMemoryTemplateProvider;
import gb.TemplateProvider;
import kotlin.Metadata;
import p656eb.ParsingErrorLogger;
import p743ja.DivParsingEnvironment;

/* compiled from: TemplatesContainer.kt */
@Metadata
/* renamed from: ob.d */
/* loaded from: classes8.dex */
public final class C39140d {
    /* renamed from: a */
    public static final /* synthetic */ DivParsingEnvironment m13846a(ParsingErrorLogger parsingErrorLogger) {
        return m13845b(parsingErrorLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final DivParsingEnvironment m13845b(ParsingErrorLogger parsingErrorLogger) {
        return new DivParsingEnvironment(parsingErrorLogger, new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.f90841a.m24217a()));
    }
}
