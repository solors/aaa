package p1001ud;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C37619b;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ud.a */
/* loaded from: classes7.dex */
public class PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformImplementations.kt */
    @Metadata
    /* renamed from: ud.a$a */
    /* loaded from: classes7.dex */
    public static final class C44471a {
        @NotNull

        /* renamed from: a */
        public static final C44471a f116733a = new C44471a();
        @Nullable

        /* renamed from: b */
        public static final Method f116734b;
        @Nullable

        /* renamed from: c */
        public static final Method f116735c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[LOOP:0: B:3:0x0013->B:13:0x003d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[EDGE_INSN: B:24:0x0041->B:15:0x0041 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                ud.a$a r0 = new ud.a$a
                r0.<init>()
                p1001ud.PlatformImplementations.C44471a.f116733a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                kotlin.jvm.internal.Intrinsics.m17074g(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                r5 = 0
                if (r4 >= r2) goto L40
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.Intrinsics.m17075f(r7, r8)
                if (r7 == 0) goto L39
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                java.lang.Object r7 = kotlin.collections.C37551l.m17427t0(r7)
                boolean r7 = kotlin.jvm.internal.Intrinsics.m17075f(r7, r0)
                if (r7 == 0) goto L39
                r7 = 1
                goto L3a
            L39:
                r7 = r3
            L3a:
                if (r7 == 0) goto L3d
                goto L41
            L3d:
                int r4 = r4 + 1
                goto L13
            L40:
                r6 = r5
            L41:
                p1001ud.PlatformImplementations.C44471a.f116734b = r6
                int r0 = r1.length
            L44:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.Intrinsics.m17075f(r4, r6)
                if (r4 == 0) goto L56
                r5 = r2
                goto L59
            L56:
                int r3 = r3 + 1
                goto L44
            L59:
                p1001ud.PlatformImplementations.C44471a.f116735c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1001ud.PlatformImplementations.C44471a.<clinit>():void");
        }

        private C44471a() {
        }
    }

    /* renamed from: a */
    public void mo2377a(@NotNull Throwable cause, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C44471a.f116734b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    /* renamed from: b */
    public Random mo2116b() {
        return new C37619b();
    }
}
