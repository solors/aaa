package re;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: re.f0 */
/* loaded from: classes8.dex */
public interface PluginHelperInterfaces<T> extends KSerializer<T> {

    /* compiled from: PluginHelperInterfaces.kt */
    @Metadata
    /* renamed from: re.f0$a */
    /* loaded from: classes8.dex */
    public static final class C39494a {
        @NotNull
        /* renamed from: a */
        public static <T> KSerializer<?>[] m12438a(@NotNull PluginHelperInterfaces<T> pluginHelperInterfaces) {
            return C39536q1.f103906a;
        }
    }

    @NotNull
    KSerializer<?>[] childSerializers();

    @NotNull
    KSerializer<?>[] typeParametersSerializers();
}
