package ie;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.j0 */
/* loaded from: classes8.dex */
final /* synthetic */ class SystemProps {

    /* renamed from: a */
    private static final int f92102a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m22964a() {
        return f92102a;
    }

    @Nullable
    /* renamed from: b */
    public static final String m22963b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
