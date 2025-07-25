package p833p9;

import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.DivDataTag;
import p718ib.DivStateCache;

@AnyThread
@Metadata
/* renamed from: p9.c */
/* loaded from: classes8.dex */
public final class DivStateManager {
    @NotNull

    /* renamed from: a */
    private final DivStateCache f103157a;
    @NotNull

    /* renamed from: b */
    private final TemporaryDivStateCache f103158b;
    @NotNull

    /* renamed from: c */
    private final ArrayMap<DivDataTag, DivViewState> f103159c;

    public DivStateManager(@NotNull DivStateCache cache, @NotNull TemporaryDivStateCache temporaryCache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f103157a = cache;
        this.f103158b = temporaryCache;
        this.f103159c = new ArrayMap<>();
    }

    @Nullable
    /* renamed from: a */
    public final DivViewState m13252a(@NotNull DivDataTag tag) {
        DivViewState divViewState;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.f103159c) {
            divViewState = this.f103159c.get(tag);
            if (divViewState == null) {
                String mo23038d = this.f103157a.mo23038d(tag.m676a());
                if (mo23038d != null) {
                    Intrinsics.checkNotNullExpressionValue(mo23038d, "getRootState(tag.id)");
                    divViewState = new DivViewState(Long.parseLong(mo23038d));
                } else {
                    divViewState = null;
                }
                this.f103159c.put(tag, divViewState);
            }
        }
        return divViewState;
    }

    /* renamed from: b */
    public final void m13251b(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.f103159c.clear();
            this.f103157a.clear();
            this.f103158b.m13217a();
            return;
        }
        for (DivDataTag divDataTag : tags) {
            this.f103159c.remove(divDataTag);
            this.f103157a.mo23040b(divDataTag.m676a());
            TemporaryDivStateCache temporaryDivStateCache = this.f103158b;
            String m676a = divDataTag.m676a();
            Intrinsics.checkNotNullExpressionValue(m676a, "tag.id");
            temporaryDivStateCache.m13213e(m676a);
        }
    }

    /* renamed from: c */
    public final void m13250c(@NotNull DivDataTag tag, long j, boolean z) {
        DivViewState divViewState;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!Intrinsics.m17075f(DivDataTag.f118797b, tag)) {
            synchronized (this.f103159c) {
                DivViewState m13252a = m13252a(tag);
                ArrayMap<DivDataTag, DivViewState> arrayMap = this.f103159c;
                if (m13252a == null) {
                    divViewState = new DivViewState(j);
                } else {
                    divViewState = new DivViewState(j, m13252a.m13224b());
                }
                arrayMap.put(tag, divViewState);
                TemporaryDivStateCache temporaryDivStateCache = this.f103158b;
                String m676a = tag.m676a();
                Intrinsics.checkNotNullExpressionValue(m676a, "tag.id");
                temporaryDivStateCache.m13215c(m676a, String.valueOf(j));
                if (!z) {
                    this.f103157a.mo23037e(tag.m676a(), String.valueOf(j));
                }
                Unit unit = Unit.f99208a;
            }
        }
    }

    /* renamed from: d */
    public final void m13249d(@NotNull String cardId, @NotNull DivStatePath divStatePath, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(divStatePath, "divStatePath");
        String m13242g = divStatePath.m13242g();
        String m13244e = divStatePath.m13244e();
        if (m13242g != null && m13244e != null) {
            synchronized (this.f103159c) {
                this.f103158b.m13214d(cardId, m13242g, m13244e);
                if (!z) {
                    this.f103157a.mo23039c(cardId, m13242g, m13244e);
                }
                Unit unit = Unit.f99208a;
            }
        }
    }
}
