package androidx.core.p017os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.os.ConfigurationCompat */
/* loaded from: classes.dex */
public final class ConfigurationCompat {

    @RequiresApi(24)
    /* renamed from: androidx.core.os.ConfigurationCompat$Api24Impl */
    /* loaded from: classes.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }
}
