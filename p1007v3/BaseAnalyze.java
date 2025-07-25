package p1007v3;

import androidx.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p1020w3.C44574a;

/* renamed from: v3.e */
/* loaded from: classes6.dex */
public abstract class BaseAnalyze implements IAnalyze {

    /* renamed from: a */
    private boolean f116842a;

    /* renamed from: b */
    private final List<C44574a> f116843b = new LinkedList();

    @Override // p1007v3.IAnalyze
    public void init() {
        while (!this.f116843b.isEmpty()) {
            mo2691b(this.f116843b.remove(0));
        }
        this.f116842a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo2697j(@NonNull C44574a c44574a) {
        if (!this.f116842a) {
            this.f116843b.add(c44574a);
            return false;
        }
        return true;
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: a */
    public void mo2692a(@NonNull String str) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: b */
    public void mo2691b(@NonNull C44574a c44574a) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: c */
    public void mo2690c(String str) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: d */
    public void mo2689d(@NonNull String str) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: e */
    public void mo2688e(Map<String, String> map) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: h */
    public void mo2685h(String str) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: f */
    public void mo2687f(String str, String str2) {
    }

    @Override // p1007v3.IAnalyze
    /* renamed from: g */
    public void mo2686g(String str, String str2) {
    }
}
