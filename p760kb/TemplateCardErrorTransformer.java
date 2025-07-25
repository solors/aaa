package p760kb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656eb.ParsingErrorLogger;
import p818ob.C39138c;
import p834pb.CardErrorTransformer;

@Metadata
/* renamed from: kb.b */
/* loaded from: classes8.dex */
public class TemplateCardErrorTransformer implements CardErrorTransformer {
    @NotNull

    /* renamed from: c */
    public static final C37444a f98811c = new C37444a(null);
    @NotNull

    /* renamed from: a */
    private final C39138c f98812a;
    @NotNull

    /* renamed from: b */
    private final ParsingErrorLogger f98813b;

    /* compiled from: TemplateCardErrorTransformer.kt */
    @Metadata
    /* renamed from: kb.b$a */
    /* loaded from: classes8.dex */
    public static final class C37444a {
        private C37444a() {
        }

        public /* synthetic */ C37444a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TemplateCardErrorTransformer(@NotNull C39138c templateContainer, @NotNull ParsingErrorLogger internalLogger) {
        Intrinsics.checkNotNullParameter(templateContainer, "templateContainer");
        Intrinsics.checkNotNullParameter(internalLogger, "internalLogger");
        this.f98812a = templateContainer;
        this.f98813b = internalLogger;
    }
}
