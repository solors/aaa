package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes4.dex */
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        /* synthetic */ ToStringHelper(Object obj, zzai zzaiVar) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public ToStringHelper add(@NonNull String str, @Nullable Object obj) {
            Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            this.zza.add(str + "=" + valueOf);
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.zzb.getClass().getSimpleName());
            sb2.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb2.append((String) this.zza.get(i));
                if (i < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!equal(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        } else if (bundle == bundle2) {
            return true;
        } else {
            return false;
        }
    }

    @KeepForSdk
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static int hashCode(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@NonNull Object obj) {
        return new ToStringHelper(obj, null);
    }
}
