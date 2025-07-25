package com.amazon.p047a.p048a.p071o.p076d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.a.a.o.d.c */
/* loaded from: classes2.dex */
public class Verifier implements Iterable<VerificationError> {

    /* renamed from: a */
    private Map<VerificationErrorCode, VerificationError> f2779a = new HashMap();

    /* renamed from: a */
    public <T> Verifier m102809a(T t, T t2, VerificationErrorCode verificationErrorCode) {
        if (!m102810a(t, t2)) {
            this.f2779a.put(verificationErrorCode, new VerificationError(verificationErrorCode, "'" + t + "' != '" + t2 + "'"));
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<VerificationError> iterator() {
        return this.f2779a.values().iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Verifier:");
        Iterator<VerificationError> it = this.f2779a.values().iterator();
        while (it.hasNext()) {
            sb2.append("\n\t" + it.next());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private boolean m102810a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public <T extends Comparable<T>> Verifier m102812a(T t, T t2, VerificationErrorCode verificationErrorCode) {
        if (t.compareTo(t2) <= 0) {
            this.f2779a.put(verificationErrorCode, new VerificationError(verificationErrorCode, "'" + t + "' <= '" + t2 + "'"));
        }
        return this;
    }

    /* renamed from: a */
    public Verifier m102811a(Exception exc, VerificationErrorCode verificationErrorCode) {
        this.f2779a.put(verificationErrorCode, new VerificationError(verificationErrorCode, "Exception: " + exc));
        return this;
    }

    /* renamed from: a */
    public boolean m102814a() {
        return !this.f2779a.isEmpty();
    }

    /* renamed from: a */
    public boolean m102813a(VerificationErrorCode verificationErrorCode) {
        return this.f2779a.containsKey(verificationErrorCode);
    }
}
