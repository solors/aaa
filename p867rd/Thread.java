package p867rd;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: rd.a */
/* loaded from: classes7.dex */
public final class Thread {

    /* compiled from: Thread.kt */
    @Metadata
    /* renamed from: rd.a$a */
    /* loaded from: classes7.dex */
    public static final class C39476a extends java.lang.Thread {

        /* renamed from: b */
        final /* synthetic */ Functions<Unit> f103797b;

        C39476a(Functions<Unit> functions) {
            this.f103797b = functions;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f103797b.invoke();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final java.lang.Thread m12523a(boolean z, boolean z2, @Nullable ClassLoader classLoader, @Nullable String str, int i, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C39476a c39476a = new C39476a(block);
        if (z2) {
            c39476a.setDaemon(true);
        }
        if (i > 0) {
            c39476a.setPriority(i);
        }
        if (str != null) {
            c39476a.setName(str);
        }
        if (classLoader != null) {
            c39476a.setContextClassLoader(classLoader);
        }
        if (z) {
            c39476a.start();
        }
        return c39476a;
    }

    /* renamed from: b */
    public static /* synthetic */ java.lang.Thread m12522b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Functions functions, int i2, Object obj) {
        ClassLoader classLoader2;
        String str2;
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            classLoader2 = null;
        } else {
            classLoader2 = classLoader;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m12523a(z3, z4, classLoader2, str2, i, functions);
    }
}
