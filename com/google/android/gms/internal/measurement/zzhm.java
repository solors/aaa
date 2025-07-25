package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSetMultimap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzhm {
    public static final Supplier<ImmutableSetMultimap<String, String>> zza = Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzho
        @Override // com.google.common.base.Supplier
        public final Object get() {
            ImmutableSetMultimap build;
            build = new ImmutableSetMultimap.Builder().build();
            return build;
        }
    });
}
