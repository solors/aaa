package p644e;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: e.a */
/* loaded from: classes2.dex */
public final class Coil {
    @NotNull

    /* renamed from: a */
    public static final Coil f89625a = new Coil();
    @Nullable

    /* renamed from: b */
    private static InterfaceC32886e f89626b;
    @Nullable

    /* renamed from: c */
    private static ImageLoaderFactory f89627c;

    private Coil() {
    }

    @NotNull
    /* renamed from: a */
    public static final InterfaceC32886e m25620a(@NotNull Context context) {
        InterfaceC32886e interfaceC32886e = f89626b;
        if (interfaceC32886e == null) {
            return f89625a.m25619b(context);
        }
        return interfaceC32886e;
    }

    /* renamed from: b */
    private final synchronized InterfaceC32886e m25619b(Context context) {
        ImageLoaderFactory imageLoaderFactory;
        InterfaceC32886e m25560a;
        InterfaceC32886e interfaceC32886e = f89626b;
        if (interfaceC32886e != null) {
            return interfaceC32886e;
        }
        ImageLoaderFactory imageLoaderFactory2 = f89627c;
        if (imageLoaderFactory2 == null || (m25560a = imageLoaderFactory2.m25561a()) == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof ImageLoaderFactory) {
                imageLoaderFactory = (ImageLoaderFactory) applicationContext;
            } else {
                imageLoaderFactory = null;
            }
            if (imageLoaderFactory != null) {
                m25560a = imageLoaderFactory.m25561a();
            } else {
                m25560a = ImageLoaders.m25560a(context);
            }
        }
        f89627c = null;
        f89626b = m25560a;
        return m25560a;
    }
}
