package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionDescriptors.kt */
@Metadata
/* renamed from: re.s1 */
/* loaded from: classes8.dex */
public final class C39542s1 extends AbstractC39550v0 {
    @NotNull

    /* renamed from: c */
    private final String f103909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39542s1(@NotNull SerialDescriptor primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f103909c = primitive.mo12259h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return this.f103909c;
    }
}
