package p1015vd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1001ud.PlatformImplementations;

@Metadata
/* renamed from: vd.a */
/* loaded from: classes7.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata
    /* renamed from: vd.a$a */
    /* loaded from: classes7.dex */
    public static final class C44567a {
        @NotNull

        /* renamed from: a */
        public static final C44567a f116975a = new C44567a();
        @Nullable

        /* renamed from: b */
        public static final Integer f116976b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                vd.a$a r0 = new vd.a$a
                r0.<init>()
                p1015vd.JDK7PlatformImplementations.C44567a.f116975a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p1015vd.JDK7PlatformImplementations.C44567a.f116976b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1015vd.JDK7PlatformImplementations.C44567a.<clinit>():void");
        }

        private C44567a() {
        }
    }

    /* renamed from: c */
    private final boolean m2376c(int i) {
        Integer num = C44567a.f116976b;
        if (num != null && num.intValue() < i) {
            return false;
        }
        return true;
    }

    @Override // p1001ud.PlatformImplementations
    /* renamed from: a */
    public void mo2377a(@NotNull Throwable cause, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (m2376c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo2377a(cause, exception);
        }
    }
}
