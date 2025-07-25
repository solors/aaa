package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x1 */
/* loaded from: classes6.dex */
public abstract class AbstractC19518x1 {

    /* renamed from: a */
    public final String f48862a;

    public AbstractC19518x1(String tableName, String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.f48862a = tableName;
        try {
            C19080R2.f47651a.m60751a(tableName, tableSchema);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public abstract Object mo59524a(ContentValues contentValues);

    /* renamed from: a */
    public final void m59593a(Object obj) {
        try {
            C19080R2.m60753a(this.f48862a, mo59523b(obj));
            Intrinsics.checkNotNullExpressionValue("x1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public abstract ContentValues mo59523b(Object obj);

    /* renamed from: b */
    public final void m59590b(Object obj, String str, String[] strArr) {
        try {
            C19080R2.m60748b(this.f48862a, mo59523b(obj), str, strArr);
            Intrinsics.checkNotNullExpressionValue("x1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m59592a(Object obj, String str, String[] strArr) {
        try {
            C19080R2.m60752a(this.f48862a, mo59523b(obj), str, strArr);
            Intrinsics.checkNotNullExpressionValue("x1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final Object m59589b(String str, String[] strArr) {
        try {
            List<ContentValues> m60747b = C19080R2.m60747b(this.f48862a, null, str, strArr, null, null, null, null);
            if (!m60747b.isEmpty()) {
                return mo59524a(m60747b.get(0));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ArrayList m59594a(AbstractC19518x1 abstractC19518x1, String str, String[] strArr, String str2, String str3, String str4, Integer num, int i) {
        String str5 = (i & 1) != 0 ? null : str;
        String[] strArr2 = (i & 2) != 0 ? null : strArr;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        String str8 = (i & 16) != 0 ? null : str4;
        Integer num2 = (i & 32) != 0 ? null : num;
        abstractC19518x1.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            List<ContentValues> m60747b = C19080R2.m60747b(abstractC19518x1.f48862a, null, str5, strArr2, str6, str7, str8, num2 != null ? num2.toString() : null);
            if (!m60747b.isEmpty()) {
                for (ContentValues contentValues : m60747b) {
                    arrayList.add(abstractC19518x1.mo59524a(contentValues));
                }
                return arrayList;
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static int m59595a(AbstractC19518x1 abstractC19518x1) {
        abstractC19518x1.getClass();
        try {
            return C19080R2.m60749a(abstractC19518x1.f48862a, null, null, null, null, null, null, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final int m59591a(String str, String[] strArr) {
        try {
            return C19080R2.m60750a(this.f48862a, str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
