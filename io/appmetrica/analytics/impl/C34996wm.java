package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wm */
/* loaded from: classes9.dex */
public final class C34996wm implements ProtobufConverter {

    /* renamed from: a */
    public final C33901Fk f95575a;

    public C34996wm() {
        this(new C33901Fk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34527f6 fromModel(@NonNull C34970vm c34970vm) {
        C34527f6 c34527f6 = new C34527f6();
        Integer num = c34970vm.f95529e;
        c34527f6.f94317e = num == null ? -1 : num.intValue();
        c34527f6.f94316d = c34970vm.f95528d;
        c34527f6.f94314b = c34970vm.f95526b;
        c34527f6.f94313a = c34970vm.f95525a;
        c34527f6.f94315c = c34970vm.f95527c;
        C33901Fk c33901Fk = this.f95575a;
        List<StackTraceElement> list = c34970vm.f95530f;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : list) {
            arrayList.add(new C33951Hk(stackTraceElement));
        }
        c34527f6.f94318f = c33901Fk.fromModel(arrayList);
        return c34527f6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34527f6 c34527f6 = (C34527f6) obj;
        throw new UnsupportedOperationException();
    }

    public C34996wm(C33901Fk c33901Fk) {
        this.f95575a = c33901Fk;
    }

    @NonNull
    /* renamed from: a */
    public final C34970vm m20811a(@NonNull C34527f6 c34527f6) {
        throw new UnsupportedOperationException();
    }
}
