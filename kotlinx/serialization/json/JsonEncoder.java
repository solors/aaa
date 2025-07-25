package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.serialization.json.l */
/* loaded from: classes8.dex */
public interface JsonEncoder extends Encoding, InterfaceC37834d {
    @NotNull
    /* renamed from: d */
    Json mo6809d();

    /* renamed from: q */
    void mo6801q(@NotNull JsonElement jsonElement);
}
