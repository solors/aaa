package se;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import re.ElementMarker;

@Metadata
/* renamed from: se.h0 */
/* loaded from: classes8.dex */
public final class JsonElementMarker {
    @NotNull

    /* renamed from: a */
    private final ElementMarker f111840a;

    /* renamed from: b */
    private boolean f111841b;

    /* compiled from: JsonElementMarker.kt */
    @Metadata
    /* renamed from: se.h0$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C42704a extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
        C42704a(Object obj) {
            super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m6781a(@NotNull SerialDescriptor p0, int i) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((JsonElementMarker) this.receiver).m6782e(p0, i));
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo105910invoke(SerialDescriptor serialDescriptor, Integer num) {
            return m6781a(serialDescriptor, num.intValue());
        }
    }

    public JsonElementMarker(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f111840a = new ElementMarker(descriptor, new C42704a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m6782e(SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (!serialDescriptor.mo12258i(i) && serialDescriptor.mo12263d(i).mo12265b()) {
            z = true;
        } else {
            z = false;
        }
        this.f111841b = z;
        return z;
    }

    /* renamed from: b */
    public final boolean m6785b() {
        return this.f111841b;
    }

    /* renamed from: c */
    public final void m6784c(int i) {
        this.f111840a.m12270a(i);
    }

    /* renamed from: d */
    public final int m6783d() {
        return this.f111840a.m12267d();
    }
}
