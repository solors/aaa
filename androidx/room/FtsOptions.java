package androidx.room;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FtsOptions.kt */
@Metadata
/* loaded from: classes2.dex */
public final class FtsOptions {
    @NotNull
    public static final FtsOptions INSTANCE = new FtsOptions();
    @NotNull
    public static final String TOKENIZER_ICU = "icu";
    @NotNull
    public static final String TOKENIZER_PORTER = "porter";
    @NotNull
    public static final String TOKENIZER_SIMPLE = "simple";
    @RequiresApi(21)
    @NotNull
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* compiled from: FtsOptions.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum MatchInfo {
        FTS3,
        FTS4
    }

    /* compiled from: FtsOptions.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum Order {
        ASC,
        DESC
    }

    private FtsOptions() {
    }
}
