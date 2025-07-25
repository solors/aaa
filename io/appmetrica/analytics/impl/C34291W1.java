package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.W1 */
/* loaded from: classes9.dex */
public final class C34291W1 implements ProtobufConverter {

    /* renamed from: a */
    public final C33833D2 f93629a;

    public C34291W1() {
        this(new C33833D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34363Z1 fromModel(@NonNull C34267V1 c34267v1) {
        C34363Z1 c34363z1 = new C34363Z1();
        c34363z1.f93856a = new C34339Y1[c34267v1.f93590a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : c34267v1.f93590a) {
            C34339Y1[] c34339y1Arr = c34363z1.f93856a;
            C34339Y1 c34339y1 = new C34339Y1();
            c34339y1.f93791a = permissionState.name;
            c34339y1.f93792b = permissionState.granted;
            c34339y1Arr[i2] = c34339y1;
            i2++;
        }
        C33883F2 c33883f2 = c34267v1.f93591b;
        if (c33883f2 != null) {
            c34363z1.f93857b = this.f93629a.fromModel(c33883f2);
        }
        c34363z1.f93858c = new String[c34267v1.f93592c.size()];
        for (String str : c34267v1.f93592c) {
            c34363z1.f93858c[i] = str;
            i++;
        }
        return c34363z1;
    }

    public C34291W1(C33833D2 c33833d2) {
        this.f93629a = c33833d2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34267V1 toModel(@NonNull C34363Z1 c34363z1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C34339Y1[] c34339y1Arr = c34363z1.f93856a;
            if (i2 >= c34339y1Arr.length) {
                break;
            }
            C34339Y1 c34339y1 = c34339y1Arr[i2];
            arrayList.add(new PermissionState(c34339y1.f93791a, c34339y1.f93792b));
            i2++;
        }
        C34315X1 c34315x1 = c34363z1.f93857b;
        C33883F2 model = c34315x1 != null ? this.f93629a.toModel(c34315x1) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c34363z1.f93858c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new C34267V1(arrayList, model, arrayList2);
            }
        }
    }
}
