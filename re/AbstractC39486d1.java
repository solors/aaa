package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tagged.kt */
@Metadata
/* renamed from: re.d1 */
/* loaded from: classes8.dex */
public abstract class AbstractC39486d1 extends AbstractC39492e2<String> {
    @NotNull
    /* renamed from: a0 */
    protected abstract String mo6868a0(@NotNull String str, @NotNull String str2);

    @NotNull
    /* renamed from: b0 */
    protected abstract String mo6669b0(@NotNull SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.AbstractC39492e2
    @NotNull
    /* renamed from: c0 */
    public final String mo12456X(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return m12486d0(mo6669b0(serialDescriptor, i));
    }

    @NotNull
    /* renamed from: d0 */
    protected final String m12486d0(@NotNull String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String m12457W = m12457W();
        if (m12457W == null) {
            m12457W = "";
        }
        return mo6868a0(m12457W, nestedName);
    }
}
