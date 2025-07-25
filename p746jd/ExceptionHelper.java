package p746jd;

/* renamed from: jd.a */
/* loaded from: classes9.dex */
public final class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f98585a = new C37345a();

    /* renamed from: a */
    public static RuntimeException m18371a(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* compiled from: ExceptionHelper.java */
    /* renamed from: jd.a$a */
    /* loaded from: classes9.dex */
    static final class C37345a extends Throwable {
        C37345a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
