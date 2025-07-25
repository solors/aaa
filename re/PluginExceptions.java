package re;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import p821oe.SerializationExceptions;

@Metadata
/* renamed from: re.o1 */
/* loaded from: classes8.dex */
public final class PluginExceptions {
    /* renamed from: a */
    public static final void m12351a(int i, int i2, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.mo12261f(i4));
            }
            i3 >>>= 1;
        }
        throw new SerializationExceptions(arrayList, descriptor.mo12259h());
    }
}
