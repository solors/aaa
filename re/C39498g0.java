package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionDescriptors.kt */
@Metadata
/* renamed from: re.g0 */
/* loaded from: classes8.dex */
public final class C39498g0 extends AbstractC39563z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39498g0(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
