package p818ob;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p817oa.InterfaceC39122g;

@Metadata
/* renamed from: ob.b */
/* loaded from: classes8.dex */
public class DivParsingHistogramProxy {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f102804a;

    public DivParsingHistogramProxy(@NotNull Functions<? extends InterfaceC39122g> initReporter) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(initReporter, "initReporter");
        m14554a = LazyJVM.m14554a(initReporter);
        this.f102804a = m14554a;
    }
}
