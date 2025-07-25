package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39165j;

/* compiled from: KSerializer.kt */
@Metadata
/* loaded from: classes8.dex */
public interface KSerializer<T> extends InterfaceC39165j<T>, p821oe.KSerializer<T> {
    @Override // p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    SerialDescriptor getDescriptor();
}
