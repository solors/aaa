package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC33936H5;
import io.appmetrica.analytics.impl.AbstractC35018xi;
import io.appmetrica.analytics.impl.C33934H3;
import io.appmetrica.analytics.impl.C33958I3;
import io.appmetrica.analytics.impl.C33960I5;
import io.appmetrica.analytics.impl.C34450ca;
import io.appmetrica.analytics.impl.C35040ye;
import io.appmetrica.analytics.impl.C35066ze;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    private boolean f95712a = false;

    /* renamed from: b */
    private final UriMatcher f95713b = new UriMatcher(-1);

    /* renamed from: a */
    private void m20692a(C33960I5 c33960i5, ContentValues contentValues) {
        Context applicationContext;
        Context context = getContext();
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        if (applicationContext != null) {
            try {
                Object invoke = c33960i5.f93009a.invoke(contentValues);
                if (invoke != null) {
                    c33960i5.f93011c.m21885b(applicationContext);
                    if (((Boolean) c33960i5.f93010b.invoke(invoke)).booleanValue()) {
                        AbstractC35018xi.m20774a("Successfully saved " + c33960i5.f93012d, new Object[0]);
                    } else {
                        AbstractC35018xi.m20774a("Did not save " + c33960i5.f93012d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger importantLogger = ImportantLogger.INSTANCE;
                importantLogger.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC35018xi.m20774a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f95712a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            if (this.f95712a) {
                return null;
            }
            if (contentValues != null) {
                int match = this.f95713b.match(uri);
                if (match != 1) {
                    if (match != 2) {
                        AbstractC35018xi.m20774a("Bad content provider uri.", new Object[0]);
                    } else {
                        m20692a(new C33960I5(new C33934H3(), new C33958I3(), C34450ca.f94086d, "clids"), contentValues);
                    }
                } else {
                    m20692a(new C33960I5(new C35040ye(), new C35066ze(), C34450ca.f94086d, "preload info"), contentValues);
                }
            }
            CountDownLatch countDownLatch = AbstractC33936H5.f92946a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context applicationContext;
        String str;
        Context context = getContext();
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        if (applicationContext != null) {
            str = applicationContext.getPackageName();
        } else {
            str = "";
        }
        String str2 = str + ".appmetrica.preloadinfo.retail";
        this.f95713b.addURI(str2, "preloadinfo", 1);
        this.f95713b.addURI(str2, "clids", 2);
        AbstractC33936H5.f92946a = new CountDownLatch(1);
        AbstractC33936H5.f92947b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC35018xi.m20774a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC35018xi.m20774a("Updating is not supported", new Object[0]);
        return -1;
    }
}
