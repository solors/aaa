package p023b0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p707i0.Keyframe;

/* renamed from: b0.n */
/* loaded from: classes2.dex */
abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {

    /* renamed from: a */
    final List<Keyframe<V>> f1547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseAnimatableValue(V v) {
        this(Collections.singletonList(new Keyframe(v)));
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: b */
    public List<Keyframe<V>> mo103973b() {
        return this.f1547a;
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: c */
    public boolean mo103972c() {
        if (this.f1547a.isEmpty()) {
            return true;
        }
        if (this.f1547a.size() == 1 && this.f1547a.get(0).m23249h()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f1547a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f1547a.toArray()));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseAnimatableValue(List<Keyframe<V>> list) {
        this.f1547a = list;
    }
}
