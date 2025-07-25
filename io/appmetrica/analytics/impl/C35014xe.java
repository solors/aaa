package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.xe */
/* loaded from: classes9.dex */
public final class C35014xe implements ProtobufConverter {

    /* renamed from: a */
    public final C33993Je f95603a;

    /* renamed from: b */
    public final C34884se f95604b;

    public C35014xe() {
        this(new C33993Je(), new C34884se());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33895Fe fromModel(@NonNull C34962ve c34962ve) {
        C33895Fe c33895Fe = new C33895Fe();
        c33895Fe.f92837a = this.f95603a.fromModel(c34962ve.f95517a);
        c33895Fe.f92838b = new C33870Ee[c34962ve.f95518b.size()];
        int i = 0;
        for (C34936ue c34936ue : c34962ve.f95518b) {
            c33895Fe.f92838b[i] = this.f95604b.fromModel(c34936ue);
            i++;
        }
        return c33895Fe;
    }

    public C35014xe(C33993Je c33993Je, C34884se c34884se) {
        this.f95603a = c33993Je;
        this.f95604b = c34884se;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34962ve toModel(@NonNull C33895Fe c33895Fe) {
        C33969Ie model;
        ArrayList arrayList = new ArrayList(c33895Fe.f92838b.length);
        for (C33870Ee c33870Ee : c33895Fe.f92838b) {
            arrayList.add(this.f95604b.toModel(c33870Ee));
        }
        C33845De c33845De = c33895Fe.f92837a;
        if (c33845De == null) {
            model = this.f95603a.toModel(new C33845De());
        } else {
            model = this.f95603a.toModel(c33845De);
        }
        return new C34962ve(model, arrayList);
    }
}
