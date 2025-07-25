package re;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39408h;

@Metadata
/* renamed from: re.p1 */
/* loaded from: classes8.dex */
public final class PluginGeneratedSerialDescriptor {
    /* renamed from: a */
    public static final int m12347a(@NotNull SerialDescriptor serialDescriptor, @NotNull SerialDescriptor[] typeParams) {
        int i;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (serialDescriptor.mo12259h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> m12758a = p851qe.SerialDescriptor.m12758a(serialDescriptor);
        Iterator<SerialDescriptor> it = m12758a.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String mo12259h = it.next().mo12259h();
            if (mo12259h != null) {
                i4 = mo12259h.hashCode();
            }
            i3 = i5 + i4;
        }
        for (SerialDescriptor serialDescriptor2 : m12758a) {
            int i6 = i2 * 31;
            AbstractC39408h kind = serialDescriptor2.getKind();
            if (kind != null) {
                i = kind.hashCode();
            } else {
                i = 0;
            }
            i2 = i6 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
