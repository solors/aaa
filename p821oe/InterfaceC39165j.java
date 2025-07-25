package p821oe;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;

/* compiled from: KSerializer.kt */
@Metadata
/* renamed from: oe.j */
/* loaded from: classes8.dex */
public interface InterfaceC39165j<T> {
    @NotNull
    SerialDescriptor getDescriptor();

    void serialize(@NotNull Encoding encoding, T t);
}
