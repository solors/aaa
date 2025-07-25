package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.r0 */
/* loaded from: classes7.dex */
public class SpreadBuilder {

    /* renamed from: a */
    private final ArrayList<Object> f99332a;

    public SpreadBuilder(int i) {
        this.f99332a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void m17015a(Object obj) {
        this.f99332a.add(obj);
    }

    /* renamed from: b */
    public void m17014b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f99332a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f99332a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f99332a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f99332a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f99332a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m17013c() {
        return this.f99332a.size();
    }

    /* renamed from: d */
    public Object[] m17012d(Object[] objArr) {
        return this.f99332a.toArray(objArr);
    }
}
