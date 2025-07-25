package p818ob;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.ParsingErrorLogger;
import p743ja.DivParsingEnvironment;
import p744jb.DivStorage;
import p790mb.HistogramNameProvider;
import p790mb.HistogramRecorder;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: TemplatesContainer.kt */
@Metadata
/* renamed from: ob.c */
/* loaded from: classes8.dex */
public class C39138c {
    @NotNull

    /* renamed from: a */
    private final DivStorage f102805a;
    @NotNull

    /* renamed from: b */
    private final ParsingErrorLogger f102806b;
    @NotNull

    /* renamed from: c */
    private final HistogramRecorder f102807c;
    @NotNull

    /* renamed from: d */
    private final Provider<DivParsingHistogramProxy> f102808d;
    @Nullable

    /* renamed from: e */
    private final String f102809e;
    @NotNull

    /* renamed from: f */
    private final TemplatesContainer f102810f;
    @NotNull

    /* renamed from: g */
    private final Map<String, Object> f102811g;
    @NotNull

    /* renamed from: h */
    private final Map<String, DivParsingEnvironment> f102812h;
    @NotNull

    /* renamed from: i */
    private final InterfaceC38501j f102813i;

    /* compiled from: TemplatesContainer.kt */
    @Metadata
    /* renamed from: ob.c$a */
    /* loaded from: classes8.dex */
    static final class C39139a extends Lambda implements Functions<MessageDigest> {
        C39139a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: b */
        public final MessageDigest invoke() {
            try {
                return MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException e) {
                C39138c.this.f102806b.mo2528b(new IllegalStateException("Storage cannot work with templates!", e));
                return null;
            }
        }
    }

    public C39138c(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger errorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull Provider<DivParsingHistogramProxy> parsingHistogramProxy, @Nullable HistogramNameProvider histogramNameProvider) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(divStorage, "divStorage");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(parsingHistogramProxy, "parsingHistogramProxy");
        this.f102805a = divStorage;
        this.f102806b = errorLogger;
        this.f102807c = histogramRecorder;
        this.f102808d = parsingHistogramProxy;
        this.f102809e = null;
        this.f102810f = new TemplatesContainer(divStorage, errorLogger, null, histogramRecorder, parsingHistogramProxy);
        this.f102811g = new LinkedHashMap();
        this.f102812h = new LinkedHashMap();
        m14554a = LazyJVM.m14554a(new C39139a());
        this.f102813i = m14554a;
    }
}
