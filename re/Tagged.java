package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: re.c1 */
/* loaded from: classes8.dex */
public abstract class Tagged extends AbstractC39487d2<String> {
    @NotNull
    /* renamed from: Z */
    protected abstract String mo6905Z(@NotNull String str, @NotNull String str2);

    @NotNull
    /* renamed from: a0 */
    protected String mo6667a0(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.mo12261f(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.AbstractC39487d2
    @NotNull
    /* renamed from: b0 */
    public final String mo12478V(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return m12492c0(mo6667a0(serialDescriptor, i));
    }

    @NotNull
    /* renamed from: c0 */
    protected final String m12492c0(@NotNull String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String m12479U = m12479U();
        if (m12479U == null) {
            m12479U = "";
        }
        return mo6905Z(m12479U, nestedName);
    }
}
