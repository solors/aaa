package p821oe;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: oe.b */
/* loaded from: classes8.dex */
public interface KSerializer<T> {
    T deserialize(@NotNull Decoding decoding);

    @NotNull
    SerialDescriptor getDescriptor();
}
