package sg.bigo.ads.common.p918h.p920b;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.p918h.C43681a;

/* renamed from: sg.bigo.ads.common.h.b.a */
/* loaded from: classes10.dex */
public class C43690a {

    /* renamed from: a */
    String f114376a;

    /* renamed from: b */
    C43681a f114377b;

    /* renamed from: c */
    RunnableC43693d f114378c;

    /* renamed from: d */
    float f114379d;

    /* renamed from: e */
    int f114380e;

    /* renamed from: f */
    String f114381f;

    public C43690a(@NonNull C43681a c43681a) {
        this.f114377b = c43681a;
        this.f114376a = c43681a.f114335a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m5197a(long j) {
        this.f114377b.f114342h = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m5196b(long j) {
        this.f114377b.f114340f = j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C43690a.class) {
            return false;
        }
        C43690a c43690a = (C43690a) obj;
        if (!this.f114376a.equals(c43690a.f114376a) || !this.f114377b.f114338d.equals(c43690a.f114377b.f114338d) || !this.f114377b.f114337c.equals(c43690a.f114377b.f114337c)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f114377b.toString();
    }
}
