package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes2.dex */
public final class AFj1xSDK {
    @NotNull
    final Intent valueOf;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1xSDK$1 */
    /* loaded from: classes2.dex */
    static final class C62701 extends Lambda implements Functions<Boolean> {
        private /* synthetic */ String $AFInAppEventType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62701(String str) {
            super(0);
            this.$AFInAppEventType = str;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: AFInAppEventType */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1xSDK.this.valueOf.hasExtra(this.$AFInAppEventType));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1xSDK$2 */
    /* loaded from: classes2.dex */
    static final class C62712 extends Lambda implements Functions<Intent> {
        private /* synthetic */ long $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62712(String str, long j) {
            super(0);
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventType = j;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: values */
        public final Intent invoke() {
            return AFj1xSDK.this.valueOf.putExtra(this.$AFKeystoreWrapper, this.$AFInAppEventType);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1xSDK$4 */
    /* loaded from: classes2.dex */
    public static final class C62724 extends Lambda implements Functions {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62724(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: AFInAppEventParameterName */
        public final Parcelable invoke() {
            return AFj1xSDK.this.valueOf.getParcelableExtra(this.$valueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1xSDK$5 */
    /* loaded from: classes2.dex */
    public static final class C62735 extends Lambda implements Functions<String> {
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62735(String str) {
            super(0);
            this.$AFKeystoreWrapper = str;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: AFInAppEventType */
        public final String invoke() {
            return AFj1xSDK.this.valueOf.getStringExtra(this.$AFKeystoreWrapper);
        }
    }

    public AFj1xSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.valueOf = intent;
    }

    public final boolean AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C62701 c62701 = new C62701(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to check presence of ");
        sb2.append(str);
        sb2.append(" extra from intent");
        Boolean bool = (Boolean) AFInAppEventType(c62701, sb2.toString(), Boolean.TRUE, true);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final <T> T AFInAppEventType(Functions<? extends T> functions, String str, T t, boolean z) {
        Object m14549b;
        boolean m17338N;
        boolean m17338N2;
        Object obj;
        synchronized (this.valueOf) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(functions.invoke());
                KClass[] kClassArr = {Reflection.m17042b(ConcurrentModificationException.class), Reflection.m17042b(ArrayIndexOutOfBoundsException.class)};
                Throwable m14546e = Result.m14546e(m14549b);
                if (m14546e != null) {
                    m17338N2 = _Arrays.m17338N(kClassArr, Reflection.m17042b(m14546e.getClass()));
                    if (m17338N2) {
                        if (z) {
                            obj = AFInAppEventType(functions, str, t, false);
                        } else {
                            AFLogger.afErrorLog(str, m14546e, false, false);
                            obj = t;
                        }
                        m14549b = (T) Result.m14549b(obj);
                    } else {
                        throw m14546e;
                    }
                }
                KClass[] kClassArr2 = {Reflection.m17042b(RuntimeException.class)};
                Throwable m14546e2 = Result.m14546e(m14549b);
                if (m14546e2 != null) {
                    m17338N = _Arrays.m17338N(kClassArr2, Reflection.m17042b(m14546e2.getClass()));
                    if (m17338N) {
                        AFLogger.afErrorLog(str, m14546e2, false, false);
                        m14549b = (T) Result.m14549b(t);
                    } else {
                        throw m14546e2;
                    }
                }
                C38508r.m14539b(m14549b);
            }
        }
        return (T) m14549b;
    }

    @Nullable
    public final String valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C62735 c62735 = new C62735(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to read ");
        sb2.append(str);
        sb2.append(" extra from intent");
        return (String) AFInAppEventType(c62735, sb2.toString(), null, true);
    }

    @Nullable
    public final Intent valueOf(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        C62712 c62712 = new C62712(str, j);
        StringBuilder sb2 = new StringBuilder("Error while trying to write ");
        sb2.append(str);
        sb2.append(" extra to intent");
        return (Intent) AFInAppEventType(c62712, sb2.toString(), null, true);
    }
}
