package p763kf;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747jf.C37357h;

@Metadata
/* renamed from: kf.l */
/* loaded from: classes10.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    @NotNull

    /* renamed from: j */
    public static final C37526a f99203j = new C37526a(null);
    @NotNull

    /* renamed from: h */
    private final Class<? super SSLSocketFactory> f99204h;
    @NotNull

    /* renamed from: i */
    private final Class<?> f99205i;

    /* compiled from: StandardAndroidSocketAdapter.kt */
    @Metadata
    /* renamed from: kf.l$a */
    /* loaded from: classes10.dex */
    public static final class C37526a {
        private C37526a() {
        }

        public /* synthetic */ C37526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ SocketAdapter m17633b(C37526a c37526a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c37526a.m17634a(str);
        }

        @Nullable
        /* renamed from: a */
        public final SocketAdapter m17634a(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(Intrinsics.m17064q(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.m17064q(packageName, ".OpenSSLSocketFactoryImpl"));
                Class<?> paramsClass = Class.forName(Intrinsics.m17064q(packageName, ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, paramsClass);
            } catch (Exception e) {
                C37357h.f98616a.m18318g().m18330l("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(@NotNull Class<? super SSLSocket> sslSocketClass, @NotNull Class<? super SSLSocketFactory> sslSocketFactoryClass, @NotNull Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f99204h = sslSocketFactoryClass;
        this.f99205i = paramClass;
    }
}
