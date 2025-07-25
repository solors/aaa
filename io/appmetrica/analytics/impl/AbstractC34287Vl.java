package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.Vl */
/* loaded from: classes9.dex */
public abstract class AbstractC34287Vl {
    /* renamed from: a */
    public final ProtobufStateStorage<Object> m22150a(@NonNull Context context) {
        return mo22149a(context, mo22147c(context));
    }

    @NonNull
    /* renamed from: a */
    public abstract ProtobufStateStorage<Object> mo22149a(@NonNull Context context, @NonNull IBinaryDataHelper iBinaryDataHelper);

    /* renamed from: b */
    public final ProtobufStateStorage<Object> m22148b(@NonNull Context context) {
        return mo22149a(context, mo22146d(context));
    }

    @NonNull
    /* renamed from: c */
    public abstract IBinaryDataHelper mo22147c(@NonNull Context context);

    @NonNull
    /* renamed from: d */
    public abstract IBinaryDataHelper mo22146d(@NonNull Context context);
}
