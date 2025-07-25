package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: re.d */
/* loaded from: classes8.dex */
public final class CollectionDescriptors extends AbstractC39550v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDescriptors(@NotNull SerialDescriptor elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return "kotlin.Array";
    }
}
