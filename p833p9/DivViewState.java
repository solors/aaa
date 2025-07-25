package p833p9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;

/* renamed from: p9.g */
/* loaded from: classes8.dex */
public class DivViewState {

    /* renamed from: a */
    private final long f103165a;
    @NonNull

    /* renamed from: b */
    private final Map<String, InterfaceC39292a> f103166b;

    /* compiled from: DivViewState.java */
    /* renamed from: p9.g$a */
    /* loaded from: classes8.dex */
    interface InterfaceC39292a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DivViewState(long j) {
        this(j, new ArrayMap());
    }

    @Nullable
    /* renamed from: a */
    public <T extends InterfaceC39292a> T m13225a(@NonNull String str) {
        return (T) this.f103166b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public Map<String, InterfaceC39292a> m13224b() {
        return this.f103166b;
    }

    /* renamed from: c */
    public long m13223c() {
        return this.f103165a;
    }

    /* renamed from: d */
    public <T extends InterfaceC39292a> void m13222d(@NonNull String str, @NonNull T t) {
        this.f103166b.put(str, t);
    }

    /* renamed from: e */
    public void m13221e() {
        this.f103166b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DivViewState(long j, @NonNull Map<String, InterfaceC39292a> map) {
        this.f103165a = j;
        this.f103166b = map;
    }
}
