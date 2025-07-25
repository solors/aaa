package androidx.work.impl.utils;

import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RawQueries.kt */
@Metadata
/* loaded from: classes2.dex */
public final class RawQueries {
    private static final void bindings(StringBuilder sb2, int i) {
        String m17521z0;
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        m17521z0 = _Collections.m17521z0(arrayList, ",", null, null, 0, null, null, 62, null);
        sb2.append(m17521z0);
    }

    @NotNull
    public static final SupportSQLiteQuery toRawQuery(@NotNull WorkQuery workQuery) {
        int m17154x;
        int m17154x2;
        Intrinsics.checkNotNullParameter(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        Intrinsics.checkNotNullExpressionValue(states, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            List<WorkInfo.State> states2 = workQuery.getStates();
            Intrinsics.checkNotNullExpressionValue(states2, "states");
            List<WorkInfo.State> list = states2;
            m17154x2 = C37566w.m17154x(list, 10);
            ArrayList arrayList2 = new ArrayList(m17154x2);
            for (WorkInfo.State state : list) {
                Intrinsics.m17074g(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            sb2.append(" WHERE state IN (");
            bindings(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = workQuery.getIds();
        Intrinsics.checkNotNullExpressionValue(ids, "ids");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = workQuery.getIds();
            Intrinsics.checkNotNullExpressionValue(ids2, "ids");
            List<UUID> list2 = ids2;
            m17154x = C37566w.m17154x(list2, 10);
            ArrayList arrayList3 = new ArrayList(m17154x);
            for (UUID uuid : list2) {
                arrayList3.add(uuid.toString());
            }
            sb2.append(str2 + " id IN (");
            bindings(sb2, workQuery.getIds().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = workQuery.getTags();
        Intrinsics.checkNotNullExpressionValue(tags, "tags");
        if (!tags.isEmpty()) {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb2, workQuery.getTags().size());
            sb2.append("))");
            List<String> tags2 = workQuery.getTags();
            Intrinsics.checkNotNullExpressionValue(tags2, "tags");
            arrayList.addAll(tags2);
        } else {
            str = str2;
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        Intrinsics.checkNotNullExpressionValue(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb2, workQuery.getUniqueWorkNames().size());
            sb2.append("))");
            List<String> uniqueWorkNames2 = workQuery.getUniqueWorkNames();
            Intrinsics.checkNotNullExpressionValue(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb2.append(";");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return new SimpleSQLiteQuery(sb3, arrayList.toArray(new Object[0]));
    }
}
