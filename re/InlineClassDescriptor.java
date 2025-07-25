package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: re.k0 */
/* loaded from: classes8.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final boolean f103872m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(@NotNull String name, @NotNull PluginHelperInterfaces<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f103872m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.m17075f(mo12259h(), serialDescriptor.mo12259h())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.isInline() && Arrays.equals(m16032o(), inlineClassDescriptor.m16032o())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && mo12262e() == serialDescriptor.mo12262e()) {
                    int mo12262e = mo12262e();
                    for (int i = 0; i < mo12262e; i++) {
                        if (Intrinsics.m17075f(mo12263d(i).mo12259h(), serialDescriptor.mo12263d(i).mo12259h()) && Intrinsics.m17075f(mo12263d(i).getKind(), serialDescriptor.mo12263d(i).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f103872m;
    }
}
