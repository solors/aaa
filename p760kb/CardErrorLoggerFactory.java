package p760kb;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.ParsingErrorLogger;
import p818ob.C39138c;
import p834pb.CardErrorTransformer;
import p834pb.LazyProvider;

@Metadata
/* renamed from: kb.a */
/* loaded from: classes8.dex */
public class CardErrorLoggerFactory {
    @NotNull

    /* renamed from: a */
    private final C39138c f98806a;
    @NotNull

    /* renamed from: b */
    private final ParsingErrorLogger f98807b;
    @NotNull

    /* renamed from: c */
    private final Provider<CardErrorTransformer> f98808c;

    /* compiled from: CardErrorLoggerFactory.kt */
    @Metadata
    /* renamed from: kb.a$a */
    /* loaded from: classes8.dex */
    static final class C37443a extends Lambda implements Functions<CardErrorTransformer> {

        /* renamed from: g */
        final /* synthetic */ Provider<? extends CardErrorTransformer> f98809g;

        /* renamed from: h */
        final /* synthetic */ CardErrorLoggerFactory f98810h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37443a(Provider<? extends CardErrorTransformer> provider, CardErrorLoggerFactory cardErrorLoggerFactory) {
            super(0);
            this.f98809g = provider;
            this.f98810h = cardErrorLoggerFactory;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final CardErrorTransformer invoke() {
            Provider<? extends CardErrorTransformer> provider = this.f98809g;
            if (provider == null) {
                return new TemplateCardErrorTransformer(this.f98810h.f98806a, this.f98810h.f98807b);
            }
            CardErrorTransformer cardErrorTransformer = provider.get();
            Intrinsics.checkNotNullExpressionValue(cardErrorTransformer, "externalErrorTransformer.get()");
            return new CardErrorTransformer.C39294a(cardErrorTransformer, new TemplateCardErrorTransformer(this.f98810h.f98806a, this.f98810h.f98807b));
        }
    }

    public CardErrorLoggerFactory(@Nullable Provider<? extends CardErrorTransformer> provider, @NotNull C39138c templateContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        Intrinsics.checkNotNullParameter(templateContainer, "templateContainer");
        Intrinsics.checkNotNullParameter(parsingErrorLogger, "parsingErrorLogger");
        this.f98806a = templateContainer;
        this.f98807b = parsingErrorLogger;
        this.f98808c = new LazyProvider(new C37443a(provider, this));
    }
}
