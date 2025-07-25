package p026b3;

/* renamed from: b3.c */
/* loaded from: classes5.dex */
public abstract class HSBaseNetwork implements HSNetwork {

    /* renamed from: a */
    private String f1555a;

    /* renamed from: b */
    private HTTPTransport f1556b;

    public HSBaseNetwork(HTTPTransport hTTPTransport, String str) {
        this.f1556b = hTTPTransport;
        this.f1555a = str;
    }

    @Override // p026b3.HSNetwork
    /* renamed from: a */
    public HSResponse mo103964a(HSRequestData hSRequestData) {
        return this.f1556b.mo103955a(mo103953b(hSRequestData));
    }

    /* renamed from: b */
    abstract HSRequest mo103953b(HSRequestData hSRequestData);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m103970c() {
        return this.f1555a;
    }
}
