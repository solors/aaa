package p1030wd;

import kotlin.Metadata;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046ce.PlatformThreadLocalRandom;
import p1015vd.JDK7PlatformImplementations;

@Metadata
/* renamed from: wd.a */
/* loaded from: classes7.dex */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK8PlatformImplementations.kt */
    @Metadata
    /* renamed from: wd.a$a */
    /* loaded from: classes7.dex */
    public static final class C44654a {
        @NotNull

        /* renamed from: a */
        public static final C44654a f117170a = new C44654a();
        @Nullable

        /* renamed from: b */
        public static final Integer f117171b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                wd.a$a r0 = new wd.a$a
                r0.<init>()
                p1030wd.JDK8PlatformImplementations.C44654a.f117170a = r0
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
                p1030wd.JDK8PlatformImplementations.C44654a.f117171b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1030wd.JDK8PlatformImplementations.C44654a.<clinit>():void");
        }

        private C44654a() {
        }
    }

    /* renamed from: c */
    private final boolean m2115c(int i) {
        Integer num = C44654a.f117171b;
        if (num != null && num.intValue() < i) {
            return false;
        }
        return true;
    }

    @Override // p1001ud.PlatformImplementations
    @NotNull
    /* renamed from: b */
    public Random mo2116b() {
        if (m2115c(34)) {
            return new PlatformThreadLocalRandom();
        }
        return super.mo2116b();
    }
}
