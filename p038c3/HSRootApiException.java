package p038c3;

/* renamed from: c3.a */
/* loaded from: classes5.dex */
public class HSRootApiException extends RuntimeException {

    /* renamed from: b */
    public final String f1835b;

    /* renamed from: c */
    public final Exception f1836c;

    /* renamed from: d */
    public final InterfaceC3418a f1837d;

    /* compiled from: HSRootApiException.java */
    /* renamed from: c3.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC3418a {
    }

    private HSRootApiException(Exception exc, InterfaceC3418a interfaceC3418a, String str) {
        super(str, exc);
        this.f1836c = exc;
        this.f1837d = interfaceC3418a;
        this.f1835b = str;
    }

    /* renamed from: a */
    public static HSRootApiException m103683a(Exception exc, InterfaceC3418a interfaceC3418a) {
        return m103682b(exc, interfaceC3418a, null);
    }

    /* renamed from: b */
    public static HSRootApiException m103682b(Exception exc, InterfaceC3418a interfaceC3418a, String str) {
        if (exc instanceof HSRootApiException) {
            HSRootApiException hSRootApiException = (HSRootApiException) exc;
            Exception exc2 = hSRootApiException.f1836c;
            if (interfaceC3418a == null) {
                interfaceC3418a = hSRootApiException.f1837d;
            }
            if (str == null) {
                str = hSRootApiException.f1835b;
            }
            exc = exc2;
        } else if (interfaceC3418a == null) {
            interfaceC3418a = UnexpectedException.GENERIC;
        }
        return new HSRootApiException(exc, interfaceC3418a, str);
    }
}
