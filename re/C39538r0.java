package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionDescriptors.kt */
@Metadata
/* renamed from: re.r0 */
/* loaded from: classes8.dex */
public final class C39538r0 extends AbstractC39563z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39538r0(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
        super("kotlin.collections.LinkedHashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
