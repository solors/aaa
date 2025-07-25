package p744jb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: jb.f */
/* loaded from: classes8.dex */
public final class DivStorageErrorException extends StorageException {
    @NotNull

    /* renamed from: c */
    public static final C37326a f98541c = new C37326a(null);

    /* compiled from: DivStorageErrorException.kt */
    @Metadata
    /* renamed from: jb.f$a */
    /* loaded from: classes8.dex */
    public static final class C37326a {
        private C37326a() {
        }

        public /* synthetic */ C37326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
            if (r3 == null) goto L8;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m18424b(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                if (r4 == 0) goto L1d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = " Card id: "
                r3.append(r1)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L1f
            L1d:
                java.lang.String r3 = ""
            L1f:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p744jb.DivStorageErrorException.C37326a.m18424b(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageErrorException(@NotNull String errorMessage, @Nullable Throwable th, @Nullable String str) {
        super(f98541c.m18424b(errorMessage, str), th, str);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
