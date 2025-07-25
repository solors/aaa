package io.ktor.utils.p731io;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37735i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;
import p804nd.C38508r;
import p804nd.Result;
import p850qd.C39385c;

/* compiled from: ExceptionUtilsJvm.kt */
@Metadata
/* renamed from: io.ktor.utils.io.r */
/* loaded from: classes9.dex */
public final class C37231r {

    /* renamed from: a */
    private static final int f98318a = m18699d(Throwable.class, -1);
    @NotNull

    /* renamed from: b */
    private static final ReentrantReadWriteLock f98319b = new ReentrantReadWriteLock();
    @NotNull

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f98320c = new WeakHashMap<>();

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$a */
    /* loaded from: classes9.dex */
    public static final class C37232a extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f98321g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37232a(Constructor constructor) {
            super(1);
            this.f98321g = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Throwable invoke(@NotNull Throwable e) {
            Object m14549b;
            Intrinsics.checkNotNullParameter(e, "e");
            try {
                Result.C38506a c38506a = Result.f101870c;
                Object newInstance = this.f98321g.newInstance(e.getMessage(), e);
                Intrinsics.m17073h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                m14549b = Result.m14549b((Throwable) newInstance);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            return (Throwable) m14549b;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$b */
    /* loaded from: classes9.dex */
    public static final class C37233b extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f98322g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37233b(Constructor constructor) {
            super(1);
            this.f98322g = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Throwable invoke(@NotNull Throwable e) {
            Object m14549b;
            Intrinsics.checkNotNullParameter(e, "e");
            try {
                Result.C38506a c38506a = Result.f101870c;
                Object newInstance = this.f98322g.newInstance(e);
                Intrinsics.m17073h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                m14549b = Result.m14549b((Throwable) newInstance);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            return (Throwable) m14549b;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$c */
    /* loaded from: classes9.dex */
    public static final class C37234c extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f98323g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37234c(Constructor constructor) {
            super(1);
            this.f98323g = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Throwable invoke(@NotNull Throwable e) {
            Object m14549b;
            Intrinsics.checkNotNullParameter(e, "e");
            try {
                Result.C38506a c38506a = Result.f101870c;
                Object newInstance = this.f98323g.newInstance(e.getMessage());
                Intrinsics.m17073h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th = (Throwable) newInstance;
                th.initCause(e);
                m14549b = Result.m14549b(th);
            } catch (Throwable th2) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th2));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            return (Throwable) m14549b;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$d */
    /* loaded from: classes9.dex */
    public static final class C37235d extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f98324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37235d(Constructor constructor) {
            super(1);
            this.f98324g = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Throwable invoke(@NotNull Throwable e) {
            Object m14549b;
            Intrinsics.checkNotNullParameter(e, "e");
            try {
                Result.C38506a c38506a = Result.f101870c;
                Object newInstance = this.f98324g.newInstance(new Object[0]);
                Intrinsics.m17073h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th = (Throwable) newInstance;
                th.initCause(e);
                m14549b = Result.m14549b(th);
            } catch (Throwable th2) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th2));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            return (Throwable) m14549b;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$e */
    /* loaded from: classes9.dex */
    public static final class C37236e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m12778d;
            m12778d = C39385c.m12778d(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
            return m12778d;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$f */
    /* loaded from: classes9.dex */
    static final class C37237f extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C37237f f98325g = new C37237f();

        C37237f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Void invoke(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.r$g */
    /* loaded from: classes9.dex */
    static final class C37238g extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C37238g f98326g = new C37238g();

        C37238g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final Void invoke(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    /* renamed from: a */
    private static final Function1<Throwable, Throwable> m18702a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2 || !Intrinsics.m17075f(parameterTypes[0], String.class) || !Intrinsics.m17075f(parameterTypes[1], Throwable.class)) {
                    return null;
                }
                return new C37232a(constructor);
            }
            Class<?> cls = parameterTypes[0];
            if (Intrinsics.m17075f(cls, Throwable.class)) {
                return new C37233b(constructor);
            }
            if (!Intrinsics.m17075f(cls, String.class)) {
                return null;
            }
            return new C37234c(constructor);
        }
        return new C37235d(constructor);
    }

    /* renamed from: b */
    private static final int m18701b(Class<?> cls, int i) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
            int i2 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m18700c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m18701b(cls, i);
    }

    /* renamed from: d */
    private static final int m18699d(Class<?> cls, int i) {
        Integer m14549b;
        JvmClassMapping.m911c(cls);
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(Integer.valueOf(m18700c(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.m14544g(m14549b)) {
            m14549b = valueOf;
        }
        return ((Number) m14549b).intValue();
    }

    @Nullable
    /* renamed from: e */
    public static final <E extends Throwable> E m18698e(@NotNull E exception, @NotNull Throwable cause) {
        Object m14549b;
        List<Constructor> m17303w0;
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        ReentrantReadWriteLock.WriteLock writeLock;
        Function1<Throwable, Throwable> function1;
        int i2;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(cause, "cause");
        Object obj = null;
        if (exception instanceof InterfaceC37735i0) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(((InterfaceC37735i0) exception).mo16316a());
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (!Result.m14544g(m14549b)) {
                obj = m14549b;
            }
            return (E) obj;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f98319b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            Function1<Throwable, Throwable> function12 = f98320c.get(exception.getClass());
            if (function12 != null) {
                return (E) function12.invoke(exception);
            }
            int i3 = 0;
            if (f98318a != m18699d(exception.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i2 = reentrantReadWriteLock.getReadHoldCount();
                } else {
                    i2 = 0;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f98320c.put(exception.getClass(), C37237f.f98325g);
                    Unit unit = Unit.f99208a;
                    return null;
                } finally {
                    while (i3 < i) {
                        readLock.lock();
                        i3++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "exception.javaClass.constructors");
            m17303w0 = _Arrays.m17303w0(constructors, new C37236e());
            Function1<Throwable, Throwable> function13 = null;
            for (Constructor constructor : m17303w0) {
                Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
                function13 = m18702a(constructor);
                if (function13 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f98319b;
            readLock = reentrantReadWriteLock2.readLock();
            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock2.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i5 = 0; i5 < i; i5++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                AbstractMap abstractMap = f98320c;
                Class<?> cls = exception.getClass();
                if (function13 == null) {
                    function1 = C37238g.f98326g;
                } else {
                    function1 = function13;
                }
                abstractMap.put(cls, function1);
                Unit unit2 = Unit.f99208a;
                while (i3 < i) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
                if (function13 == null) {
                    return null;
                }
                return (E) function13.invoke(cause);
            } finally {
                while (i3 < i) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock2.unlock();
        }
    }
}
