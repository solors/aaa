package lb;

import android.database.SQLException;
import androidx.annotation.AnyThread;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import lb.DatabaseOpenHelper;
import org.jetbrains.annotations.NotNull;
import p744jb.DivDataRepository;
import p744jb.DivStorageErrorException;
import p804nd.ExceptionsH;

/* compiled from: StorageStatementExecutor.kt */
@Metadata
/* renamed from: lb.m */
/* loaded from: classes8.dex */
public final class C38141m {
    @NotNull

    /* renamed from: a */
    private final Functions<DatabaseOpenHelper.InterfaceC38137b> f100887a;

    /* compiled from: StorageStatementExecutor.kt */
    @Metadata
    /* renamed from: lb.m$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C38142a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.EnumC37318a.values().length];
            try {
                iArr[DivDataRepository.EnumC37318a.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.EnumC37318a.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38141m(@NotNull Functions<? extends DatabaseOpenHelper.InterfaceC38137b> dbProvider) {
        Intrinsics.checkNotNullParameter(dbProvider, "dbProvider");
        this.f100887a = dbProvider;
    }

    /* renamed from: c */
    private static final void m15561c(C37609n0<StorageStatement> c37609n0, C37607l0 c37607l0, StorageStatement[] storageStatementArr, DivDataRepository.EnumC37318a enumC37318a, C38141m c38141m, List<DivStorageErrorException> list, StorageStatementExecutor storageStatementExecutor, StorageStatement storageStatement) {
        try {
            storageStatement.mo15551a(storageStatementExecutor);
        } catch (SQLException e) {
            m15560d(c37609n0, c37607l0, storageStatementArr, enumC37318a, c38141m, list, e);
        } catch (IllegalStateException e2) {
            m15560d(c37609n0, c37607l0, storageStatementArr, enumC37318a, c38141m, list, e2);
        }
    }

    /* renamed from: d */
    private static final void m15560d(C37609n0<StorageStatement> c37609n0, C37607l0 c37607l0, StorageStatement[] storageStatementArr, DivDataRepository.EnumC37318a enumC37318a, C38141m c38141m, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + c37609n0.f99327b + "' (" + c37607l0.f99325b + " out " + storageStatementArr.length + ')';
        int i = C38142a.$EnumSwitchMapping$0[enumC37318a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                list.add(new DivStorageErrorException(str, exc, null, 4, null));
                return;
            }
            return;
        }
        c38141m.m15559e(str, exc);
        throw new ExceptionsH();
    }

    /* renamed from: e */
    private final Void m15559e(String str, Exception exc) throws SQLException {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r20 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r20 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, lb.l] */
    @androidx.annotation.AnyThread
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final lb.ExecutionResult m15563a(@org.jetbrains.annotations.NotNull p744jb.DivDataRepository.EnumC37318a r22, @org.jetbrains.annotations.NotNull lb.StorageStatement... r23) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.C38141m.m15563a(jb.a$a, lb.l[]):lb.f");
    }

    @AnyThread
    @NotNull
    /* renamed from: b */
    public final ExecutionResult m15562b(@NotNull StorageStatement... statements) throws SQLException {
        Intrinsics.checkNotNullParameter(statements, "statements");
        return m15563a(DivDataRepository.EnumC37318a.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(statements, statements.length));
    }
}
