package mc;

import ae.InterfaceC0039e;
import com.ironsource.C20517nb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseInsensitiveMap.kt */
@Metadata
/* renamed from: mc.o */
/* loaded from: classes9.dex */
final class C38272o<Key, Value> implements Map.Entry<Key, Value>, InterfaceC0039e.InterfaceC0040a {

    /* renamed from: b */
    private final Key f101150b;

    /* renamed from: c */
    private Value f101151c;

    public C38272o(Key key, Value value) {
        this.f101150b = key;
        this.f101151c = value;
    }

    /* renamed from: a */
    public void m15221a(Value value) {
        this.f101151c = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Intrinsics.m17075f(entry.getKey(), getKey()) || !Intrinsics.m17075f(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.f101150b;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.f101151c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        Intrinsics.m17074g(key);
        int hashCode = key.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Value value = getValue();
        Intrinsics.m17074g(value);
        return hashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        m15221a(value);
        return getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(C20517nb.f52173T);
        sb2.append(getValue());
        return sb2.toString();
    }
}
