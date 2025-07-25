package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedSQLiteStatement.kt */
@Metadata
/* loaded from: classes2.dex */
public final class SharedSQLiteStatement$stmt$2 extends Lambda implements Functions<SupportSQLiteStatement> {
    final /* synthetic */ SharedSQLiteStatement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.this$0 = sharedSQLiteStatement;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final SupportSQLiteStatement invoke() {
        SupportSQLiteStatement createNewStatement;
        createNewStatement = this.this$0.createNewStatement();
        return createNewStatement;
    }
}
