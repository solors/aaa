package com.appsflyer;

import com.appsflyer.internal.AFg1bSDK;
import com.appsflyer.internal.AFg1cSDK;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MutableCollections;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.C38502k;
import p804nd.InterfaceC38501j;

@Metadata
/* loaded from: classes2.dex */
public final class AFLogger extends AFg1cSDK {
    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();
    @NotNull
    private static final InterfaceC38501j values = C38502k.m14557a(C62189.AFKeystoreWrapper);
    @NotNull
    private static final InterfaceC38501j AFInAppEventParameterName = C38502k.m14557a(C62165.AFInAppEventType);

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$1 */
    /* loaded from: classes2.dex */
    static final class C62111 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62111(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$valueOf = str;
            this.$values = z;
        }

        public final void AFInAppEventType(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.mo92129i(this.$AFInAppEventType, this.$valueOf, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFInAppEventType(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$10 */
    /* loaded from: classes2.dex */
    static final class C621210 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C621210(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$valueOf = str;
            this.$values = z;
        }

        public final void AFInAppEventType(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.mo92128v(this.$AFInAppEventType, this.$valueOf, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFInAppEventType(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$2 */
    /* loaded from: classes2.dex */
    static final class C62132 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62132(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventParameterName = z;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.mo92131d(this.$AFInAppEventType, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFInAppEventParameterName(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$3 */
    /* loaded from: classes2.dex */
    static final class C62143 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventParameterName;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62143(AFg1bSDK aFg1bSDK, String str) {
            super(1);
            this.$AFInAppEventParameterName = aFg1bSDK;
            this.$AFKeystoreWrapper = str;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.force(this.$AFInAppEventParameterName, this.$AFKeystoreWrapper);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFInAppEventParameterName(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$4 */
    /* loaded from: classes2.dex */
    static final class C62154 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ String $AFInAppEventParameterName;
        private /* synthetic */ Throwable $AFInAppEventType;
        private /* synthetic */ boolean $AFKeystoreWrapper;

        /* renamed from: $e */
        private /* synthetic */ boolean f12926$e;
        private /* synthetic */ boolean $registerClient;
        private /* synthetic */ boolean $valueOf;
        private /* synthetic */ AFg1bSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62154(AFg1bSDK aFg1bSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
            super(1);
            this.$values = aFg1bSDK;
            this.$AFInAppEventParameterName = str;
            this.$AFInAppEventType = th;
            this.$AFKeystoreWrapper = z;
            this.$valueOf = z2;
            this.$registerClient = z3;
            this.f12926$e = z4;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.mo92130e(this.$values, this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$AFKeystoreWrapper, this.$valueOf, this.$registerClient, this.f12926$e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFInAppEventParameterName(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$5 */
    /* loaded from: classes2.dex */
    static final class C62165 extends Lambda implements Functions<ExecutorService> {
        public static final C62165 AFInAppEventType = new C62165();

        C62165() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: AFInAppEventParameterName */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$7 */
    /* loaded from: classes2.dex */
    static final class C62177 extends Lambda implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ AFg1bSDK $valueOf;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C62177(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$valueOf = aFg1bSDK;
            this.$values = str;
            this.$AFInAppEventType = z;
        }

        public final void AFKeystoreWrapper(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.mo92127w(this.$valueOf, this.$values, this.$AFInAppEventType);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1cSDK aFg1cSDK) {
            AFKeystoreWrapper(aFg1cSDK);
            return Unit.f99208a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$9 */
    /* loaded from: classes2.dex */
    static final class C62189 extends Lambda implements Functions<Set<AFg1cSDK>> {
        public static final C62189 AFKeystoreWrapper = new C62189();

        C62189() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: AFInAppEventParameterName */
        public final Set<AFg1cSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata
    /* loaded from: classes2.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private final int AFInAppEventType;

        LogLevel(int i) {
            this.AFInAppEventType = i;
        }

        public final int getLevel() {
            return this.AFInAppEventType;
        }
    }

    private AFLogger() {
    }

    public static final void AFKeystoreWrapper(AFg1cSDK[] aFg1cSDKArr) {
        Set m17345G0;
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        InterfaceC38501j interfaceC38501j = values;
        Object value = interfaceC38501j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC38501j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            m17345G0 = _Arrays.m17345G0(aFg1cSDKArr);
            ((Set) value2).removeAll(m17345G0);
            Unit unit = Unit.f99208a;
        }
    }

    public static final void afDebugLog(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92131d(AFg1bSDK.OTHER, str, z);
    }

    public static final void afErrorLog(@NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFg1cSDK.e$default(INSTANCE, AFg1bSDK.OTHER, str, th, z, z2, z3, false, 64, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void afErrorLogForExcManagerOnly(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11) {
        /*
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            if (r10 == 0) goto Lf
            boolean r2 = kotlin.text.C37686h.m16727B(r10)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L14
            java.lang.String r10 = "null"
        L14:
            r2 = r10
            if (r11 != 0) goto L1e
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r10 = "Invoked with null Throwable"
            r11.<init>(r10)
        L1e:
            r3 = r11
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 64
            r9 = 0
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(java.lang.String, java.lang.Throwable):void");
    }

    public static final void afInfoLog(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92129i(AFg1bSDK.OTHER, str, z);
    }

    public static final void afLogForce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1bSDK.OTHER, str);
    }

    public static final void afRDLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92128v(AFg1bSDK.OTHER, str, true);
    }

    public static final void afVerboseLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92128v(AFg1bSDK.OTHER, str, false);
    }

    public static final void afWarnLog(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92127w(AFg1bSDK.OTHER, str, z);
    }

    public static final void valueOf(AFg1cSDK[] aFg1cSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        InterfaceC38501j interfaceC38501j = values;
        Object value = interfaceC38501j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC38501j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            MutableCollections.m17622F((Set) value2, aFg1cSDKArr);
            Unit unit = Unit.f99208a;
        }
    }

    public static final void values(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC38501j interfaceC38501j = values;
        Object value = interfaceC38501j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC38501j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            for (AFg1cSDK aFg1cSDK : (Set) value2) {
                function1.invoke(aFg1cSDK);
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: d */
    public final void mo92131d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C62132(aFg1bSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: e */
    public final void mo92130e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C62154(aFg1bSDK, str, th, z, z2, z3, z4)));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C62143(aFg1bSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: i */
    public final void mo92129i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C62111(aFg1bSDK, str, z)));
    }

    public final void registerClient(@NotNull final AFg1cSDK... aFg1cSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.valueOf(aFg1cSDKArr);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFg1cSDK... aFg1cSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFKeystoreWrapper(aFg1cSDKArr);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: v */
    public final void mo92128v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C621210(aFg1bSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: w */
    public final void mo92127w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new RunnableC6228a(new C62177(aFg1bSDK, str, z)));
    }

    public static final void afDebugLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92131d(AFg1bSDK.OTHER, str, true);
    }

    public static final void afInfoLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.mo92129i(AFg1bSDK.OTHER, str, true);
    }

    public static final void afWarnLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFg1cSDK.w$default(INSTANCE, AFg1bSDK.OTHER, str, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void afErrorLog(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11) {
        /*
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            if (r10 == 0) goto Lf
            boolean r2 = kotlin.text.C37686h.m16727B(r10)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L14
            java.lang.String r10 = "null"
        L14:
            r2 = r10
            if (r11 != 0) goto L1e
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r10 = "Invoked with null Throwable"
            r11.<init>(r10)
        L1e:
            r3 = r11
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 120(0x78, float:1.68E-43)
            r9 = 0
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.afErrorLog(java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void afErrorLogForExcManagerOnly(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11, boolean r12) {
        /*
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            r2 = 1
            if (r10 == 0) goto L10
            boolean r3 = kotlin.text.C37686h.m16727B(r10)
            if (r3 == 0) goto Le
            goto L10
        Le:
            r3 = 0
            goto L11
        L10:
            r3 = r2
        L11:
            if (r3 == 0) goto L15
            java.lang.String r10 = "null"
        L15:
            if (r11 != 0) goto L1e
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r3 = "Invoked with null Throwable"
            r11.<init>(r3)
        L1e:
            r3 = r11
            r4 = 0
            r5 = 0
            r6 = r12 ^ 1
            r7 = 0
            r8 = 64
            r9 = 0
            r2 = r10
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void afErrorLog(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11, boolean r12) {
        /*
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            if (r10 == 0) goto Lf
            boolean r2 = kotlin.text.C37686h.m16727B(r10)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L14
            java.lang.String r10 = "null"
        L14:
            r2 = r10
            if (r11 != 0) goto L1e
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r10 = "Invoked with null Throwable"
            r11.<init>(r10)
        L1e:
            r3 = r11
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 104(0x68, float:1.46E-43)
            r9 = 0
            r5 = r12
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.afErrorLog(java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void afErrorLog(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11, boolean r12, boolean r13) {
        /*
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            if (r10 == 0) goto Lf
            boolean r2 = kotlin.text.C37686h.m16727B(r10)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L14
            java.lang.String r10 = "null"
        L14:
            r2 = r10
            if (r11 != 0) goto L1e
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r10 = "Invoked with null Throwable"
            r11.<init>(r10)
        L1e:
            r3 = r11
            r4 = 0
            r7 = 0
            r8 = 72
            r9 = 0
            r5 = r12
            r6 = r13
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.afErrorLog(java.lang.String, java.lang.Throwable, boolean, boolean):void");
    }
}
